package com.javacampus;

//class,object dan constructor

// membuat class
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}
public class Main {
    public static void main(String[] args){
        // instansiasi / object
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "muhaemin";
        mhs1.NIM = "34343848";
        mhs1.jurusan = "teknik perteknikan";
        mhs1.IPK = 4;
        mhs1.umur = 23;

        System.out.println("nama : "+mhs1.nama);
        System.out.println(mhs1.NIM);
        System.out.println(mhs1.jurusan);
        System.out.println(mhs1.IPK);
        System.out.println(mhs1.umur);
    }

}
