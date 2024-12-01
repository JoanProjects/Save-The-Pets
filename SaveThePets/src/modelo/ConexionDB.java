package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Esta clase proporciona una conexión singleton a una base de datos SQLite.
 * 
 * @author JoanArroyo
 */
public class ConexionDB {

    private static ConexionDB instance;
    private Connection cn = null;
    /**
     * Constructor privado para prevenir la instanciación directa.
     */    
    private ConexionDB() {
    }
    /**
     * Obtiene la única instancia de la clase `ConexionDB`.
     * 
     * @return La única instancia de `ConexionDB`
     */
     public static ConexionDB getInstance() {
        if (instance == null) {
            instance = new ConexionDB();
        }
        return instance;
    }
    /**
     * Establece una conexión a la base de datos SQLite.
     * 
     * @return Un objeto `Connection` que representa la conexión a la base de datos
     */
     public Connection conectar() {
        try {
            if (cn == null || cn.isClosed()) {
                Class.forName("org.sqlite.JDBC");
                cn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\PC\\Documents\\NetBeansProjects\\Save-The-Pets\\SaveThePets\\src\\basededatos\\mascotasDB.db");
                System.out.println("Conexion exitosa!");
            }
        } catch (ClassNotFoundException | SQLException sqlex) {
            System.out.println("Error de conexion: " + sqlex);
        }
        return cn;
    }
}
