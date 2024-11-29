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

    //Listar registro de mascotas
    public List listarRegistro(String valorBuscar){
        
        String sql = "select nombre, sexo, pesoKg, especie_id, raza_id,"+
                     " vacunacion_estado, adopcion_estado, colaborador_id from mascotas"+
                     " where id||nombre||sexo||pesoKG||vacunacion_estado like '%"+valorBuscar+"%'" +
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
    
}