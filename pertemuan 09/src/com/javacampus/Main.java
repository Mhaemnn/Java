package com.javacampus;

import javax.swing.*;


public class Main {
    public static void main(String[]args){

        // ============== BAGIAN CONTAINER ==============
        // membuat object Container dari JFrame
        JFrame from = new JFrame("Apliksi Perpustakaan");
        from.setSize(400,550);// menentukan ukuran from
        from.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mengatur fungsi close => posisi pojok kanan atas
        from.setLocationRelativeTo(null); // menentukan tampilan from keluar dari sumbu x dan y
        from.setLayout(null); // mengatur layout secara manual


        // ============== BAGIAN COMPONENT ==============
        JLabel labelJudul = new JLabel("Aplikasi Peminjaman Buku"); // membuat object komponen
        labelJudul.setBounds(115,30,220,30); // mengatur posisi dan ukuran komponen
        from.add(labelJudul); // memasukan komponen ke from / container


        // bagia kode buku
        JLabel labelKodeBuku = new JLabel("Kode Buku");
        labelKodeBuku.setBounds(50,80,150,25);
        from.add(labelKodeBuku);
        JTextField txtKodeBuku = new JTextField();
        txtKodeBuku.setBounds(180,80, 170,25);
        from.add(txtKodeBuku);

        // bagian nama buku
        JLabel labelNamaBuku = new JLabel("Nama Buku");
        labelNamaBuku.setBounds(50,110,150,25);
        from.add(labelNamaBuku);
        JTextField txtNamaBuku = new JTextField();
        txtNamaBuku.setBounds(180,110, 170,25);
        from.add(txtNamaBuku);

        // bagian membership
        JLabel labelMembership = new JLabel("Membership");
        labelMembership.setBounds(50, 140, 150, 25);
        from.add(labelMembership);
        //ekslusif
        JRadioButton radioUmum = new JRadioButton();
        radioUmum.setText("Umum");
        radioUmum.setBounds(180,140,100,25);
        //umum
        JRadioButton radioEkslusif = new JRadioButton();
        radioEkslusif.setText("Ekslusif");
        radioEkslusif.setBounds(260,140,100,25);

        from.add(radioEkslusif);
        from.add(radioUmum);

        //untuk menambahkan group radiobutton
        ButtonGroup groupMembership = new ButtonGroup();
        groupMembership.add(radioEkslusif);
        groupMembership.add(radioUmum);


        // bagian biyaya
        JLabel labelBiaya = new JLabel("Biaya Per Hari");
        labelBiaya.setBounds(50,170,150,25);
        from.add(labelBiaya);
        JTextField textBiaya = new JTextField();
        textBiaya.setBounds(180,170,170,25);
        from.add(textBiaya);

        // bagian tanggal
        JLabel labelTgl = new JLabel("Tanggal Pinjam");
        labelTgl.setBounds(50,200,150,25);
        from.add(labelTgl);
        // combobox tanggal - hari
        String hari [] = new String[31];
        for (int i = 0; i < hari.length; i++ ){
            hari[i] = Integer.toString(i + 1);
        }
        JComboBox<String> chHari;
        chHari = new JComboBox<>(hari);
        chHari.setBounds(180, 200, 45, 25);
        from.add(chHari);

        // combobox tanggal - bulan
        String bulan [] =  {"Jan","Feb","Mar","Apr","Mei","Jun","Jul","Ags","Sep","Okt","Nov","Des"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(229,200,52,25);
        from.add(cbBulan);

        // textfield untuk tahun
        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(285,200,65,25);
        from.add(txtTahun);


        // bagian lama pinjaman
        JLabel labelPinjaman = new JLabel("Lama Pinjaman");
        labelPinjaman.setBounds(50,230, 150,25);
        from.add(labelPinjaman);
        String pinjam [] =  {"Satu Hari","Dua Hari","Tiga Hari","Empat Hari","Lima Hari","Enam Hari","Tujuh Hari"};
        JComboBox cbPinjam = new JComboBox(pinjam);
        cbPinjam.setBounds(180,230,112,25);
        from.add(cbPinjam);

        // total biaya
        JLabel labelTotalBiaya = new JLabel("Totol Biaya" );
        labelTotalBiaya.setBounds(50,260,150,25);
        from.add(labelTotalBiaya);
        JTextField txtTotalBiaya = new JTextField();
        txtTotalBiaya.setBounds(180,260,170,25);
        from.add(txtTotalBiaya);

        // jumlah bayar
        JLabel labelJumalahBayar = new JLabel("Jumlah Bayar");
        labelJumalahBayar.setBounds(50,290,290,25);
        from.add(labelJumalahBayar);
        JTextField txtJumlahBayar = new JTextField();
        txtJumlahBayar.setBounds(180,290,170,25);
        from.add(txtJumlahBayar);

        // kembalian
        JLabel labelKembalian = new JLabel("Kembalian");
        labelKembalian.setBounds(50,320,290,25);
        from.add(labelKembalian);
        JTextField txtKembalian = new JTextField();
        txtKembalian.setBounds(180,320,170,25);
        from.add(txtKembalian);

        // button simpan / reset
        JButton buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(180,355,87,25);
        from.add(buttonSimpan);
        JButton buttonReset = new JButton("Reset");
        buttonReset.setBounds(270,355,79,25);
        from.add(buttonReset);

        from.setVisible(true); // untuk menampilkan from
        // ============== AKHIR COMPONENT ==============

    }

}
