/*
 * Clase que permite la creacion  de usuarios y su navegacion
 */
package Mundo;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class Usuario implements Serializable{
    

    private String username, contrasena, email;
    private HashMap<String, String> hash;
    private ListaCancion canciones;
    private ListaCancion favoritas;
    /**
     * Metodo constructor de la clase
     * @param username
     * @param contrasena
     * @param email
     * @param canciones 
     */
    public Usuario(String username,String contrasena,String email,ListaCancion canciones){
        this.username=username;
        this.contrasena=contrasena;
        this.email=email;
        this.canciones=canciones;
        favoritas=new ListaCancion();
        RegistrarListaCancion(canciones);
        hash=new HashMap<>();
        hash.put(username,contrasena);
    }
    /**
     * Get usuarios
     * @return 
     */
    public String getUsuario(){
        return username;
    }
    /**
     * Get contraseña
     * @return 
     */
    public String getContrasena(){
        return hash.get(username);
    }
    /**
     * Metdo que permite registrar canciones en la lista de el usuario
     * @param cancion 
     */
    public void RegistrarListaCancion(ListaCancion cancion){
        canciones=cancion;
    }
    /**
     * Get lista cancion usuario
     * @return 
     */
    public ListaCancion getRegistroCancionesUsuario(){
        return canciones;
    }
    /**
     * Metodo que permite registrar canciones en la lista de favoritos de usuario
     * @param cancion 
     */
    public void RegistrarListaCancionFavorita(ListaCancion cancion){
        favoritas=cancion;
    }
    /**
     * Get canciones favoritas
     * @return 
     */
    public ListaCancion getRegistroCancionesFavoritas(){
        return favoritas;
    }
}
