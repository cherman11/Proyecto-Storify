/*
 *Clase que permite crear la lista de canciones
 */
package Mundo;

import java.io.Serializable;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class ListaCancion implements Iterable,Serializable {

    private NodoCancion primero, ultimo;
    private int tamano;

    public int getTamano() {
        return tamano;
    }

    /**
     * @return the primero
     */
    public NodoCancion getPrimero() {
        return primero;
    }

    /**
     * @return the ultimo
     */
    public NodoCancion getUltimo() {
        return ultimo;
    }

    public ListaCancion() {
        primero = ultimo = null;
        tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }
    
    
    /**
     * Agrega un dato al final de la lista enlazada serializacion
     *
     * @param dato
     */
    public void agregarFinal(Cancion dato) {
        NodoCancion nodo = new NodoCancion(dato);
        if (estaVacia()) {
            primero = ultimo = nodo;
        } else {
            ultimo.setSiguiente(nodo);
            ultimo = nodo;
        }
        tamano++;
    }

    /**
     * Agrega un dato al final de la lista enlazada por carga de datos
     *
     * @param dato
     */
   public boolean agregarFinal1(Cancion dato) {
        if(existe(dato)){
            JOptionPane.showMessageDialog(null,"No se pueden agregar  canciones repetidas");
            return false;
            
        }else{
            NodoCancion nodo = new NodoCancion(dato);
        if (estaVacia()) {
            primero = ultimo = nodo;
        } else {
            ultimo.setSiguiente(nodo);
            ultimo = nodo;
        }
        tamano++;
        }
        return true;
        
    }

    /**
     * Buscar un nodo segun su dato.
     *
     * @param dato
     * @return el nodo encontrado.
     */
    public NodoCancion buscarNodo(Cancion dato) {
        NodoCancion aux = primero;
        while (aux != null) {
            if ((aux.getDato().getNombre()).equals(dato.getNombre())&& (aux.getDato().getAlbum()).equals(dato.getAlbum())
            && (aux.getDato().getDuracion()).equals(dato.getDuracion())&& (aux.getDato().getAño())==(dato.getAño())){
               
                return aux;

            } else {
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    /**
     * Metodo para eliminar un nodo de la lista segun el dato del mismo.
     *
     * @param nodo
     */
    public void eliminar(Cancion nodo) {
        
        NodoCancion dato = buscarNodo(nodo);
        if (dato != null) {
            if (dato == primero) {
                primero = primero.getSiguiente();
            } else {
                NodoCancion aux = primero;
                while (aux.getSiguiente() != dato) {
                    aux = aux.getSiguiente();
                }
                if (dato == ultimo) {
                    aux.setSiguiente(null);
                    ultimo = aux;
                } else {
                    aux.setSiguiente(dato.getSiguiente());
                }
            }
            dato = null;
            tamano--;
        } else {
            throw new RuntimeException("El nodo no exite");
        }
    }

    /**
     * Devuelve el NodoCancion de una lista dada su posición
     *
     * @param indice índice para obtener el NodoCancion
     * @return NodoCancion objeto
     */
    public NodoCancion obtenerNodo(int indice) {

        NodoCancion nodo = primero;

        for (int i = 0; i < indice; i++) {
            nodo = nodo.getSiguiente();
        }

        return nodo;
    }

    /**
     * Devuelve un elemento de la lista dado su índice
     *
     * @param indice índice de la lista
     * @return dato guardado en el índice especificado
     */
    public Cancion obtener(int indice) {
        NodoCancion n = obtenerNodo(indice);
        if (n != null) {
            return n.getDato();
        }
        return null;
    }

    /**
     * Verifica si un dato existe dentro de la lista
     *
     * @param dato Dato s buscar
     * @return boolean true si existe
     */
    public boolean existe(Cancion dato) {
        return buscar(dato) != null;
    }

    /**
     * Devuelve un nodo que contenga un dato específico
     *
     * @param dato Dato a buscar
     * @return NodoCancion
     */
    private NodoCancion buscar(Cancion dato) {
        NodoCancion aux = primero;

        while (aux != null) {
            if (aux.getDato().getNombre().equals(dato.getNombre())&&aux.getDato().getArtista().getNombre().equals(dato.getArtista().getNombre())) {
                return aux;
            }
            aux = aux.getSiguiente();
        }

        return null;
    }

    /**
     * metodo para imprimir en consola la lista generada.
     */
    public void imprimir() {
        NodoCancion aux = primero;

        while (aux != null) {
            System.out.print("--["+aux.getDato().getNombre() + "]--\t");
            aux = aux.getSiguiente();
        }
    }

    /**
     * Metodo que implementado Iterable
     * @return 
     */
    @Override
    public Iterator iterator() {
        return new IteradorListaSimple(primero);
    }

    protected class IteradorListaSimple implements Iterator {

        private NodoCancion aux;

        public IteradorListaSimple(NodoCancion aux) {
            this.aux = aux;
        }

        @Override
        public boolean hasNext() {
            return aux != null;
        }

        @Override
        public Cancion next() {
            Cancion valor = aux.getDato();
            aux = aux.getSiguiente();
            return valor;
        }
    }
    //Fin
}