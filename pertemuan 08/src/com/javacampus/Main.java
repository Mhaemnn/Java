package com.javacampus;

import javax.swing.*;

public class Main {
    public static void main(String[]args){
        // ========== BAGIAN CONTAINER ==========
        JFrame from = new JFrame("Belajar GUI Java");
        from.setSize(380,550); //menentukan ukuran from
        from.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //mengatur fungsi close => posisi pojok kanan ats
        from.setLocationRelativeTo(null); //menentukan tampilan from keluar dari sumbu x dan y
        from.setLayout(null); //mengatur layout secara manual
        from.setVisible(true); // untuk menampilkan from

        // ========== BAGIAN COMPONENT ==========
        JLabel labelJudul = new JLabel("LOGIN FROM");
        labelJudul.setBounds(150,50,150,25);
        from.add(labelJudul);


    }
}
