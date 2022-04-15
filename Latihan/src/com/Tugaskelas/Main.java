package com.Tugaskelas;
// pemain
class Pemain{
    String nama;
    double nyawa;
    int level;
    // object member
    Senjata senjata;
    Kostum kostum;

    Pemain(String nama, double nyawa){
        this.nama = nama;
        this.nyawa = nyawa;
    }

    void equipSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    void equipKostum(Kostum kostum){
        this.kostum = kostum;
    }

    void tampil(){
        System.out.println("\nNama : " + this.nama);
        System.out.println("Nyawa  : " + this.nyawa + " hp");
        this.senjata.tampil();
        this.kostum.pemain();
    }
}

// senjata
class Senjata{
    double kekuatanSerang;
    String nama;

    Senjata(String nama, double kekuatanSerang){
        this.nama = nama;
        this.kekuatanSerang = kekuatanSerang;
    }

    void tampil(){
        System.out.println("Senjata : " + this.nama + " , Serangan : " + this.kekuatanSerang);
    }
}

// kostum
class Kostum{
    double kekuatanBertahan;
    String nama;

    Kostum(String nama, double kekuatanBertahan){
        this.nama = nama;
        this.kekuatanBertahan = kekuatanBertahan;
    }

    void tampil(){
        System.out.println("Kostum : " + this.nama + " , Bertahan : " + this.kekuatanBertahan);
    }

    public void pemain() {
    }
}

public class Main{

    public static void main(String[] args) {

      //membuat objek pemain
        Pemain pemain1 = new Pemain("Doni", 90);
        Pemain pemain2 = new Pemain("Rio", 50);

        //membuat senjata objek
        Senjata kapak = new Senjata("Kapak", 60);
        Senjata pukulan = new Senjata("pukulan", 10);

        //membuat kostum objek
        Kostum spiderman = new Kostum("spiderman",10);
        Kostum hulk = new Kostum("hulk",50);

        //pemain1
        pemain1.equipKostum(spiderman);
        pemain1.equipSenjata(kapak);
        pemain1.tampil();

        //pemain2
        pemain2.equipKostum(hulk);
        pemain2.equipSenjata(pukulan);
        pemain2.tampil();
    }
}