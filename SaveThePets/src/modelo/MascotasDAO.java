package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * DAO para Mascotas
 * @author JoanArroyo
 */
public class MascotasDAO {
    ConexionDB    conectar = ConexionDB.getInstance(); 
    Connection        con;
    PreparedStatement ps;
    ResultSet         rs;

    //Listar registro de mascotas a buscar
    //Devuelve un arrayList con el resultado de los datos buscados
    //@param valorBuscar
    //@return datos
    public List listarRegistro(String valorBuscar){
        
        String sql = "SELECT id, nombre, sexo, pesoKg, especie_id, raza_id,"+
                     " vacunacion_estado, adopcion_estado, colaborador_id FROM mascotas"+
                     " WHERE id||nombre||sexo||pesoKG||vacunacion_estado like '%"+valorBuscar+"%'" +
                     " OR especie_id =(SELECT id FROM especies WHERE nombre = '"+valorBuscar+"')" + 
                     " OR raza_id =(SELECT id FROM razas WHERE nombre = '"+valorBuscar+"')" +
                     " OR colaborador_id =(SELECT id FROM colaboradores WHERE nombre = '"+valorBuscar+"')";
        
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
    
    //Metodo lista todos los registros en Mascotas
    //Devuelve un ArrayList con todos los datos
    //@return datos
    public List listar(){
        String sql = "select mascotas.id, mascotas.nombre, mascotas.sexo," +
                     " mascotas.pesoKG, especies.nombre, razas.nombre," +
                     " vacunacion_estado, adopcion_estado, colaboradores.nombre" +
                    " FROM mascotas JOIN especies ON mascotas.especie_id = especies.id" + 
                    " JOIN razas ON mascotas.raza_id = razas.id" +
                    " JOIN colaboradores ON mascotas.colaborador_id = colaboradores.id";
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
    /*
        Metodo para agregar nuevas Mascotas
        Devuelve 1 cuando la operacion ha sido exitosa
        @param c
        @return 1
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
    /*
        Metodo para actualizar registros de Mascotas
        Devuelve e1 numero de registros actualizados
        @param c
        @return r
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
}