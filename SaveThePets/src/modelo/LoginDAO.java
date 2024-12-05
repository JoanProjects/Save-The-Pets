package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Data Access Object (DAO) para la gestión de usuarios en la base de datos.
 * @author WilfredoFC
 */
public class LoginDAO {
    ConexionDB conectar = ConexionDB.getInstance(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Verifica las credenciales de un usuario en la base de datos.
     * @param usuariof El nombre de usuario.
     * @param clavef La contraseña del usuario.
     * @return True si las credenciales son válidas, false en caso contrario.
     */
    public boolean realizarLogin(String usuariof, String clavef) {
        con = conectar.conectar();

        String sql = "SELECT * FROM accesos WHERE usuario = ? AND clave = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usuariof);
            ps.setString(2, clavef);

            rs = ps.executeQuery();

            while (rs.next()) {
                con.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
}