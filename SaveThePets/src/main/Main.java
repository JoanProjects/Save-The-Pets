
package main;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.SwingUtilities;
import vista.LoginV;
import vista.PantallaDeCarga;
import controlador.ControladorLogin;

/**
 * @author Walla Peguero
 */
public class Main {
    
    public static void main(String[] args) {
        //Tema de Flatlaf
         try {
            FlatArcDarkIJTheme.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
     
        SwingUtilities.invokeLater(() -> {
            PantallaDeCarga pantallaDeCarga = new PantallaDeCarga();
            pantallaDeCarga.setVisible(true);

            // Crear un nuevo hilo para esperar 5 segundos y luego cambiar a la pantalla de login
            new Thread(() -> {
                try {
                    // Esperar 5 segundos
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Cambiar a la pantalla de login
                SwingUtilities.invokeLater(() -> {
                    pantallaDeCarga.dispose(); // Cerrar la pantalla de carga
                    LoginV lv = new LoginV();
                    ControladorLogin cl = new ControladorLogin(lv);
                    lv.setVisible(true);
                    lv.setLocationRelativeTo(null);
                });
            }).start();
        });
    
    
  }
}