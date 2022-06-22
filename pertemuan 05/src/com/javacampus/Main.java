package com.javacampus;
//class buku
class Buku{
    String judul;
    String penulis;

    //constructor
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    //method dengan nama display
    void display(){
        System.out.println("\njudul\t: " + this.judul);
        System.out.println("penulis\t: " + this.penulis);
    }

}

public class Main {
public static void main(String[]args){
    Buku buku1 = new Buku("Pemrograman Java", "Sudirman");
    buku1.display();

    //untuk menampilkan address
    String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
    System.out.println(addressBuku1);

    //assigment object
    Buku buku2 = buku1;
    buku2.display();
    String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
    System.out.println(addressBuku2);

    //karena buku1 dan buku2 berada pada address atau refrensi yang sama
    buku1.judul = "Algoritma dan Pemrograman";
    buku1.display();
    buku2.display();

    //kita akan memasukan object kedalam method
    fungsi(buku2);
    buku1.display();
    buku2.display();
}
public static void fungsi(Buku dataBuku){
    String addressDatatBuku = Integer.toHexString(System.identityHashCode(dataBuku));
    System.out.println("address dalam fungsi" + addressDatatBuku);
    dataBuku.penulis = "singosari";
}
}
