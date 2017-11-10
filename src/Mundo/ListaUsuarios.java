/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ListaUsuarios extends ArrayList<Usuario> implements Serializable{
    
    public ListaUsuarios(){
        
    }
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
    public void addUsuario(String nombre,String contrasena,String mail){
          this.add(new Usuario(nombre, contrasena, mail, new ListaCancion()));
    }
}
