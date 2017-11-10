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
public class GeneroPopular {

    String genero;
    int valor;

    public GeneroPopular(String genero, int valor) {
        this.genero = genero;
        this.valor = valor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String compareTo(GeneroPopular o) {
        String dato = "";
        if (valor < o.getValor()) {
            dato = o.getGenero();
        }
        return dato;
    }

}
