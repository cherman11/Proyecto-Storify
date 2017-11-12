/*
 * interfaz que permite crear objeto cancion
 */
package Mundo;

import java.io.Serializable;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class Cancion implements Serializable {

    //Atributos codigo, nombre, album, caratula, año, duracion, genero, url.
    private Artista artista;
    private String nombre, album, duracion, genero, url;
    private int codigo, año;

    /**
     * Metodo constructor de la clase cancion
     * @param artista
     * @param nombre
     * @param album
     * @param duracion
     * @param genero
     * @param url
     * @param codigo
     * @param año 
     */
    public Cancion(Artista artista, String nombre, String album, String duracion, String genero, String url, int codigo, int año) {
        this.artista = artista;
        this.nombre = nombre;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.url = url;
        this.codigo = codigo;
        this.año = año;
    }

    /**
     * Get artistas
     * @return 
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * Set artistas
     * @param artista 
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * Get nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get album
     * @return 
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Set album
     * @param album 
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * Get duracion
     * @return 
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Set duracion
     * @param duracion 
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * Get genero
     * @return 
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Set genero
     * @param genero 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Get url
     * @return 
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get codigo
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Set codigo
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Get año
     * @return 
     */
    public int getAño() {
        return año;
    }

    /**
     * Set año
     * @param año 
     */
    public void setAño(int año) {
        this.año = año;
    }

}