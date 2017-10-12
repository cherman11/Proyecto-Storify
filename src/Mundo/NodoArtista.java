/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 * Clase que permite crear un Nodo para el arbol binario, este nodo es de tipo artista
 * @author German
 */
public class NodoArtista {

    public Artista artista;
    public NodoArtista izquierdo;
    public NodoArtista derecho;

    /**
     * Metodo constructor
     * @param artista 
     */
    public NodoArtista(Artista artista) {
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public NodoArtista getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArtista izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArtista getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArtista derecho) {
        this.derecho = derecho;
    }

    @Override
    public String toString() {
        return "Artista: " + artista.getNombre();
    }

}
