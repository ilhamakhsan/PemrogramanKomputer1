/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author ilham
 */
public class koneksi {
    
    public static Connection MySQL(){
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("3a");
            ds.setPassword("3a");
            ds.setServerName("localhost");
            ds.setDatabaseName("dbpasien");
            ds.setPortNumber(3306);
            ds.setServerTimezone("Asia/Jakarta");
            Connection c = ds.getConnection();
            return c;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
   /* public static void main(String[] args) {
        try {
            Connection conn = koneksi.MySQL();
         System.out.println(conn.getCatalog());
        } catch (SQLException e) {
        }
    }*/
}

