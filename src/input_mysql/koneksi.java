/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author L e n o v o
 */
public class koneksi {
 private static Connection koneksi;
 public static Connection getKoneksi(){
     if(koneksi==null){
         try{
             String url;
             url="";
             String user ="root";
             String password = "";
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             koneksi = DriverManager.getConnection(url,user,password);
         
         }catch (SQLException t){
             JOptionPane.showMessageDialog(null, t);    
         }
     }return koneksi;
 
 }static Object getConnection(){
    throw new UnsupportedOperationException("Not yet implemented");
 }
}

