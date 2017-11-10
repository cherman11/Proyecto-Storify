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
public class ArtistaPopular implements Comparable<ArtistaPopular>{
    String nombre;
    int valor;

    public ArtistaPopular(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        ArtistaPopular nueva = (ArtistaPopular) obj;
        return (nueva.getNombre().equals(nombre));
    }

    @Override
    public int compareTo(ArtistaPopular o) {
        return valor - o.getValor();
    }
    
}
