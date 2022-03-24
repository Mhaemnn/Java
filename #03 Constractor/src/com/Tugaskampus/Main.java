package com.Tugaskampus;

//class tampa CONSTRUCTOR
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    String IPK;


    //ini adalah constructor tampa parameter
//    Mahasiswa(){
//
//        System.out.println("ini adalah consrtuctor");
//    }
//}
    //contructor dengan parameter
    Mahasiswa(String inputNama, String inputJurusan){
        inputNama = inputNama;
        inputJurusan = inputJurusan;

        System.out.println(inputNama);
        System.out.println(inputJurusan);
    }
}
public class Main {

    public static void main(String[] args) {
	// object (instance) dari Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("samsudin", "teknik terbang");
        Mahasiswa mhs2 = new Mahasiswa("rama", "teknik propokasi");



//        mhs1.nama = "mamot";
//        mhs1.NIM = "849580";
//        mhs1.jurusan = "teknik tidur";
//        mhs1.IPK = "387438";

//        System.out.println(mhs1.nama);
    }
}
