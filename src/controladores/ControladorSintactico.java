/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import analizador.Analizador;
import analizador.Lexema;
import java.util.ArrayList;
import javax.swing.JTextArea;
import nodo.*;
import ventana.VentanaEditor;

/**
 *
 * @author randysmc
 */
public class ControladorSintactico {

    Analizador analizador;
    ArrayList<Lexema> arregloLexemas;
    ArrayList<Lexema> arregloErrores;
    private Pila automataDePila;
    String textoTextArea;
    VentanaEditor ventanaEdit;

    public void crearNodo(ArrayList<Lexema> arregloLexemas) {
        textoTextArea = "";
        Pila<Lexema> pilaLexemas = new Pila<>();
        for (int i = 0; i < arregloLexemas.size(); i++) {
            pilaLexemas.insertar(arregloLexemas.get(i));
            String nombre = arregloLexemas.get(i).getLexema();

        }

        for (int j = 0; j < pilaLexemas.size(); j++) {
            Lexema elemento = pilaLexemas.eliminar();
            System.out.println("He eliminado: " + elemento.getLexema());

            String palabra = pilaLexemas.extraer().getLexema();

            System.out.println("El top es: " + pilaLexemas.extraer().getLexema());
            System.out.println("Tamanio:" + pilaLexemas.size());

            System.out.println("******************000");
            System.out.println(palabra);
            System.out.println("**************0*0*0*0*");
            for (int k = 0; k < palabra.length(); k++) {
                char letra = palabra.charAt(j);
                textoTextArea += letra;
            }
            //System.out.println("La literal es: " + escritura);
            //escritura = "";
        }

        //System.out.println("La literal es: " +escritura);
    }

    public void escritura() {
        String palabra= "ya valio madres";
        ventanaEdit.getTextAreaEditor().setText(palabra);

    }

    /*
    **
    **
    
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

    }*/
}
