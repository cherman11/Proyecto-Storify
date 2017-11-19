/*
 * Interfaz que permite registrar canciones nuevas en la tienda
 */
package Interfaz;

import Mundo.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class Interfaz_registarCancion extends javax.swing.JFrame {
    
    Interfaz_login log;
    ArbolBinario arbol;
    ListaCancion listaCanciones;
    Registro registrar = new Registro();
    JFileChooser seleccionArchivo;

    /**
     * Metodo constructor de la interfaz
     *
     * @param log
     */
    public Interfaz_registarCancion(Interfaz_login log) {
        this.log = log;
        this.arbol = registrar.getRegistroArtistas();
        this.listaCanciones = registrar.getRegistroListacancionesAdmin();
        initComponents();
        setLocationRelativeTo(this);
        cargarCombo();
        txtcodigo.setEnabled(false);
    }

    /**
     * Metodo que permite cargar el combo de los artistas desde el arbol.
     */
    public void cargarCombo() {
        int parada = arbol.cantidadNodos(0);
        ArrayList<Artista> item = arbol.getArtistas();
        for (int i = 0; i < parada; i++) {
            String artista = item.get(i).getNombre();
            cboArtista.addItem(artista);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtalbum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboaño = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbogenero = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtyoutube = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboArtista = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtduracion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Registrar cancion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(51, 153, 255));
        btnguardar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnvolver.setBackground(new java.awt.Color(51, 153, 255));
        btnvolver.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Album");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año");

        cboaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1960", "1970", "1980", "2000", "2010", "2017" }));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Genero");

        cbogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Rock", "Pop", "Cumbia", "Reggaeton", "Electrónica" }));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Url Youtube");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Artista/autor");

        cboArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        cboArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboArtistaActionPerformed(evt);
            }
        });
        cboArtista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboArtistaKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duracion");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setText("Agregar Artista/Cancion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("min");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnvolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtalbum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboaño, javax.swing.GroupLayout.Alignment.LEADING, 0, 199, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtyoutube, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtalbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtyoutube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvolver)
                    .addComponent(btnguardar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 460, 390));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/musica.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 540, 510));

        setBounds(0, 0, 514, 478);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        java.awt.event.ActionEvent e = null;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnguardarActionPerformed(e);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        java.awt.event.ActionEvent e = null;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnguardarActionPerformed(e);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreKeyPressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (cboArtista.getSelectedIndex() == 0 || txtcodigo.getText().equals("") || txtnombre.getText().equals("") || txtalbum.getText().equals("")
                || txtyoutube.getText().equals("")
                || cboaño.getSelectedIndex() == 0 || cbogenero.getSelectedIndex() == 0) {
            txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            txtalbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            
            txtyoutube.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            JOptionPane.showMessageDialog(this, "Completar Todos los  campos");
        } else {
            try {
                Artista artista = arbol.getArtistas().get(cboArtista.getSelectedIndex() - 1);
                String nombreC = txtnombre.getText();
                String album = txtalbum.getText();
                String duracion = txtduracion.getText();
                String genero = cbogenero.getSelectedItem().toString();
                String url = txtyoutube.getText();
                int codigo = Integer.parseInt(txtcodigo.getText());
                int año = Integer.parseInt(cboaño.getSelectedItem().toString());
                if (Integer.parseInt(duracion) > 0) {
                    Cancion cancion = new Cancion(artista, nombreC, album, duracion, genero, url, codigo, año);
                    
                    if (listaCanciones.agregarFinal1(cancion)) {
                        registrar.RegistrarListaCancionesAdmin(listaCanciones);
                        JOptionPane.showMessageDialog(null, "cancion agregada correctamente");
                        txtnombre.setText("");
                        txtyoutube.setText("");
                        txtalbum.setText("");
                        cargarCombo();
                        txtcodigo.setText("");
                        txtduracion.setText("");
                        
                    }
                    
                }
            } catch (Exception e) {
                System.err.println("datos erroneos");
            }
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        Interfaz_admin admin = new Interfaz_admin(arbol, listaCanciones, log);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //si no encuentra en sector Artista va a canciones: por si uno quiere agregar canciones
        Cancion cancion;
        Artista atista;
        ArrayList<Cancion> canciones = new ArrayList<>();
        ArrayList<Artista> artistas = new ArrayList<>();
        seleccionArchivo = new JFileChooser();
        int seleccion = seleccionArchivo.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = seleccionArchivo.getSelectedFile();
            try {
                FileReader fr = new FileReader(fichero);
                BufferedReader sc = new BufferedReader(fr);
                String actual = sc.readLine();
                if (actual.equals("#Artistas")) {
                    while (true) {
                        String linea = sc.readLine();
                        if (linea != null && !linea.equals("#Canciones")) {
                            String[] datosArtista = linea.split(";");
                            boolean grupo = datosArtista[3].equals("true") ? true : false;
                            artistas.add(new Artista(Integer.parseInt(datosArtista[0]), datosArtista[1], datosArtista[2], grupo));
                        } else {
                            actual = linea;
                            break;
                        }
                    }
                }
                if (actual.equals("#Canciones")) {
                    while (true) {
                        String linea = sc.readLine();
                        if (linea != null && !linea.equals("Artistas")) {
                            String[] datosArtista = linea.split(";");
                            canciones.add(new Cancion(getArtista(datosArtista[0], artistas),
                                    datosArtista[1], datosArtista[2], datosArtista[4],
                                    datosArtista[5], datosArtista[6], getCodigo(datosArtista[0], artistas), Integer.parseInt(datosArtista[3])));
                        } else {
                            break;
                        }
                    }
                }
            } catch (FileNotFoundException ex) {
                System.err.println("el archivo no cumple con el formato");
            } catch (IOException ex) {
                System.err.println("el archivo no cumple con el formato");
            }
        }
        //agregando artistas ala estructura
        for (int i = 0; i < artistas.size(); i++) {
            arbol.agregarNodoArtista(artistas.get(i));
        }
        registrar.RegistrarArtistas(arbol);
        //agregando datos ala estructura
        for (int i = 0; i < canciones.size(); i++) {
            listaCanciones.agregarFinal1(canciones.get(i));
        }
        registrar.RegistrarListaCancionesAdmin(listaCanciones);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboArtistaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboArtistaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboArtistaKeyReleased

    private void cboArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboArtistaActionPerformed
        // TODO add your handling code here:
        Artista artista = arbol.getArtistas().get(cboArtista.getSelectedIndex() - 1);
        txtcodigo.setText(artista.getCodigo() + "");
    }//GEN-LAST:event_cboArtistaActionPerformed
    /**
     * Metodo que permite obtener un artista
     *
     * @param nombre
     * @param artistas
     * @return
     */
    private Artista getArtista(String nombre, ArrayList<Artista> artistas) {
        Artista artista = null;
        for (int i = 0; i < artistas.size(); i++) {
            if (nombre.equals(artistas.get(i).getNombre())) {
                artista = artistas.get(i);
                break;
            }
        }
        return artista;
    }

    /**
     * Metodo que permite obtener el codgigo de un artista para asignarlo a las
     * canciones nuevas
     *
     * @param nombre
     * @param artistas
     * @return
     */
    private int getCodigo(String nombre, ArrayList<Artista> artistas) {
        int codigo = -1;
        for (int i = 0; i < artistas.size(); i++) {
            if (nombre.equals(artistas.get(i).getNombre())) {
                codigo = artistas.get(i).getCodigo();
                break;
            }
        }
        return codigo;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> cboArtista;
    private javax.swing.JComboBox<String> cboaño;
    private javax.swing.JComboBox<String> cbogenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtalbum;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtyoutube;
    // End of variables declaration//GEN-END:variables
}
