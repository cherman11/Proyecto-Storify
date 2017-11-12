/*
 * clase que sirve de apoyo para determinar el artista  mas popular de la tienda
 */
package Mundo;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class ArtistaPopular implements Comparable<ArtistaPopular>{
    private String nombre;
    private int valor;

    /**
     * Metodo constructor del objeto
     * @param nombre
     * @param valor 
     */
    public ArtistaPopular(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
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
     * Get valor
     * @return 
     */
    public int getValor() {
        return valor;
    }

    /**
     * Set valor
     * @param valor 
     */
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
