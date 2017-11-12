/*
 *Clase que permite el registro por serializacion de datos
 */
package Mundo;

import java.io.*;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class Registro {

    private ArbolBinario arbol;
    private ObjectOutputStream salida = null;
    private ObjectInputStream entrada = null;

    /**
     * Metodo constructor
     */
    public Registro() {

    }

    /**
     * Metodo qe permite obtener el arbol binario y su estructura serializado
     *
     * @return
     */
    public ArbolBinario getRegistroArtistas() {
        ArbolBinario obj = new ArbolBinario();
        try {
            entrada = new ObjectInputStream(new FileInputStream("registroDatos.obj"));
            String str = (String) entrada.readObject();
            obj = (ArbolBinario) entrada.readObject();
            entrada.close();
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        } catch (ClassNotFoundException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
        return obj;
    }

    /**
     * MEtodo que permite registar artista en el arbol binario
     *
     * @param arbol
     */
    public void RegistrarArtistas(ArbolBinario arbol) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream("registroDatos.obj"));
            salida.writeObject("");
            salida.writeObject(arbol);
            salida.close();
            System.out.println("serializacion correcta");
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
    }

    /**
     * Metodo que permite registrar las canciones que son agregadas en general
     * por el admin
     *
     * @param lista
     */
    public void RegistrarListaCancionesAdmin(ListaCancion lista) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream("registroListacanciones.obj"));
            salida.writeObject("");
            salida.writeObject(lista);
            salida.close();
            System.out.println("serializacion correcta");
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
    }

    /**
     * Metodo que permite obtener la lista de canciones serializada por el admin
     *
     * @return
     */
    public ListaCancion getRegistroListacancionesAdmin() {
        ListaCancion lista = new ListaCancion();
        try {
            entrada = new ObjectInputStream(new FileInputStream("registroListacanciones.obj"));
            String str = (String) entrada.readObject();
            lista = (ListaCancion) entrada.readObject();
            entrada.close();
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        } catch (ClassNotFoundException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
        return lista;
    }

    /**
     * Metodo que permite obtener la lista de usuarios registrados
     * @return 
     */
    public ListaUsuarios getUsuarios() {
        ListaUsuarios usuarios = new ListaUsuarios();
        try {
            entrada = new ObjectInputStream(new FileInputStream("usuarios.obj"));
            String str = (String) entrada.readObject();
            usuarios = (ListaUsuarios) entrada.readObject();
            entrada.close();

        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        } catch (ClassNotFoundException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
        return usuarios;
    }

    /**
     * Metodo para serialiar nuevos usuarios
     * @param usuarios 
     */
    public void actualizarUsuarios(ListaUsuarios usuarios) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream("usuarios.obj"));
            salida.writeObject("");
            salida.writeObject(usuarios);
            salida.close();
            System.out.println("serializacion correcta");
        } catch (IOException ex) {
            System.err.println("se esta creando el  archivo como nuevo");
        }
    }
}
