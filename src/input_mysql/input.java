/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class input {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String nama;
    public String umur;
    public String tinggi;
    
    
    public void simpan( )throws SQLException{
        conn = koneksi.getKoneksi();
        sql = "INSERT INTO coba(nama,umur,tinggi)VALUE(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, umur);
        pst.setString(3, tinggi);
        
    }

    public static class java {

        public java() {
        }
    }
}

