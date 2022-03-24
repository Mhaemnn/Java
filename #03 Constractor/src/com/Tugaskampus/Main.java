/*
Pemilik : Muhaemin
Pertemuan ke - 3 [Constructor]
Constructor adalah method khusus yang akan di eksekusi saat pembuataan object (instance)
*/

package com.Tugaskampus;

//class tampa CONSTRUCTOR
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    String IPK;


    //ini adalah constructor
    Mahasiswa(){
        System.out.println("ini adalah consrtuctor");
    }
}

public class Main {

    public static void main(String[] args) {
	// object (instance) dari Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
//        mhs1.nama = "mamot";
//        mhs1.NIM = "849580";
//        mhs1.jurusan = "teknik tidur";
//        mhs1.IPK = "387438";

//        System.out.println(mhs1.nama);
    }
}
