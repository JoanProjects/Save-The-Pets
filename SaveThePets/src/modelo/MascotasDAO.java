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
}