/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laborando.Controlador;

import laborando.Util.Conexion;
import laborando.Modelo.Cliente;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import laborando.Modelo.Profesion;


public class CrudCliente {

    public String buscar(Cliente cli) {
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        String codigo="-1";
        Profesion profesion=new Profesion();
        try {
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select rut,nombre,fecnac,cv,codpro from cliente where rut='"+cli.getRut()+"'");
            while (rs.next()) { 
                cli.setNombre(rs.getString(2));
                cli.setFecnac(rs.getDate(3));
                cli.setCv(rs.getBoolean(4));
                codigo=cli.getRut();
                profesion.setCod_pro(rs.getInt(5));
                cli.setProfesion(profesion); 
            }
            rs.close(); 
            stmt.close(); 
            return codigo;
        } catch (SQLException ex) {
           return codigo; 
        }
    }    
    
    public boolean agregar(Cliente cli) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "insert into cliente (rut,nombre,fecnac,cv,codpro) values (?,?,?,?,?)";
        DateFormat df = new SimpleDateFormat("yyyy-M-d");
        String fecha = df.format(cli.getFecnac());
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getRut());
            stmt.setString(2,cli.getNombre());
            stmt.setDate(3, java.sql.Date.valueOf(fecha));
            stmt.setBoolean(4, cli.isCv());
            stmt.setInt(5, cli.getProfesion().getCod_pro());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }     
    }  

    public boolean modificar(Cliente cli) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "update cliente set nombre=?,fecnac=?,cv=?,codpro=? where rut=?";
        DateFormat df = new SimpleDateFormat("yyyy-M-d");
        String fecha = df.format(cli.getFecnac());
        try {            
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getNombre());
            stmt.setDate(2, java.sql.Date.valueOf(fecha));
            stmt.setBoolean(3, cli.isCv());
            stmt.setInt(4, cli.getProfesion().getCod_pro());
            stmt.setString(5,cli.getRut());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }     
    }   
    
    public boolean eliminar(Cliente cli) {
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        PreparedStatement stmt;
        String query = "delete from cliente where rut=?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getRut());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CrudCliente.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return false;
    }     
    
    public DefaultTableModel listarClientes(int opc) {
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("laborando");
        try {
            stmt = conn.createStatement(); 
            if (opc==-1)
                rs = stmt.executeQuery("select rut,nombre,fecnac,cv,descripcion from cliente c join profesion p where codpro=cod_pro");
            else
                rs = stmt.executeQuery("select rut,nombre,fecnac,cv,descripcion from cliente c join profesion p where codpro=cod_pro and codpro="+opc);              
            DefaultTableModel DT=new DefaultTableModel();
            DT.addColumn("Rut");
            DT.addColumn("Nombre");
            DT.addColumn("Fecha Nacimiento");
            DT.addColumn("CV Actualizado");
            DT.addColumn("Profesion");
            Object[] fila=new Object[5];
            while (rs.next()) { 
                fila[0]=rs.getString(1);
                fila[1]=rs.getString(2);
                String fecha=new SimpleDateFormat("dd-MM-yyyy").format(rs.getDate(3));
                fila[2]=fecha;
                if (rs.getBoolean("cv"))
                    fila[3]="Si";
                else{
                    fila[3]="No";
                }
                fila[4]=rs.getString(5);
                DT.addRow(fila);
            }
            rs.close(); 
            stmt.close(); 
            return(DT);
        } catch (SQLException ex) {
            return null;
        }
    }    
}

