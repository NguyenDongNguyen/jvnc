/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBCConnection {
  public static Connection getJDBCConnection() {
        final String url = "jdbc:jtds:sqlserver://ADMIN:1433/QuanLySinhVien";
        final String user = "sa";
        final String password="123456";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDBCConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JDBCConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }
}
