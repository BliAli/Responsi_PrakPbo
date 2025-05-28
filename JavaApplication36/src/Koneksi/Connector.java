/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;

/**
 *
 * @author aliad
 */
public class Connector {
    static Connection conn;
    
    public static Connection connection(){
        if(conn == null){
            MysqlDataSource database = new MysqlDataSource();
            database.setDatabaseName("responsi_pbo");
            database.setUser("root");
            database.setPassword("");
            
            try {
                conn = database.getConnection();
                System.out.println("Koneksi berhasil");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Koneksi gagal");
            }
        }
        return conn;
    }
}
