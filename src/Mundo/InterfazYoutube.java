/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author German F Valencia
 * @author Raul Pineda
 * @author Victor H Buritica
 */
public class InterfazYoutube extends Thread {

    private String URL;
    String usuario;
    private interfaz fr;

    /**
     * Metodo constructor de la intefaz
     *
     * @param URL
     * @param usuario
     */
    public InterfazYoutube(String URL, String usuario) {
        this.URL = URL;
        this.usuario = usuario;
    }

    /*
    Metodo que permite la ejecucion de la interfaz
     */
    @Override
    public void run() {
        fr = new interfaz(URL);
    }

    /**
     * Metodo que permite declarar los elementos de la interfaz
     */
    public class interfaz extends JFrame {

        JFrame frame;

        public interfaz(String url) {

            NativeInterface.open();
            
            
            SwingUtilities.invokeLater(() -> {
                frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setSize(700, 500);
                frame.getContentPane().add(getwebBrower(url));
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);                
            });
           
        }

        public JPanel getwebBrower(String url) {
            String protocolo = url;
            String focus = "?fs=1";
            String rederig = parserURL(url);
            JPanel pane = new JPanel(new BorderLayout());
            JWebBrowser web = new JWebBrowser();
            pane.add(web, BorderLayout.CENTER);
            web.setBarsVisible(false);
            web.navigate(protocolo);
            web.updateUI();
            if (web.isDisplayable()) {
                System.out.println("salio");
            }
            return pane;
        }

        private String parserURL(String uri) {
            String salida = "";
            for (int i = 0; i < uri.length(); i++) {
                if (uri.charAt(i) == '=') {
                    salida = uri.substring(i + 1, uri.length());
                    break;
                }
            }
            return salida;
        }
    }
    //Fin    
}
