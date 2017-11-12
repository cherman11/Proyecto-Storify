/*
 *clase que sirve de apoyo para obtener el genero mas popular de la tienda
 */
package Mundo;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class GeneroPopular {

    private String genero;
    private int valor;

    /**
     * Metodo constructor
     *
     * @param genero
     * @param valor
     */
    public GeneroPopular(String genero, int valor) {
        this.genero = genero;
        this.valor = valor;
    }

    /**
     * Get genero
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Set genero
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Get valor
     *
     * @return
     */
    public int getValor() {
        return valor;
    }

    /**
     * Set valor
     *
     * @param valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Metodo que permite comparar el objeto para saber cual tiene mas registro
     * en las canciones de la tienda
     *
     * @param o
     * @return
     */
    public String compareTo(GeneroPopular o) {
        String dato = "";
        if (valor < o.getValor()) {
            dato = o.getGenero();
        }
        return dato;
    }

}
