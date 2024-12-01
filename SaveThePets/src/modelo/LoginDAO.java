package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WilfredoFC
 */
public class LoginDAO {
    ConexionDB conectar = ConexionDB.getInstance(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
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
