/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import enums.EnumLexema;
import java.util.ArrayList;
import java.util.Scanner;

public class Analizador {

    String lexema; //Aqui guardaremos el lexema que se forma al analizar cada palabra
    int estado; //Guardamos los distintos estados a los que el lexema se puede mover
    int indice;// llevamos el control del indice de la palabra que estamos analizando
    String palabraLimpia;
    ArrayList<Lexema> arregloLexemas;
    ArrayList<Lexema> arregloErrores;
    Lexema lex;
    int contadorId, contadorEnteros, contadorLit, contadorCom, contadorSigEspe, contadorSimb, contadorPalabraReservada;

    public void iniciarAnalizador(String palabraEntrada) {
        inicializarVariables();
        palabraLimpia = getPalabraEntrada(palabraEntrada);
        analizarPalabra(palabraLimpia);

    }

    public void inicializarVariables() {
        lexema = "";
        estado = 0;
        indice = 0;
        palabraLimpia = "";
        arregloLexemas = new ArrayList<Lexema>();
        arregloErrores = new ArrayList<Lexema>();
        contadorId = 0;
        contadorEnteros = 0;
        contadorLit = 0;
        contadorCom = 0;
        contadorSigEspe = 0;
        contadorSimb = 0;
        contadorPalabraReservada=0;

    }

    public String getPalabraEntrada(String palabraEntrada) {
        //for para recorrer la palabra indice por indice y obtener cada caracter
        for (indice = 0; indice < palabraEntrada.length(); indice++) {
            //almacenamos el caracter de cada indice en letra
            char letra = palabraEntrada.charAt(indice);

            //Sentencia para elimiar caracteres extras que puedan venir en la palabra, como 
            //tab, retorno carro, salto de linea etc...
            switch (letra) {

                /*case '\r':
                case '\t':
                case '\n':
                case '\b':
                case '\f':*/
                //case ' ':
                //break;
                default:
                    //guardamos nuestra palabra sin caracteres extranos
                    palabraLimpia += letra;
            }
        }
        return palabraLimpia;
        //analizarPalabra(palabraLimpia);

    }

    public void analizarPalabra(String palabraLimpia) {

        for (indice = 0; indice < palabraLimpia.length(); indice++) {
            char letra = palabraLimpia.charAt(indice);

            switch (estado) {
                case 0:
                    if (Character.isSpaceChar(letra)) {
                        estado = 0;

                        //aqui verificamos si es un digito, si lo es lo enviamos al estado 1
                    } else if (Character.isDigit(letra)) {
                        System.out.println("Vino un numero '" + letra + "', me muevo al estado 1");
                        lexema = "" + letra;
                        estado = 1;

                        //si son comillas es un estado de aceptacion, lo enviamos al estado 
                    } else if ((letra == '"')) {
                        System.out.println("Vinieron comillas: '" + letra + "', me muevo al estado 2");
                        lexema = "" + letra;
                        //System.out.println("Lexema encontrado: " + lexema);
                        //contadorOpAr++;
                        //llenarArregloLexema(lexema, EnumLexema.LITERAL, contadorOpAr);

                        //indice--;
                        //lexema = "";
                        //estado = 0;
                        estado = 2;

                    } else if ((letra == '_') || Character.isLetter(letra)) {
                        System.out.println("Vino un guion bajo o una letra: '" + letra + "', me muevo al estado 3");
                        lexema = "" + letra;
                        estado = 3;

                        //si es digito
                    } else if (letra == '/') {
                        System.out.println("Vino una barra, posible comentario: '" + letra + "', me muevo al estado 5");
                        lexema = "" + letra;
                        estado = 5;

                        //si es letra
                    } else if (letra == '\n') {
                        System.out.println("Vino caracter especial: '" + letra + "', me muevo al estado 7");
                        lexema = "" + letra;
                        estado = 7;

                    } else if ((letra == '<')) {
                        System.out.println("simbolo especial");
                        estado = 8;
                    } else {
                        lexema = "" + letra;
                        System.out.println("Encontramos un error Lexico: '" + letra + "', regreso al estado 0");
                        llenarArregloErrores(lexema);
                        estado = 0;

                    }
                    break;

                //Estado de aceptacion
                case 1:
                    if (Character.isDigit(letra)) {
                        lexema += letra;
                        estado = 1;
                    } //Es un estado de aceptacion si vienen solo digitos
                    else if (Character.isSpaceChar(letra)) {
                        System.out.println("Lexema encontrado");
                        lexema += letra;
                        System.out.println(lexema);
                        contadorEnteros++;
                        llenarArregloLexema(lexema, EnumLexema.NUMERO_ENTERO, contadorEnteros);
                        indice--;
                        lexema = "";
                        estado = 0;
                    }
                    break;

                case 2:
                    System.out.println("Lexema encontrado: " + lexema);
                    contadorLit++;
                    llenarArregloLexema(lexema, EnumLexema.LITERAL, contadorLit);

                    indice--;
                    lexema = "";
                    estado = 0;

                    break;

                //tercer estado de aceptacion
                case 3:
                    if ((letra == '_') || (letra == '-') || Character.isDigit(letra) || Character.isLetter(letra)) {
                        System.out.println("Puedo crear un Id: '" + letra + "', voy al estado 4");
                        lexema += letra;
                        estado = 4;

                    } else {
                        System.out.println("Error Lexico: no vino el caracter que esperabamos ");
                        lexema += letra;
                        llenarArregloErrores(lexema);
                        lexema = "";
                        estado = 0;
                    }
                    break;

                //este es un estado de aceptacion si viene un digito seguido de uno o mas digitos
                //si viene un punto, se va a otro estado
                //aqui se puede generar un error
                case 4:
                    if ((letra == '_') || (letra == '-') || Character.isDigit(letra) || Character.isLetter(letra)) {
                        System.out.println("creando un Id: '" + letra + "', sigo en  4");
                        lexema += letra;
                        estado = 4;

                    } else if ((Character.isSpaceChar(letra)) || (letra =='\n') ){
                        System.out.println("Lexema encontrado");
                        //lexema += letra;
                        System.out.println(lexema);
                        
                        //llenarArregloLexema(lexema, EnumLexema.IDENTIFICADOR, contadorId);
                        if((lexema.equalsIgnoreCase("ESCRIBIR")) ){
                            contadorPalabraReservada++;
                            llenarArregloLexema(lexema, EnumLexema.PALABRA_RESERVADA, contadorPalabraReservada);
                        }else{
                            contadorId++;
                            llenarArregloLexema(lexema, EnumLexema.IDENTIFICADOR, contadorId);
                        }
                        indice--;
                        lexema = "";
                        estado = 0;
                    }
                    break;

                //Si viene un digito o una letra es un estado de aceptacion, de lo contrario es un error lexico
                case 5:
                    if (letra == '/') {
                        //System.out.println("Vino una letra o digito");
                        //System.out.println("moviendose al estado 7");
                        lexema += letra;
                        System.out.println(lexema);
                        //contadorCom++;
                        //llenarArregloLexema(lexema, EnumLexema.COMENTARIO, contadorCom);
                        //indice--;
                        //lexema= "";
                        //estado=0;
                        estado = 6;
                    } else {
                        System.out.println(letra);
                        System.out.println("Error lexico, caracter no valido");
                        lexema += letra;
                        System.out.println("error: " + lexema);
                        llenarArregloErrores(lexema);
                        //indice--;
                        lexema = "";
                        estado = 0;
                    }
                    break;

                //si viene un digito despues de un punto se pasa al estado 8
                //si viene un caracter diferente es un error
                case 6:
                    System.out.println("Lexema encontrado");
                    lexema += letra;
                    System.out.println(lexema);
                    contadorCom++;
                    llenarArregloLexema(lexema, EnumLexema.COMENTARIO, contadorCom);
                    indice--;
                    lexema = "";
                    estado = 0;

                    break;

                //si viene una letra o un digito seguido de una letra es un estado de aceptacion
                //si viene un caracter distinto es un error
                case 7:
                    System.out.println("Lexema encontrado: " + lexema);
                    contadorSigEspe++;
                    llenarArregloLexema(lexema, EnumLexema.ESPECIAL, contadorSigEspe);

                    indice--;
                    lexema = "";
                    estado = 0;

                    /*if (Character.isLetterOrDigit(letra)) {
                        //System.out.println("vino una letra o digito de nuevo");
                        //System.out.println("Sigo en el estado 7");
                        lexema += letra;
                        estado = 7;
                        //se evalua el estado de aceptacion
                    } else if (Character.isSpaceChar(letra)) {
                        System.out.println("Lexema encontrado");
                        System.out.println(lexema);
                        contadorId++;
                        llenarArregloLexema(lexema, EnumLexema.IDENTIFICADOR, contadorId);

                        indice--;
                        lexema = "";
                        estado = 0;
                        //error
                    } else {
                        System.out.println("Error lexico");
                        lexema += letra;
                        System.out.println("Lexema: " + lexema + " incorrecto");
                        llenarArregloErrores(lexema);
                        //indice--;
                        lexema = "";
                        estado = 0;
                    }*/
                    break;

                //si viene un digito o mas despues de un punto es un estado de aceptacion
                //si viene un caracter distinto a un digito es un error
                case 8:

                    System.out.println("Lexema encontrado: " + lexema);
                    contadorSimb++;
                    llenarArregloLexema(lexema, EnumLexema.SIMBOLOS, contadorSimb);

                    indice--;
                    lexema = "";
                    estado = 0;
                    /*if (Character.isDigit(letra)) {
                        //System.out.println("vino un digito");
                        //System.out.println("Sigo en el estado 8");
                        lexema += letra;
                        estado = 8;
                    } else if (Character.isSpaceChar(letra)) {
                        System.out.println("Lexema encontrado");
                        contadorDec++;
                        llenarArregloLexema(lexema, EnumLexema.DECIMAL, contadorDec);

                        indice--;
                        lexema = "";
                        estado = 0;

                    } else {
                        System.out.println("Error lexico");
                        lexema += letra;
                        //System.out.println(lexema);
                        llenarArregloErrores(lexema);
                        indice--;
                        lexema = "";
                        estado = 0;

                    }*/
                    break;

                default:
                    break;

            }

        }
    }

    public void llenarArregloLexema(String lexema, EnumLexema tipoToken, int apariciones) {
        lex = new Lexema(lexema, tipoToken, apariciones);
        arregloLexemas.add(lex);

    }

    public void llenarArregloErrores(String cadenaError) {
        lex = new Lexema(cadenaError);
        arregloErrores.add(lex);

    }
    
    public void verificarPalabraReservada(String lexema, ArrayList arreglo){
        if(lexema.equalsIgnoreCase("ESCRIBIR")){
            System.out.println("Palabra Reservada");
            
            
        }
        
    }

    public ArrayList<Lexema> getArregloLexemas() {
        return arregloLexemas;
    }

    public void setArregloLexemas(ArrayList<Lexema> arregloLexemas) {
        this.arregloLexemas = arregloLexemas;
    }

    public ArrayList<Lexema> getArregloErrores() {
        return arregloErrores;
    }

    public void setArregloErrores(ArrayList<Lexema> arregloErrores) {
        this.arregloErrores = arregloErrores;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
    }

    public int getContadorEnteros() {
        return contadorEnteros;
    }

    public void setContadorEnteros(int contadorEnteros) {
        this.contadorEnteros = contadorEnteros;
    }

    public int getContadorLit() {
        return contadorLit;
    }

    public void setContadorLit(int contadorLit) {
        this.contadorLit = contadorLit;
    }

    public int getContadorCom() {
        return contadorCom;
    }

    public void setContadorCom(int contadorCom) {
        this.contadorCom = contadorCom;
    }

    public int getContadorSigEspe() {
        return contadorSigEspe;
    }

    public void setContadorSigEspe(int contadorSigEspe) {
        this.contadorSigEspe = contadorSigEspe;
    }

    public int getContadorSimb() {
        return contadorSimb;
    }

    public void setContadorSimb(int contadorSimb) {
        this.contadorSimb = contadorSimb;
    }



}