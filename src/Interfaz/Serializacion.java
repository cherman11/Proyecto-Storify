/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Mundo.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author German
 */
public class Serializacion {

    FileOutputStream fos = null;
    ObjectOutputStream salida = null;
    FileInputStream fis = null;
    ObjectInputStream entrada = null;
    ArbolBinario arbol;
    ArrayList<Artista> artista;    
    ListaCancion canciones;
    Cancion cancion;
    
    public void cargarArtistas(ArrayList<Artista> artistas){
        artista=artistas;
        System.out.println(artista);
    }

    public void escribirArtistas() {        
        try {
            //Se crea el fichero
            fos = new FileOutputStream("C:\\Users\\German\\Documents\\NetBeansProjects\\Proyecto-Storify\\src\\Recursos\\Artistas.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(artista);
        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("3" + e.getMessage());
            }
        }
    }

    public ArbolBinario leerArtistas() {
        try {
            fis = new FileInputStream("C:\\Users\\German\\Documents\\NetBeansProjects\\Proyecto-Storify\\src\\Recursos\\Artistas.dat");
            entrada = new ObjectInputStream(fis);
            artista = (ArrayList<Artista>) entrada.readObject();
            for(Artista a: artista){
                arbol.agregarNodoArtista(a);
                System.out.println(a.getNombre()+" HDD");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        
        return arbol;
    }

    public void escribirCanciones(ListaCancion canciones) {
        try {
            //Se crea el fichero
            fos = new FileOutputStream("C:\\Users\\German\\Documents\\NetBeansProjects\\Proyecto-Storify\\src\\Recursos\\Canciones.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(canciones);
        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("3" + e.getMessage());
            }
        }
    }

    public ListaCancion leerCanciones() {
        try {
            fis = new FileInputStream("C:\\Users\\German\\Documents\\NetBeansProjects\\Proyecto-Storify\\src\\Recursos\\Canciones.dat");
            entrada = new ObjectInputStream(fis);            
            canciones=(ListaCancion)entrada.readObject();           
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return canciones;
    }

}
