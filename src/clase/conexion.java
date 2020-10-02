package clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {
    public static Connection conexion;
    
    private static String baseDatos         = "farmacia";
    private static String usuario           = "root";
    private static String contrasena        = "";
    private static String host              = "localhost";
    private String url                      = "jdbc:mysql//"+host+"/"+baseDatos;
   
    
    public boolean abrirConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            return true;
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex){
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}