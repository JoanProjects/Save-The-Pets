package main;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.SwingUtilities;
import vista.LoginV;
import vista.PantallaDeCarga;
import controlador.ControladorLogin;

/**
 * Clase principal de la aplicación.
 * @author Walla Peguero
 */
public class Main {

    /**
     * Método principal de la aplicación.
     * Inicializa el tema FlatLaf, muestra la pantalla de carga y luego la pantalla de login después de 5 segundos.
     * @param args Los argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        //Establece el tema FlatLaf
        try {
            FlatArcDarkIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        // Usa SwingUtilities.invokeLater para asegurar que la interfaz gráfica se inicialice en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            PantallaDeCarga pantallaDeCarga = new PantallaDeCarga();
            pantallaDeCarga.setVisible(true);

            // Crea un nuevo hilo para esperar 5 segundos y luego cambiar a la pantalla de login
            new Thread(() -> {
                try {
                    // Espera 5 segundos
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Cambia a la pantalla de login usando SwingUtilities.invokeLater para asegurar que la actualización de la UI se haga en el hilo de eventos de Swing
                SwingUtilities.invokeLater(() -> {
                    pantallaDeCarga.dispose(); // Cierra la pantalla de carga
                    LoginV lv = new LoginV();
                    ControladorLogin cl = new ControladorLogin(lv);
                    lv.setVisible(true);
                    lv.setLocationRelativeTo(null);
                });
            }).start();
        });
    }
}