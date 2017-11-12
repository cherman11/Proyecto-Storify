/**
 * Clase que permite crear un Nodo para el arbol binario, este nodo es de tipo artista
 */
package Mundo;

import java.io.Serializable;
/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class NodoArtista implements Serializable{

    private Artista artista;
    private NodoArtista izquierdo;
    private NodoArtista derecho;

    /**
     * Metodo constructor de la clase
     * @param artista 
     */
    public NodoArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * Get artista
     * @return 
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * Set artista
     * @param artista 
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * Get Nodo izquierdo
     * @return 
     */
    public NodoArtista getIzquierdo() {
        return izquierdo;
    }

    /**
     * Set nodo Izquierdo
     * @param izquierdo 
     */
    public void setIzquierdo(NodoArtista izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * Get nodo derecho
     * @return 
     */
    public NodoArtista getDerecho() {
        return derecho;
    }

    /**
     * Set nodo derecho
     * @param derecho 
     */
    public void setDerecho(NodoArtista derecho) {
        this.derecho = derecho;
    }

    /**
     * Metodo tostring para returnar el nombre de un artista
     * @return 
     */
    @Override
    public String toString() {
        return "Artista: " + artista.getNombre();
    }

}
