/*
 * Clase que permite la cracion del arbol binario
 */
package Mundo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class ArbolBinario implements Serializable {

    private ArrayList<Artista> artistas = new ArrayList<>();
    private String[] vector;
    private NodoArtista raiz;

    /**
     * Get Artistas
     *
     * @return
     */
    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    /**
     * Get Vector
     *
     * @return
     */
    public String[] getVector() {
        return vector;
    }

    /**
     * Metodo constructor de la clase
     */
    public ArbolBinario() {
        this.raiz = null;
    }

    /**
     * Get raiz
     *
     * @return
     */
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
        if (buscarNodo(nodo.getArtista().getNombre()) != null) {
            JOptionPane.showMessageDialog(null, "No se puede almacenar almacenar artistas con el mismo nombre.");
        } else if (raiz == null) {
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
     * Get Arbol
     *
     * @return
     */
    public ArbolBinario getEste() {
        return this;
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

    /**
     * Metodo que permite imprimir un arbol en consola
     *
     * @param nodo
     * @param nivel
     */
    public void imprimirHorizontal(NodoArtista nodo, int nivel) {
        if (nodo != null) {
            imprimirHorizontal(nodo.getDerecho(), nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("\t");
            }
            System.out.println(nodo.getArtista().getNombre());
            imprimirHorizontal(nodo.getIzquierdo(), nivel + 1);
        }
    }

    /**
     * Metodo para buscar un nodo en el arbol
     *
     * @param nombre
     * @return
     */
    public NodoArtista buscarNodo(String nombre) {
        if (estaVacio()) {
            return null;
        } else {
            NodoArtista aux = raiz;
            while (!aux.getArtista().getNombre().equals(nombre)) {
                int comparacion = nombre.compareTo(raiz.getArtista().getNombre());
                if (comparacion < 0) {
                    aux = aux.getIzquierdo();
                } else {
                    aux = aux.getDerecho();
                }
                if (aux == null) {
                    return null;
                }
            }
            return aux;
        }
    }
}
