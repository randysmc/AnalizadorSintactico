/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author randysmc
 */
public class Pila<T> {
    //elemento fijo de la pila
    private Nodo<T> top; //elemento que esta arriba, ultimo en entrar 
    private int tamanio; 
    
    
    public Pila(){
        top = null;
        this.tamanio =0;
    }
    //verifica si el elemento es vacio o tamano =0
    public boolean estaVacio(){
        return top == null;
    }
    
    public int size(){
        return this.tamanio;
    }
    
    //saca un elemento de la pila y lo elimina
    public T eliminar(){
        if(estaVacio()){
            return null;
        }else{
            T elemento = top.getElemento(); // almacenamos el elemnto  
            Nodo<T> aux = top.getSiguiente(); //obtenemos el siguiente elemento
            top = null; //eliminamos el ultimo elemento
            top = aux; //guardamos el siguiente como ultimo 
            this.tamanio --; //reducimos el tamanio del nodo al eliminar el elemento
            return elemento;
        }
        
    }
    //insertamos un nuevo elemento
    public void insertar(T elemento){
        Nodo <T> aux = new Nodo<T>(elemento, top);
        top = aux; //actualizamos el top
        this.tamanio ++; //aumentamos el tamanio del nodo
        
        
    }
    
    //nos devuelve el elemento del top
    public T extraer(){
        if(estaVacio()){
            return null; //no devuelve nada
        }else{
            return top.getElemento(); // nos devuelve el ultimo elemento
        }
        
    }
    
    public String toString(){
        
        if(estaVacio()){
            return "la pila esta vacia";
        }else{
            
            String resultado="";
            Nodo<T> aux = top;
            while(aux !=null){
                resultado += aux.toString();
                aux = aux.getSiguiente(); //almacenamos el siguiente  en aux
                
            }
            return resultado;
        }
    }
}
