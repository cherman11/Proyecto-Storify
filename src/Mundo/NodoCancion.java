/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;

/**
 *Clase que permite crear un nodo para la lista enlazada, este nodo es de tipo Cancion
 * @author German
 */
public class NodoCancion implements Serializable{

    private Cancion dato;
    private NodoCancion siguiente;

    /**
     * Constructor de la clase nodo
     *
     * @param dato, elemento que se guarda en el nodo
     * @param siguiente, enlace al siguiente nodo
     */
    public NodoCancion(Cancion dato, NodoCancion siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    /**
     * Constructor 2 de la clase nodo
     *
     *
     * @param dato, elemento que se guarda en el nodo
     */
    public NodoCancion(Cancion dato) {
        this.dato = dato;
    }

    /**
     * contructor 3
     */
    public NodoCancion() {
    }

    /**
     *
     * @return dato
     */
    public Cancion getDato() {
        return dato;
    }

    /**
     *
     * @return siguiente
     */
    public NodoCancion getSiguiente() {
        return siguiente;
    }

    /**
     * Metodo para modificar dato
     *
     * @param dato
     */
    public void setDat(Cancion dato) {
        this.dato = dato;
    }

    /**
     * metodo para modificar el nodo siguiente
     *
     * @param siguiente
     */
    public void setSiguiente(NodoCancion siguiente) {
        this.siguiente = siguiente;
    }

}
