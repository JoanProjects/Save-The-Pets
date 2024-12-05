package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Data Access Object (DAO) para la gestión de mascotas en la base de datos.
 * @author JoanArroyo
 */
public class MascotasDAO {
    ConexionDB    conectar = ConexionDB.getInstance(); 
    Connection        con;
    PreparedStatement ps;
    ResultSet         rs;

    /**
     * Lista los registros de mascotas que coinciden con un valor de búsqueda.
     * Devuelve un ArrayList con los resultados de la búsqueda.
     * @param valorBuscar El valor a buscar en los datos de las mascotas.
     * @return Una lista de objetos Mascotas que coinciden con la búsqueda.
     */
    public List<Mascotas> listarRegistro(String valorBuscar){
        
        String sql = "SELECT mascotas.id, mascotas.nombre, mascotas.sexo, mascotas.pesoKg, especies.nombre, razas.nombre,"+
                     " vacunacion_estado, adopcion_estado, colaboradores.nombre FROM mascotas"+
                     " JOIN especies ON mascotas.especie_id = especies.id" +
                     " JOIN razas ON mascotas.raza_id = razas.id" +
                     " JOIN colaboradores ON mascotas.colaborador_id = colaboradores.id" +
                     " WHERE mascotas.id||mascotas.nombre||mascotas.sexo||mascotas.pesoKG||especies.nombre||razas.nombre||mascotas.vacunacion_estado||colaboradores.nombre LIKE '%"+valorBuscar+"%'";
        
        List<Mascotas>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Mascotas c = new Mascotas();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setSexo(rs.getString(3));
                c.setPesoKG(rs.getString(4));
                c.setEspecie(rs.getString(5));
                c.setRaza(rs.getString(6));
                c.setVacunacionEstado(rs.getString(7));
                c.setAdopcionEstado(rs.getString(8));
                c.setColaborador(rs.getString(9));
                datos.add(c);
            }
        }catch(SQLException ex){
            System.out.println("ERROR no se pudo buscar Mascota: " + ex);
        }
        return datos;
    }
    
    /**
     * Lista todos los registros de mascotas en la base de datos.
     * Devuelve un ArrayList con todos los datos.
     * @return Una lista de todos los objetos Mascotas.
     */
    public List<Mascotas> listar(){
        String sql = "SELECT mascotas.id AS mascotaID, mascotas.nombre AS mascotaNombre, mascotas.sexo," +
                     " mascotas.pesoKG, especies.nombre AS especieNombre, razas.nombre AS razaNombre," +
                     " mascotas.vacunacion_estado, mascotas.adopcion_estado, colaboradores.nombre AS colaboradorNombre" +
                    " FROM mascotas INNER JOIN especies ON mascotas.especie_id = especies.id" + 
                    " INNER JOIN razas ON mascotas.raza_id = razas.id" +
                    " INNER JOIN colaboradores ON mascotas.colaborador_id = colaboradores.id";
        List<Mascotas>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Mascotas c = new Mascotas();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setSexo(rs.getString(3));
                c.setPesoKG(rs.getString(4));
                c.setEspecie(rs.getString(5));
                c.setRaza(rs.getString(6));
                c.setVacunacionEstado(rs.getString(7));
                c.setAdopcionEstado(rs.getString(8));
                c.setColaborador(rs.getString(9));
                datos.add(c);
            }
        }catch(SQLException ex){
            System.out.println("ERROR no se pudo listar Mascotas: " + ex);
        }
        return datos;
    }
    /**
     * Agrega una nueva mascota a la base de datos.
     * Devuelve 1 cuando la operación ha sido exitosa.
     * @param c El objeto Mascota a agregar.
     * @return 1 si la mascota se agregó correctamente.
     */
    public int agregar(Mascotas c){
        
        String sql = "INSERT INTO mascotas (nombre, sexo, pesoKg, especie_id, raza_id," +
                     " vacunacion_estado, adopcion_estado, colaborador_id)" +
                     " VALUES (?,?,?,(SELECT id FROM especies WHERE nombre=?)," +
                     " (SELECT id FROM razas WHERE nombre=?),?,?," +
                     " (SELECT id FROM colaboradores WHERE nombre=?))";
        
        try {
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getSexo());
            ps.setString(3, c.getPesoKG());
            ps.setString(4, c.getEspecie());
            ps.setString(5, c.getRaza());
            ps.setString(6, c.getVacunacionEstado());
            ps.setString(7, c.getAdopcionEstado());
            ps.setString(8, c.getColaborador());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ERROR no se pudo insertar datos: " + e);
        }
        return 1;
    }
    /**
     * Actualiza los datos de una mascota en la base de datos.
     * Devuelve el número de registros actualizados.
     * @param c El objeto Mascota con los datos actualizados.
     * @return El número de registros actualizados (1 si la actualización fue exitosa).
     */
    public int actualizar(Mascotas c){
        
        int r = 0;
        
        String sql = "UPDATE mascotas SET nombre=?, sexo=?, pesoKg=?,"+
                     " especie_id = (SELECT id FROM especies WHERE nombre =?),"+
                     " raza_id = (SELECT id FROM razas WHERE nombre=?),"+
                     " vacunacion_estado=?, adopcion_estado=?,"+ 
                     " colaborador_id = (SELECT id FROM colaboradores WHERE nombre=?)"+
                     " WHERE id=?";
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getSexo());
            ps.setString(3, c.getPesoKG());
            ps.setString(4, c.getEspecie());
            ps.setString(5, c.getRaza());
            ps.setString(6, c.getVacunacionEstado());
            ps.setString(7, c.getAdopcionEstado());
            ps.setString(8, c.getColaborador());
            ps.setInt(9, c.getId());
            r = ps.executeUpdate();
            
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR no se pudieron actualizar datos: " + e);
        }
        return r;
    }
    /**
     * Elimina una mascota de la base de datos.
     * Devuelve el número de registros eliminados.
     * @param id El ID de la mascota a eliminar.
     * @return El número de registros eliminados (1 si la eliminación fue exitosa).
     */
    public int eliminar(int id){
        
        int r = 0;
        
        String sql = "DELETE FROM mascotas WHERE id="+id;
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            r   = ps.executeUpdate();
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("ERROR no se pudieron borrar los datos: " + e);
        }
        return r;
    }
}