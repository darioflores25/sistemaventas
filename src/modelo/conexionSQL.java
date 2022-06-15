
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class conexionSQL {
 Connection conectar=null;
 
 public Connection conexion(){
     try {
         Class.forName("com.mysql.jdbc.Driver");
         conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistemaventas","root","root");
         //JOptionPane.showMessageDialog(null,"Conexión con BD Exitosa");
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Error de conexión"+e.getMessage());
     }
     return conectar;
 }
}
