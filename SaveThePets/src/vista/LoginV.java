
package vista;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Walla Peguero
 */
public class LoginV extends javax.swing.JFrame {

    
    public LoginV() {
        initComponents();
        this.setTitle("Save The Pets"); // Titulo del Software
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/huella.png")).getImage()); //Imagen para el soft
        setLocationRelativeTo(null); // Funcion para que la ventana aparezca centralizada
        btnIngresar.requestFocusInWindow(); // Funcion para darle el Focus a PnlAcceder        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        ImgContra = new javax.swing.JLabel();
        ImgLogin = new javax.swing.JLabel();
        btnTest2 = new javax.swing.JLabel();
        lblSeparador = new javax.swing.JLabel();
        lblCreditos = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        lblLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        pnlFondo.setBackground(new java.awt.Color(15, 15, 15));
        pnlFondo.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 420, 30));

        btnIngresar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("ACCEDER");
        btnIngresar.setBorder(null);
        pnlFondo.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 381, 40));

        ImgContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Password.png"))); // NOI18N
        pnlFondo.add(ImgContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 30, 30));

        ImgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user (2).png"))); // NOI18N
        ImgLogin.setPreferredSize(new java.awt.Dimension(30, 30));
        pnlFondo.add(ImgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        btnTest2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnTest2.setForeground(new java.awt.Color(255, 255, 255));
        btnTest2.setText("¿Has olvidado tu contraseña?");
        btnTest2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTest2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTest2MouseExited(evt);
            }
        });
        pnlFondo.add(btnTest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 200, 20));

        lblSeparador.setForeground(new java.awt.Color(255, 255, 255));
        lblSeparador.setText("________________________________________");
        lblSeparador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSeparadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSeparadorMouseExited(evt);
            }
        });
        pnlFondo.add(lblSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 200, 50));

        lblCreditos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(105, 105, 105));
        lblCreditos.setText("© Creado y Diseñado Por SpeedSoft");
        pnlFondo.add(lblCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(15, 15, 15));
        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(105, 105, 105));
        txtUsuario.setText("USUARIO");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        pnlFondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 420, -1));

        txtClave.setBackground(new java.awt.Color(15, 15, 15));
        txtClave.setForeground(new java.awt.Color(105, 105, 105));
        txtClave.setText("**********");
        txtClave.setBorder(null);
        txtClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtClaveMousePressed(evt);
            }
        });
        pnlFondo.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 420, -1));
        pnlFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 420, 30));

        lblLogin.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(105, 105, 105));
        lblLogin.setText("LOGIN");
        pnlFondo.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DOG ANIMADO.png"))); // NOI18N
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 350, 350));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BlobsVector.png"))); // NOI18N
        pnlFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 300, 260));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BlobsVector-1.png"))); // NOI18N
        pnlFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 320));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BlobsVector-2.png"))); // NOI18N
        pnlFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 270, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vector.png"))); // NOI18N
        pnlFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 280, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cambiarColores(boolean esMouseDentro) {
    // Cambiar el color dependiendo si el mouse está dentro o no
    Color color = esMouseDentro ? new Color(116, 116, 116) : new Color(255, 255, 255);

    btnTest2.setForeground(color);
    lblSeparador.setForeground(color);
}

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
          if (txtUsuario.getText().equals("USUARIO")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.white);
        }
        if(String.valueOf(txtClave.getPassword()).isEmpty()) {
            txtClave.setText("**********");
            txtClave.setForeground(Color.gray);
    }//GEN-LAST:event_txtUsuarioMousePressed
}
    private void txtClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClaveMousePressed
          if(String.valueOf(txtClave.getPassword()).equals("**********")) {
            txtClave.setText("");
            txtClave.setForeground(Color.white);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("USUARIO");
            txtUsuario.setForeground(Color.gray);
    }//GEN-LAST:event_txtClaveMousePressed
}
    private void btnTest2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTest2MouseEntered
        cambiarColores(true);
    }//GEN-LAST:event_btnTest2MouseEntered

    private void btnTest2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTest2MouseExited
        cambiarColores(false);
    }//GEN-LAST:event_btnTest2MouseExited

    private void lblSeparadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeparadorMouseEntered
        cambiarColores(true);
    }//GEN-LAST:event_lblSeparadorMouseEntered

    private void lblSeparadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeparadorMouseExited
        cambiarColores(false);
    }//GEN-LAST:event_lblSeparadorMouseExited


    
     /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgContra;
    private javax.swing.JLabel ImgLogin;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel btnTest2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSeparador;
    private javax.swing.JPanel pnlFondo;
    public javax.swing.JPasswordField txtClave;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}