/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author monge
 */
public class Conexion {
    public static Connection obtenerConexion(){
        String url="jdbc:sqlserver://localhost:1433;"
                +"database=usuarios;"
                +"user=sa;"
                +"password=12345678;TrustServerCertificate=True;";
       
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
                System.out.println(ex.toString());
                return null;
        }
        
    }
    
    
}
