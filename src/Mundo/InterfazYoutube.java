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
 * @author user
 */
public class InterfazYoutube extends Thread{
    String URL;String usuario;
    interfaz fr;
    public InterfazYoutube(String URL,String usuario){
        this.URL=URL;
        this.usuario=usuario;
    }
    @Override
    public void run(){
        fr=new interfaz(URL);
    }
    public class interfaz{
        JFrame frame;
        public interfaz(String url){
            
            NativeInterface.open();
            SwingUtilities.invokeLater(() -> {
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(700, 500);
            frame.getContentPane().add(getwebBrower(url));
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            frame.setVisible(true);
        });
        NativeInterface.runEventPump();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            NativeInterface.open();
            }));
        }
        public JPanel getwebBrower(String url) {
        String protocolo="https://www.youtube.com/v/";
        String focus="?fs=1";
        String rederig=parserURL(url);
        JPanel pane = new JPanel(new BorderLayout());
        JWebBrowser web = new JWebBrowser();
        pane.add(web);
        web.setBarsVisible(false);
        web.navigate(protocolo+rederig+focus);
        web.updateUI();
        if (web.isDisplayable()) {
            System.out.println("salio");
        }
        return pane;
    }
        private String parserURL(String uri){
            String salida="";
            for (int i = 0; i <uri.length(); i++) {
                if(uri.charAt(i)=='='){
                    salida=uri.substring(i+1,uri.length());
                    break;
                }
            }
            return salida;
        }
    }
}
