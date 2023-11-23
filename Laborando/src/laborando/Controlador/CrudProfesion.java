/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laborando.Controlador;

import laborando.Util.Conexion;
import laborando.Modelo.Profesion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrudProfesion {
    
    public Profesion buscar(int codpro) {
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        Profesion pro=new Profesion();
        try {
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select descripcion from profesion where cod_pro="+codpro);
            if (rs.next()) {
                pro.setCod_pro(codpro);
                pro.setDescripcion(rs.getString(1));
            }
            rs.close(); 
            stmt.close(); 
            return pro;
        } catch (SQLException ex) {
            return null;
        }
    }  
    
    public boolean agregar(Profesion pro) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "insert into profesion (cod_pro,descripcion) values (?,?)";
        try {
  
            stmt = conn.prepareStatement(query);
            stmt.setInt(1,pro.getCod_pro());
            stmt.setString(2,pro.getDescripcion());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }     
    }
    
    public boolean modificar(Profesion pro) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "update profesion set descripcion=? where cod_pro=?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,pro.getDescripcion());
            stmt.setInt(2,pro.getCod_pro());
            if (stmt.executeUpdate()>=1)
                return true;
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }
     
    public boolean eliminar(Profesion pro) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "delete from profesion where cod_pro=?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1,pro.getCod_pro());
            if (stmt.executeUpdate()>=1)
                return true;
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }    
    
    public List <Profesion> obtieneProfesiones() {
        List <Profesion> lista = new ArrayList <>();
        String sql = "select * from profesion";
        Statement stmt;        
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql); 
            while (rs.next()){
                Profesion pro=new Profesion(rs.getInt("cod_pro"),rs.getString("descripcion"));
                lista.add(pro);
                }
            return lista;
        } catch (SQLException ex) {
            return null;
        }     
    }       
}
