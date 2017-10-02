/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author German
 */
public class ArbolBinario {

    NodoArtista raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    /**
     * Metodo que permite la creacion de un nodo Artista en el arbol
     *
     * @param artista, dato a guardar en el arbol
     */
    public void agregarNodoArtista(Artista artista) {
        NodoArtista nodo = new NodoArtista(artista);
        if (raiz == null) {
            raiz = nodo;
        } else {
            NodoArtista aux = raiz;
            NodoArtista padre;
            while (true) {
                padre = aux;
                if (artista.getCodigo() < aux.getArtista().getCodigo()) {
                    aux = aux.getIzquierdo();
                    if (aux == null) {
                        padre.setIzquierdo(nodo);
                        return;
                    }
                } else {
                    aux = aux.getDerecho();
                    if (aux == null) {
                        padre.setIzquierdo(nodo);
                        return;
                    }
                }
            }
        }
    }
}
