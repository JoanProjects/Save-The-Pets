package vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Ventana principal de la aplicación "Save The Pets".
 * @author Walla Peguero
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalPrincipal
     */
    /**
     * Constructor de la clase PantallaPrincipal.
     * Inicializa los componentes, establece la posición y el título de la ventana, y configura la imagen del icono.
     */
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/huella.png")).getImage()); //Imagen para el soft
        this.setTitle("Save The Pets");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImgSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblManual = new javax.swing.JLabel();
        lblMascotas = new javax.swing.JLabel();
        lblAcercaDe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImgSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ImgSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image salida 36x36.png"))); // NOI18N
        ImgSalir.setText("Exit");
        ImgSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImgSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImgSalirMouseExited(evt);
            }
        });
        jPanel1.add(ImgSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 122, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManual.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblManual.setForeground(new java.awt.Color(255, 255, 255));
        lblManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Manual.png"))); // NOI18N
        lblManual.setText("Manual De Usuario");
        lblManual.setPreferredSize(new java.awt.Dimension(150, 150));
        lblManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManualMouseExited(evt);
            }
        });
        jPanel2.add(lblManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 212, 60));

        lblMascotas.setBackground(new java.awt.Color(255, 255, 255));
        lblMascotas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblMascotas.setForeground(new java.awt.Color(255, 255, 255));
        lblMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mascota.png"))); // NOI18N
        lblMascotas.setText("Mascotas");
        lblMascotas.setPreferredSize(new java.awt.Dimension(150, 150));
        lblMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMascotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMascotasMouseExited(evt);
            }
        });
        jPanel2.add(lblMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 60));

        lblAcercaDe.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblAcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        lblAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acerca de.png"))); // NOI18N
        lblAcercaDe.setText("Acerca de");
        lblAcercaDe.setPreferredSize(new java.awt.Dimension(150, 150));
        lblAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAcercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAcercaDeMouseExited(evt);
            }
        });
        jPanel2.add(lblAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 140, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Peq.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 290, 170));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© Speed Soft");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 230, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diseño de software ágil para empresas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 390, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Soporte Técnico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 100, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ventas - Diseños - Desarrollo de Software - ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMascotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMascotasMouseEntered
        lblMascotas.setForeground(new Color(116,116,116));
    }//GEN-LAST:event_lblMascotasMouseEntered

    private void lblMascotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMascotasMouseExited
        lblMascotas.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblMascotasMouseExited

    private void lblAcercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaDeMouseEntered
        lblAcercaDe.setForeground(new Color(116,116,116));
    }//GEN-LAST:event_lblAcercaDeMouseEntered

    private void lblAcercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaDeMouseExited
        lblAcercaDe.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblAcercaDeMouseExited

    private void ImgSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgSalirMouseEntered
        ImgSalir.setForeground(new Color(116,116,116));
    }//GEN-LAST:event_ImgSalirMouseEntered

    private void ImgSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgSalirMouseExited
        ImgSalir.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ImgSalirMouseExited

    private void lblManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManualMouseExited
        lblManual.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblManualMouseExited

    private void lblManualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManualMouseEntered
        lblManual.setForeground(new Color(116,116,116));
    }//GEN-LAST:event_lblManualMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
         FlatArcDarkIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ImgSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblAcercaDe;
    public javax.swing.JLabel lblManual;
    public javax.swing.JLabel lblMascotas;
    // End of variables declaration//GEN-END:variables
}
