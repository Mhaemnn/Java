/**
=============================================
 Pada pertemuan ke -2: Class & Object
    = Class -> template atau wadah (loyang)
    = Object -> isi dari template atau wadah (kue)
==============================================
 **/


package com.Tugaskampus;

//class atau template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    int IPK;
}
public class Main {

    public static void main(String[] args) {
	// object dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhaemin";
        mhs1.NIM = "03804803";
        mhs1.jurusan = "Teknik menghilang";
        mhs1.IPK = 88;

        System.out.println(mhs1.nama);
        System.out.println(mhs1.NIM);
        System.out.println(mhs1.jurusan);
        System.out.println(mhs1.IPK);
    }
}
