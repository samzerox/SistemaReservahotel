/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class conexion {
    public String db="dbreservahotelparaiso";
    public String url="jdbc:mysql://192.168.1.200/"+ db;
    public String user="usuarioreserva";
    public String pass="usuarioreserva16";

    public conexion() {
    }
    
    public Connection conectar(){
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link =DriverManager.getConnection(this.url, this.user, this.pass);
                    
        } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showConfirmDialog(null, e);
        }
        
        return link;
        
    }
    
    
}
