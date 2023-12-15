package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn==null){
            try{
                String jdbcUrl = "jdbc:postgresql://localhost:5432/telkom_polban";
                String user = "postgres";
                String password = "Fadlurrahman23";
                conn = (Connection) DriverManager.getConnection(jdbcUrl,user,password);
            } catch (Exception e){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return conn;
    }
}