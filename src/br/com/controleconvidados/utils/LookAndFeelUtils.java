import br.com.controleconvidados.view.FormMenu;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;

public class LookAndFeelUtils {
    
    public static void setLookAndFeel(){
         try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void setWindowIcon(JFrame jf,String imagePath) {
        URL url;
        url = jf.getClass().getResource(imagePath);
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jf.setIconImage(imagemTitulo);
    }
    }

