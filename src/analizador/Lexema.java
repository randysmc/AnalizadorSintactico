/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import enums.EnumLexema;

/**
 *
 * @author randysmc
 */
public class Lexema {
    String cadenaError;
    String lexema;
    EnumLexema nombreToken;
    int fila;
    int columna;
    int cantidadApariciones;

    public Lexema(String lexema, EnumLexema nombreToken,int fila, int columna/*int cantidadApariciones*/) {
        this.lexema = lexema;
        this.nombreToken = nombreToken;
        this.fila = fila;
        this.columna = columna;
        //this.cantidadApariciones=cantidadApariciones;
        //this.posicion = posicion;
    }

    public Lexema(String cadenaError) {
        this.cadenaError = cadenaError;
        //this.posicion = posicion;
    }

    public String getCadenaError() {
        return cadenaError;
    }

    public void setCadenaError(String cadenaError) {
        this.cadenaError = cadenaError;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public EnumLexema getNombreToken() {
        return nombreToken;
    }

    public void setNombreToken(EnumLexema nombreToken) {
        this.nombreToken = nombreToken;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getCantidadApariciones() {
        return cantidadApariciones;
    }

    public void setCantidadApariciones(int cantidadApariciones) {
        this.cantidadApariciones = cantidadApariciones;
    }


    
    
 
}
