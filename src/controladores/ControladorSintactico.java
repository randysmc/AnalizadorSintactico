/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import analizador.Analizador;
import analizador.Lexema;
import java.util.ArrayList;
import nodo.*;

/**
 *
 * @author randysmc
 */
public class ControladorSintactico {
    Analizador analizador;
    ArrayList<Lexema> arregloLexemas;
    ArrayList<Lexema> arregloErrores;
    private Pila automataDePila = new Pila();
    
    
}
