/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.util.ArrayList;

/**
 * Clase que permite la cracion del arbol binario
 * @author German
 */
public class ArbolBinario {

    ArrayList<Artista> artistas = new ArrayList<>();
    String[] vector;
    NodoArtista raiz;

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public String[] getVector() {
        return vector;
    }

    public ArbolBinario() {
        this.raiz = null;
    }

    public NodoArtista getRaiz() {
        return raiz;
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
            artistas.add(artista);
        } else {
            NodoArtista aux = raiz;
            NodoArtista padre;
            while (true) {
                String artista1 = artista.getNombre();
                String artista2 = aux.getArtista().getNombre();
                int comparacion = artista1.compareTo(artista2);
                padre = aux;
                if (comparacion < 0) {
                    aux = aux.getIzquierdo();
                    if (aux == null) {
                        padre.setIzquierdo(nodo);
                        artistas.add(artista);
                        return;
                    }
                } else {
                    aux = aux.getDerecho();
                    if (aux == null) {
                        padre.setDerecho(nodo);
                        artistas.add(artista);
                        return;
                    }
                }
            }
        }
    }

    /**
     * Metodo para saber si un arbol esta vacio
     *
     * @return
     */
    public boolean estaVacio() {
        return raiz == null;
    }

    /**
     * Metodo que permite recorrer un arbol en modo in-orden
     *
     * @param raiz
     */
    public void recorrerArbol(NodoArtista raiz) {
        if (raiz != null) {
            recorrerArbol(raiz.getIzquierdo());
            System.out.println(raiz.getArtista().getNombre());
            recorrerArbol(raiz.getDerecho());
        }
    }

    /**
     * Metodo que permite saber cuantos nodos tiene el arbol
     *
     * @param nivel desde la raiz, nivel = 0, siempre
     * @return
     */
    public int cantidadNodos(int nivel) {
        return cantidadNodos(this.raiz, nivel);
    }

    /**
     * Metodo recargado para contar nodos dentro del arbol.
     *
     * @param raizAux
     * @param nivel
     * @return
     */
    private int cantidadNodos(NodoArtista raizAux, int nivel) {
        if (raizAux == null) {
            return 0;
        }
        int cantNodosIzquierdo = cantidadNodos(raizAux.getIzquierdo(), nivel - 1);
        int cantNodosDerecho = cantidadNodos(raizAux.getDerecho(), nivel - 1);
        if (nivel <= 0) {
            return cantNodosIzquierdo + cantNodosDerecho + 1;
        } else {
            return cantNodosIzquierdo + cantNodosDerecho;
        }
    }
}
