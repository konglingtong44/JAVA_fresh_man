/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DBUtil {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String USER = "root";
    public static final String PASSWORD = "fyrhedeyyt";
    public static final String URL = "jdbc:mysql://localhost:3306/netbeans";
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
    }
    
    public static Connection getConn() throws Exception{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    
    public static void close(ResultSet rs, Connection conn, Statement state){
        if (rs != null){
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        if (state != null){
                try {
                        state.close();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
        
        if (conn != null){
                try {
                        conn.close();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }
    }
}
