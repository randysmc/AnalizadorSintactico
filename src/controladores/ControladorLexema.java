package controladores;

import analizador.Analizador;
import analizador.Lexema;
import java.util.ArrayList;
import javax.swing.JTable;
import nodo.*;

public class ControladorLexema {

    Analizador analizador;
    ArrayList<Lexema> arregloLexemas;
    ArrayList<Lexema> arregloErrores;
    ControladorSintactico controladorSintactico;

    public ControladorLexema() {
        analizador = new Analizador();
        controladorSintactico = new ControladorSintactico();
    }

    public void iniciar(String palabraEntrada) {
        analizador.iniciarAnalizador(palabraEntrada);
        mostrarLexemas(analizador.getArregloLexemas());
        mostrarErrores(analizador.getArregloErrores());
        controladorSintactico.crearNodo(analizador.getArregloLexemas());
//controladorSintactico.crearNodo();
        

    }

    public void getTablaLexemas(JTable tabla) {
        //System.out.println(textoBusqueda);
        //int tamano =1;
        int tamano = analizador.getArregloLexemas().size();
        //int errores = analizador.getArregloErrores().size();
        System.out.println("Lexemas tamanon: " + tamano);
        //System.out.println("Errores tamanito: " +errores);
        String matriz[][] = new String[tamano][4];
        for (int i = 0; i < tamano; i++) {
            
            matriz[i][0] = analizador.getArregloLexemas().get(i).getLexema();
            matriz[i][1] = analizador.getArregloLexemas().get(i).getNombreToken().toString();
            matriz[i][2] = String.valueOf(analizador.getArregloLexemas().get(i).getFila());
            matriz[i][3] = String.valueOf(analizador.getArregloLexemas().get(i).getColumna());
            //matriz[i][3] = String.valueOf(analizador.getArregloLexemas().get(i).getCantidadApariciones());
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Lexema", "Token", "Fila", "Columna"
                }
        ));

    }

    public void getTablaErr(JTable tablaErr) {
        //System.out.println(textoBusqueda);
        //int tamano =1;
        int tamano = analizador.getArregloErrores().size();
        //int errores = analizador.getArregloErrores().size();
        System.out.println("Lexemas tamanon: " + tamano);
        //System.out.println("Errores tamanito: " +errores);
        String matriz[][] = new String[tamano][4];
        for (int i = 0; i < tamano; i++) {
            matriz[i][0] = analizador.getArregloErrores().get(i).getCadenaError();
            matriz[i][1] = String.valueOf(analizador.getArregloErrores().get(i).getCantidadApariciones());

        }
        tablaErr.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Indice", "Error"
                }
        ));

    }

    public void getPatron(String textoBusqueda) {
        System.out.println(textoBusqueda);
        int tamano = analizador.getArregloLexemas().size();
        int errores = analizador.getArregloErrores().size();
        System.out.println("Lexemas tam: " + tamano);
        System.out.println("Errores tam: " + errores);

        for (int i = 0; i < tamano; i++) {
            System.out.println("****" + analizador.getArregloLexemas().get(i).getLexema() + "****");
            String nombre = analizador.getArregloLexemas().get(i).getLexema();

            System.out.println("Nombre del lexema: " + nombre.toString());
            System.out.println("Nombre del texto a buscar: " + textoBusqueda);
            System.out.println("Son iguales? por equals " + nombre.toString().equals(textoBusqueda));
            System.out.println("Son iguales? " + nombre.toString() == textoBusqueda.toString() + "\n");
            /*if(nombre.toString() == textoBusqueda){
                 System.out.println("Encontre una coincidencia " +(i+1));
             }else{
                 System.out.println("no encontre ninguna coincidencia");
             }*/

        }

    }

    public void mostrarLexemas(ArrayList<Lexema> arregloLexemas) {
        System.out.println("El tamanio es: " + arregloLexemas.size());
        //System.out.println(arregloLexemas.get(0).getLexema());
        String nombre = "";
        String tipoToken = "";
        String error = "";
        System.out.println("aca vamos a mostrar el resultado");

        for (int i = 0; i < arregloLexemas.size(); i++) {
            nombre = arregloLexemas.get(i).getLexema() + "\n";
            tipoToken = arregloLexemas.get(i).getNombreToken() + "\n";
            //fila = this.arregloLexemas.get(i).getFila();
            System.out.println("Nombre: " + nombre + "Tipo token: " + tipoToken + "Posicion: " + (i + 1));
        }

    }

    public void mostrarErrores(ArrayList<Lexema> arregloErrores) {
        String nombre = "";
        for (int i = 0; i < arregloErrores.size(); i++) {
            nombre = arregloErrores.get(i).getCadenaError() + "\n";
            System.out.println("Cadena de error: " + nombre + "Posicion: " + (i + 1));
        }

    }
    


}
