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


        // ============== BAGIA COMPONENT ==============
        JLabel labelJudul = new JLabel("Aplikasi Peminjaman Buku"); // membuat object komponen
        labelJudul.setBounds(115,30,220,30); // mengatur posisi dan ukuran komponen
        from.add(labelJudul); // memasukan komponen ke from / container


        // bagia kode buku
        JLabel labelKodeBuku = new JLabel("Kode Buku");
        labelKodeBuku.setBounds(60,80,150,25);
        from.add(labelKodeBuku);
        JTextField txtKodeBuku = new JTextField();
        txtKodeBuku.setBounds(190,80, 150,25);
        from.add(txtKodeBuku);

        // bagian nama buku
        JLabel labelNamaBuku = new JLabel("Kode Buku");
        labelNamaBuku.setBounds(60,110,150,25);
        from.add(labelNamaBuku);
        JTextField txtNamaBuku = new JTextField();
        txtNamaBuku.setBounds(190,110, 150,25);
        from.add(txtNamaBuku);

        // bagian membership
        JLabel labelMembership = new JLabel("Membership");
        labelMembership.setBounds(60, 140, 150, 25);
        from.add(labelMembership);
        //ekslusif
        JRadioButton radioKhusus = new JRadioButton();
        radioKhusus.setText("Khusus");
        radioKhusus.setBounds(190,140,100,25);
        //umum
        JRadioButton radioUmum = new JRadioButton();
        radioUmum.setText("Umum");
        radioUmum.setBounds(270,140,100,25);

        from.add(radioUmum);
        from.add(radioKhusus);

        //untuk menambahkan group radiobutton
        ButtonGroup groupMembership = new ButtonGroup();
        groupMembership.add(radioKhusus);
        groupMembership.add(radioUmum);


        // bagian biyaya
        JLabel labelBiaya = new JLabel("Biaya Per Hari");
        labelBiaya.setBounds(60,170,150,25);
        from.add(labelBiaya);
        JTextField textBiaya = new JTextField();
        textBiaya.setBounds(190,170,150,25);
        from.add(textBiaya);

        // bagian tanggal
        JLabel labelTgl = new JLabel("Tanggal Pinjam");
        labelTgl.setBounds(60,200,150,25);
        from.add(labelTgl);
        // combobox tanggal - hari
        String hari [] = new String[31];
        for (int i = 0; i < hari.length; i++ ){
            hari[i] = Integer.toString(i + 1);
        }
        JComboBox<String> chHari;
        chHari = new JComboBox<>(hari);
        chHari.setBounds(190, 200, 44, 25);
        from.add(chHari);

        // combobox tanggal - bulan
        String bulan [] =  {"Jan","Feb","Mar","Apr","Mei","Jun","Jul","Ags","Sep","Okt","Nov","Des"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(239,200,52,25);
        from.add(cbBulan);

        // textfield untuk tahun
        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(295,200,45,25);
        from.add(txtTahun);


        // bagian lama pinjaman
        JLabel labelPinjaman = new JLabel("Lama Pinjaman");
        labelPinjaman.setBounds(60,230, 150,25);
        from.add(labelPinjaman);
        String pinjam [] =  {"Satu Hari","Dua Hari","Tiga Hari","Empat Hari","Lima Hari","Enam Hari","Tujuh Hari"};
        JComboBox cbPinjam = new JComboBox(pinjam);
        cbPinjam.setBounds(190,230,102,25);
        from.add(cbPinjam);

        // total biaya
        JLabel labelTotalBiaya = new JLabel("Totol Biaya" );
        labelTotalBiaya.setBounds(60,260,150,25);
        from.add(labelTotalBiaya);
        JTextField txtTotalBiaya = new JTextField();
        txtTotalBiaya.setBounds(190,260,150,25);
        from.add(txtTotalBiaya);

        // jumlah bayar
        JLabel labelJumalahBayar = new JLabel("Jumlah Bayar");
        labelJumalahBayar.setBounds(60,290,290,25);
        from.add(labelJumalahBayar);
        JTextField txtJumlahBayar = new JTextField();
        txtJumlahBayar.setBounds(190,290,150,25);
        from.add(txtJumlahBayar);

        // kembalian
        JLabel labelKembalian = new JLabel("Kembalian");
        labelKembalian.setBounds(60,320,290,25);
        from.add(labelKembalian);
        JTextField txtKembalian = new JTextField();
        txtKembalian.setBounds(190,320,150,25);
        from.add(txtKembalian);

        // button simpan / reset
        JButton buttonSimpan = new JButton("Save");
        buttonSimpan.setBounds(190,350,70,30);
        from.add(buttonSimpan);
        JButton buttonReset = new JButton("Rese");
        buttonReset.setBounds(270,350,70,30);
        from.add(buttonReset);








        from.setVisible(true); // untuk menampilkan from
    }
}
