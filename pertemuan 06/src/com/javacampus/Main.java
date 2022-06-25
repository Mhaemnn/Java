package com.javacampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[]args){
        System.out.println("=====Contoh Koneksi JDBC Dengan MySQL=======");
        try{
            Class.forName("com.sql.jdbc.Driver");
        }catch (ClassNotFoundException ex ){
            System.out.println("MySQL JDBC tidak Driver tidak ditemukan ");

            ex.printStackTrace();
        };
        System.out.print("MySQL JDBC Driver berhasil ditemukan");
        Connection connection = null;


        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa","root","");
        }catch (SQLException ex){
            System.out.print("Gagal Membuat koneksi");
            ex.printStackTrace();
        }

        if(connection != null){
            System.out.print("Selamat, anda telah berhasil membuat koneksi dengan database Mysql");

        }else{
            System.out.print("Maaf, anda gagal membuat koneksi");
        }

        try {
            connection.close();
        }catch (SQLException ex){
            System.out.println("Gagal untuk membuat koneksi");
            ex.printStackTrace();
        }

    }
}
