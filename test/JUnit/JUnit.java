package JUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Mundo.ArbolBinario;
import Mundo.Artista;
import Mundo.Cancion;
import Mundo.GeneroPopular;
import Mundo.ListaCancion;
import Mundo.NodoArtista;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class JUnit {

    /**
     * 1.Metodo de prueba para buscar un artista en el arbol binario
     */
    @Test
    public void testBuscarArtista() {

        ArbolBinario a = new ArbolBinario();

        a.agregarNodoArtista(new Artista(1, "Maluma", "Colombia", false));
        a.agregarNodoArtista(new Artista(2, "Rio Roma", "Colombia", true));
        a.agregarNodoArtista(new Artista(3, "The Mills", "Colombia", true));

        NodoArtista res = a.buscarNodo("Rio Roma");

        assertEquals(res, "Maluma");

    }

    /**
     * 2.Metodo prueba que verifica si un arbol esta vacio
     */
    @Test
    public void arbolVacio() {

        ArbolBinario b = new ArbolBinario();
        b.agregarNodoArtista(new Artista(1, "Maluma", "Colombia", false));
        b.agregarNodoArtista(new Artista(2, "Rio Roma", "Colombia", true));
        b.agregarNodoArtista(new Artista(3, "The Mills", "Colombia", true));

        assertTrue(b.estaVacio() == false);

    }

    /**
     * 3.Metodo prueba para contar nodos
     */
    @Test
    public void testContarNodos() {

        ArbolBinario c = new ArbolBinario();
        c.agregarNodoArtista(new Artista(123, "raul", "colombia", true));
        c.agregarNodoArtista(new Artista(345, "b", "colombia", false));
        c.agregarNodoArtista(new Artista(567, "z", "colombia", true));
        c.agregarNodoArtista(new Artista(789, "x", "colombia", true));

        assertTrue(c.cantidadNodos(0) == 4);
    }

    /**
     * 4.Metodo prueba para obtener la raiz de un arbol
     */
    @Test
    public void testGetRaiz() {

        ArbolBinario d = new ArbolBinario();

        d.agregarNodoArtista(new Artista(1, "Maluma", "Colombia", false));
        d.agregarNodoArtista(new Artista(2, "Rio Roma", "Colombia", true));
        d.agregarNodoArtista(new Artista(3, "The Mills", "Colombia", true));

        NodoArtista res = new NodoArtista(new Artista(3, "The Mills", "Colombia", true));

        assertEquals("", res, d.getRaiz());

    }

    /**
     * 5.Metodo prueba para lista de canciones vacias
     */
    @Test
    public void testListavacia() {
        ListaCancion e = new ListaCancion();
        e.agregarFinal(new Cancion(new Artista(6, "manuel", "venezuela ", true),
                "oficial", "4:00", "pop", "https://www.youtube.com/embed/KWGrPNqz4uc", null, 3, 1996));
        assertFalse(e.estaVacia() != false);

    }

    /**
     * 6.Metodo prueba para saber el tamaño de una lista
     */
    @Test
    public void testTamanioLista() {
        ListaCancion f = new ListaCancion();

        f.agregarFinal(new Cancion(new Artista(11, "sebastian", "ecuador", true),
                "havana", "vevo", "4:35", "pop", "https://www.youtube.com/embed/KWGrPNqz4uc", 55, 2001));

        f.agregarFinal(new Cancion(new Artista(11, "sebastian", "ecuador", true),
                "sensualidad", "vevo", "4:35", "pop", "https://www.youtube.com/embed/KWGrPNqz4uc", 55, 2000));

        assertTrue(f.getTamano() != 0);
    }

    /**
     * 7.Metodo prueba para saber el genero mas popular de la tienda
     */
    @Test
    public void testgeneroPopular() {
        GeneroPopular gp;
        GeneroPopular gp1;
        gp = new GeneroPopular("salsa", 3);

        assertFalse(gp.getValor() == 4);
    }

    /**
     * Metodo constructor de la clase
     */
    public JUnit() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    private void assertNOtNull(ArrayList<Artista> artistas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
