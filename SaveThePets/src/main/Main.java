
package main;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.SwingUtilities;
import vista.Login;
import vista.Login;
import vista.PantallaDeCarga;
import vista.PantallaDeCarga;

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

            // Crear un nuevo hilo para esperar 10 segundos y luego cambiar a la pantalla de login
            new Thread(() -> {
                try {
                    // Esperar 10 segundos
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Cambiar a la pantalla de login
                SwingUtilities.invokeLater(() -> {
                    pantallaDeCarga.dispose(); // Cerrar la pantalla de carga
                    Login pantallaLogin = new Login();
                    pantallaLogin.setVisible(true);
                });
            }).start();
        });
    
    
  }
}
