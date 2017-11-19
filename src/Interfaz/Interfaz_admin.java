/*
 *Interfaz que permite navegar a un administrador
 */
package Interfaz;

import Mundo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class Interfaz_admin extends javax.swing.JFrame {

    ArbolBinario arbol;
    ListaCancion listaCanciones;
    Interfaz_login log;

    /**
     * Metodo constructor de la interfaz
     *
     * @param arbol
     */
    public Interfaz_admin(ArbolBinario arbol, ListaCancion listaCanciones, Interfaz_login log) {
        this.log = log;
        this.arbol = arbol;
        this.listaCanciones = listaCanciones;
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelOpciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnregistrarArtista = new javax.swing.JButton();
        btnregistrarCancion = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Bienvenido ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, -1));

        PanelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        PanelOpciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Panel de Opciones");

        btnCargar.setBackground(new java.awt.Color(0, 0, 0));
        btnCargar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Cargar Informacion");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnConsultas.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultas.setText("Realizar Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnregistrarArtista.setBackground(new java.awt.Color(0, 0, 0));
        btnregistrarArtista.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnregistrarArtista.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrarArtista.setText("registrar Artista");
        btnregistrarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarArtistaActionPerformed(evt);
            }
        });

        btnregistrarCancion.setBackground(new java.awt.Color(0, 0, 0));
        btnregistrarCancion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnregistrarCancion.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrarCancion.setText("registrar Cancion");
        btnregistrarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addComponent(btnregistrarCancion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultas))
                            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                                .addComponent(btnregistrarArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargar)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        PanelOpcionesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCargar, btnConsultas, btnregistrarArtista, btnregistrarCancion});

        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrarArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrarCancion)
                    .addComponent(btnConsultas))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        PanelOpcionesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCargar, btnConsultas, btnregistrarArtista, btnregistrarCancion});

        getContentPane().add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 28, -1, -1));

        btnsalir.setBackground(new java.awt.Color(0, 153, 255));
        btnsalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 307, 101, 39));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/musica.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 580, 380));

        setBounds(0, 0, 471, 409);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        Interfaz_cargarInfo cargar = new Interfaz_cargarInfo(this, arbol, listaCanciones);
        this.setVisible(false);
        cargar.setVisible(true);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        //Rock, Pop, Punk, Reggaeton, Electrónica          
        String dato = "";
        String artistap = "";
        LinkedList<GeneroPopular> generopopular = new LinkedList<>();
        int rock = 0, pop = 0, punk = 0, regge = 0, electro = 0;
        for (int i = 0; i < listaCanciones.getTamano(); i++) {
            String genero = listaCanciones.obtener(i).getGenero();
            switch (genero) {
                case "Rock":
                    rock++;
                    break;
                case "Pop":
                    pop++;
                    break;
                case "Punk":
                    punk++;
                    break;
                case "Reggaeton":
                    regge++;
                    break;
                case "Electrónica":
                    electro++;
                    break;
                default:
                    break;
            }
        }

        if (listaCanciones.getTamano() > 0) {
            generopopular.add(new GeneroPopular("Rock", rock));
            generopopular.add(new GeneroPopular("Pop", pop));
            generopopular.add(new GeneroPopular("Punk", punk));
            generopopular.add(new GeneroPopular("Reggaeton", regge));
            generopopular.add(new GeneroPopular("Electrónica", electro));
        }

        if (!generopopular.isEmpty()) {
            GeneroPopular genero = generopopular.getFirst();
            dato = genero.getGenero();
            for (int i = 0; i < generopopular.size(); i++) {
                int valor = generopopular.get(i).getValor();
                if (valor > genero.getValor()) {
                    dato = generopopular.get(i).getGenero();
                }
            }
            
            artistap = obtenerArtistaMasPopular(listaCanciones).getNombre();            
            Interfaz_consulta consulta = new Interfaz_consulta(dato,artistap,arbol,listaCanciones);
            consulta.setVisible(true);

        } else {
            
            Interfaz_consulta consulta = new Interfaz_consulta("No hay canciones registradas","",arbol,listaCanciones);
            consulta.setVisible(true);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnregistrarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarArtistaActionPerformed
        Interfaz_registroArtista autor = new Interfaz_registroArtista(log);
        autor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregistrarArtistaActionPerformed

    private void btnregistrarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarCancionActionPerformed
        Interfaz_registarCancion cancion = new Interfaz_registarCancion(log);
        cancion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregistrarCancionActionPerformed

    /**
     * Metodo que permite obtener el artista mas popular
     *
     * @param lista
     * @return
     */
    public ArtistaPopular obtenerArtistaMasPopular(ListaCancion lista) {

        ArrayList<ArtistaPopular> aux = new ArrayList<>();

        for (Iterator<Cancion> it = lista.iterator(); it.hasNext();) {
            Cancion c = it.next();
            ArtistaPopular art = new ArtistaPopular(c.getArtista().getNombre(), 0);
            if (!existe(art, aux)) {
                aux.add(art);
            }
        }
        return Collections.max(aux);
    }

    /**
     * Metodo que permite saber si un artista tiene mas de una cancion en la
     * lista de canciones
     *
     * @param ap
     * @param aux
     * @return
     */
    private boolean existe(ArtistaPopular ap, ArrayList<ArtistaPopular> aux) {
        for (int i = 0; i < aux.size(); i++) {
            ArtistaPopular auxA = aux.get(i);
            if (auxA.equals(ap)) {
                auxA.setValor(auxA.getValor() + 1);
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnregistrarArtista;
    private javax.swing.JButton btnregistrarCancion;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
