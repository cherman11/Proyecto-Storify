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
public class Artista {
    //Atributos codigo, nombre, nacionalidad, grupo, LISTA DOBLEMENTE ENLAZADA DE CANCIONES
    
    int codigo;
    String nombre,nacionalidad;
    boolean grupo;

    public Artista(int codigo, String nombre, String nacionalidad, boolean grupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.grupo = grupo;
    }
    
    
    
    //crear lista doblemente enlazada de canciones

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isGrupo() {
        return grupo;
    }

    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }
    
}
