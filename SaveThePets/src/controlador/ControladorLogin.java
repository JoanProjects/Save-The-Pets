package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.LoginDAO;
import modelo.Login;
import vista.LoginV;
import vista.PantallaPrincipal;
/**
 *
 * @author WilfredoFC
 */
public class ControladorLogin implements ActionListener {
    LoginDAO dao = new LoginDAO();
    Login l = new Login();
    LoginV loginv = new LoginV();

    public ControladorLogin(LoginV l) {
        this.loginv = l;
        this.loginv.btnIngresar.addActionListener(this);
        limpiarCampos(l);
    }
    
     private void limpiarCampos(LoginV l) {
        l.txtUsuario.setText("");
        l.txtClave.setText("");
        l.txtUsuario.requestFocus();
    }
     
     private boolean validarCampos(LoginV l) {
        if (l.txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "Por favor, ingresa tu usuario!", "Error!", JOptionPane.ERROR_MESSAGE);
            l.txtUsuario.requestFocus();
            return false;
        }
        if (l.txtClave.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "Por favor, ingresa tu clave!", "Error!", JOptionPane.ERROR_MESSAGE);
            l.txtClave.requestFocus();
            return false;
        }
        return true;
    }
     
     public boolean AccionarLogin(String usuario, String clave, LoginV login) {
        if (validarCampos(login)) {
            //Campos validados!
            try {
                //Verificar si los datos ya existen
                if (dao.realizarLogin(usuario, clave)) {
                    JOptionPane.showMessageDialog(loginv, "Ingresado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    login.setVisible(false);
                    //Ingresando al formulario
                    PantallaPrincipal v = new PantallaPrincipal();
                    ControladorPantallaPrincipal control = new ControladorPantallaPrincipal(v);
                    v.setVisible(true);
                    v.setLocationRelativeTo(null);
                    return true;
                } else{
                    JOptionPane.showMessageDialog(login,"Error al tratar de ingresar.\n El usuario o la clave estan incorrectos!", "Error!",JOptionPane.ERROR_MESSAGE);
                    limpiarCampos(login);
                    return false;
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(loginv, "Error al tratar de ingresar: " + e, "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == loginv.btnIngresar) {
            String usuario = loginv.txtUsuario.getText();
            String clave   = loginv.txtClave.getText();
            AccionarLogin(usuario, clave, loginv);
        }
    }
}
