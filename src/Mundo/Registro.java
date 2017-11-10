/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.*;
import java.util.*;

/**
 *
 * @author user
 */
public class Registro {
    ArbolBinario arbol;
    ObjectOutputStream salida = null;
    ObjectInputStream entrada=null;
    public Registro(){
        
    }
    public ArbolBinario getRegistroArtistas(){
         ArbolBinario obj=new ArbolBinario();
        try {
            entrada = new ObjectInputStream(new FileInputStream("registroDatos.obj"));
            String str=(String)entrada.readObject();
            obj=(ArbolBinario)entrada.readObject();
            entrada.close();
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        } catch (ClassNotFoundException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
        return obj;
    }
    public void RegistrarArtistas(ArbolBinario arbol){
        try {
            salida = new ObjectOutputStream(new FileOutputStream("registroDatos.obj"));
            salida.writeObject("");
            salida.writeObject(arbol);
            salida.close();
            System.out.println("serializacion correcta");
        }catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
         } 
    }
    public void RegistrarListaCancionesAdmin(ListaCancion lista){
        try {
            salida = new ObjectOutputStream(new FileOutputStream("registroListacanciones.obj"));
            salida.writeObject("");
            salida.writeObject(lista);
            salida.close();
            System.out.println("serializacion correcta");
        }catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
         } 
    }
    public ListaCancion getRegistroListacancionesAdmin(){
         ListaCancion lista =new ListaCancion();
        try {
            entrada = new ObjectInputStream(new FileInputStream("registroListacanciones.obj"));
            String str=(String)entrada.readObject();
            lista=(ListaCancion)entrada.readObject();
            entrada.close();
            
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        } catch (ClassNotFoundException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
        return lista;
    }
    public ListaUsuarios getUsuarios(){
        ListaUsuarios usuarios=new ListaUsuarios();
        try {
            entrada = new ObjectInputStream(new FileInputStream("usuarios.obj"));
            String str=(String)entrada.readObject();
            usuarios=(ListaUsuarios)entrada.readObject();
            entrada.close();
            
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        } catch (ClassNotFoundException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
        return usuarios;
    }
     public void actualizarUsuarios(ListaUsuarios usuarios){
        try {
            salida = new ObjectOutputStream(new FileOutputStream("usuarios.obj"));
            salida.writeObject("");
            salida.writeObject(usuarios);
            salida.close();
            System.out.println("serializacion correcta");
        }catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
         } 
    }
}
