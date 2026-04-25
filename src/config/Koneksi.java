package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                // Pastikan nama database 'academic' sesuai dengan di phpMyAdmin
                String url = "jdbc:mysql://localhost:3306/academic"; 
                String user = "root"; // Default XAMPP
                String pass = "";     // Default XAMPP (kosong)
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
}