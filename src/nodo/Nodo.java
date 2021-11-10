/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import analizador.Lexema;
import java.util.ArrayList;

/**
 *
 * @author randysmc
 */
public class Nodo<T> {
    //ArrayList<Lexema> 
    private T elemento; 
    private Nodo<T> siguiente;

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(T elemento, Nodo<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento +" ";
    }

    
    
    
}
