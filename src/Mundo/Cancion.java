/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;

/**
 *Clase que permite crear una cancion
 * @author German
 */
public class Cancion implements Serializable {

    //Atributos codigo, nombre, album, caratula, año, duracion, genero, url.
    Artista artista;
    String nombre, album, duracion, genero, url;
    int codigo, año;

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

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
