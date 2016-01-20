/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Koneksi {
 private static Connection koneksi;
 public static Connection KoneksiDatabase(){
     if (koneksi==null)
         
     {
         try {
            DriverManager.registerDriver(new Driver());
             koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_perpus","root","");
   
         } catch (SQLException u) {
             System.out.println("Koneksi gagal"+u);
         }
     }
     return koneksi;
     
 }
}
