/*
 * Clase que permite la creacion del objeto artista
 */
package Mundo;

import java.io.Serializable;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class Artista implements Serializable {
    //Atributos codigo, nombre, nacionalidad, grupo, LISTA DOBLEMENTE ENLAZADA DE CANCIONES

    private int codigo;
    private String nombre, nacionalidad;
    private boolean grupo;
    private int canciones;

    /**
     * Metodo constructor de la clase artista
     *
     * @param codigo
     * @param nombre
     * @param nacionalidad
     * @param grupo
     */
    public Artista(int codigo, String nombre, String nacionalidad, boolean grupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.grupo = grupo;
    }

    /**
     * Get codigo
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Set codigo
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Get nombre
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get nacionalidad
     *
     * @return
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Set nacionalidad
     *
     * @param nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Get grupo
     *
     * @return
     */
    public boolean isGrupo() {
        return grupo;
    }

    /**
     * Set grupo
     *
     * @param grupo
     */
    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }

    /**
     * Get caciones
     *
     * @return
     */
    public int getCanciones() {
        return canciones;
    }

    /**
     * Set canciones
     *
     * @param canciones
     */
    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    /**
     * Metodo que permite comparar objetos artistas mediante el numero de
     * canciones que tiene registradas en la tienda
     *
     * @param a
     * @return
     */
    public Artista compareTo(Artista a) {
        Artista artista = null;
        if (canciones < a.getCanciones()) {
            artista = a;
        }
        return a;
    }
}
