/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Mundo.ArbolBinario;
import Mundo.ListaCancion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author German
 */
public class Interfaz_cargarInfo extends javax.swing.JFrame {

    Interfaz_admin admin;
    ArbolBinario arbol;
    ListaCancion listaCanciones;
    File archivo;
    String informacion = "";

    /**
     * Creates new form Interfaz_cargarInfo
     *
     * @param admin
     * @param arbol
     * @param listaCanciones
     */
    public Interfaz_cargarInfo(Interfaz_admin admin, ArbolBinario arbol, ListaCancion listaCanciones) {
        initComponents();
        DialogCargar.setVisible(false);
        DialogCargar.setSize(800, 600);
        txtArea.setVisible(false);
        this.admin = admin;
        this.arbol = arbol;
        this.listaCanciones = listaCanciones;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogCargar = new javax.swing.JDialog();
        fileCargar = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        lblSeleccionar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        fileCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogCargarLayout = new javax.swing.GroupLayout(DialogCargar.getContentPane());
        DialogCargar.getContentPane().setLayout(DialogCargarLayout);
        DialogCargarLayout.setHorizontalGroup(
            DialogCargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogCargarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );
        DialogCargarLayout.setVerticalGroup(
            DialogCargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogCargarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Cargar Informacion");

        lblSeleccionar.setText("Seleccionar Archivo");
        lblSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSeleccionarMousePressed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSeleccionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegresar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeleccionar)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSeleccionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeleccionarMousePressed
        DialogCargar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblSeleccionarMousePressed

    private void fileCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCargarActionPerformed
        JFileChooser selector = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if (comando.equals(JFileChooser.APPROVE_SELECTION)) {
            archivo = selector.getSelectedFile();
        } else if (comando.equals(JFileChooser.CANCEL_SELECTION)) {

        }
        DialogCargar.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_fileCargarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (archivo != null) {
            txtArea.setVisible(true);
            try {
                FileInputStream file = new FileInputStream(archivo);
                int ascii;
                while ((ascii = file.read()) != -1) {
                    char caracter = (char) ascii;
                    informacion += caracter;
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Interfaz_cargarInfo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz_cargarInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtArea.setText(informacion);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        for (int i = 0; i < informacion.length(); i++) {
            if (informacion.charAt(i)=='#'&&informacion.charAt(i+1)=='A') {
                System.out.println("Cargando artistas");
            }else if(informacion.charAt(i)=='#'&&informacion.charAt(i+1)=='C'){
                System.out.println("Cargando Canciones");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JFileChooser fileCargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSeleccionar;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
