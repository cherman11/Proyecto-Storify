/*
 * Clase que permite la creacion de lista de usuarios
 */
package Mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class ListaUsuarios extends ArrayList<Usuario> implements Serializable{
    
    /**
     * Metodo constructor de la clase
     */
    public ListaUsuarios(){
        
    }
    /**
     * Metodoq que permte obtener un usuario
     * @param nombre
     * @return 
     */
    public Usuario getUsuario(String nombre){
        Usuario usuario=null;
        for (Usuario i : this) {
            if (i.getUsuario().equals(nombre)) {
                usuario = i;
                break;
            }
        }
        return usuario;
    }
    /**
     * Metodo que permite validar si el objeto es un usuario
     * @param nomb
     * @param contrase
     * @return 
     */
    public boolean esUsuario(String nomb,String contrase){
        boolean salida=false;
        for (Usuario i : this) {
            if (i.getUsuario().equals(nomb) && i.getContrasena().equals(contrase)) {
                salida = true;
                break;
            }
        }
        return salida;
    }
    /**
     * Metodo que permite agregar un usuario
     * @param nombre
     * @param contrasena
     * @param mail 
     */
    public void addUsuario(String nombre,String contrasena,String mail){
          this.add(new Usuario(nombre, contrasena, mail, new ListaCancion()));
    }
    
    
    
}
