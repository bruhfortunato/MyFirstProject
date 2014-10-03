package br.com.controleconvidados.utils;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;

public class LookAndFeelUtils {
    
    public static void setLookAndFeelUtils(){
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

        } catch (IllegalAccessException | UnsupportedLookAndFeelException |
                   ClassNotFoundException | InstantiationException ex) {
            Logger.getLogger(LookAndFeelUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public static void setWindowIcon(JFrame jf,String imagePath) {
        URL url;
        url = jf.getClass().getResource(imagePath);
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jf.setIconImage(imagemTitulo);
    }
     
    }

