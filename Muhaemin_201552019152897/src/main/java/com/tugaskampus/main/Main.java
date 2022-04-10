/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tugaskampus.main;

/**
 *
 * @author muhaemin
 */

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

    void Pemain(){
        System.out.println("\nName : " + this.nama);
        System.out.println("Health : " + this.nyawa + " hp");
        this.senjata.pemain();
        this.kostum.pemain();
    }
}

// senjata
class Senjata{
    double kekuatanSerangan;
    String nama;

    Senjata(String nama, double kekuatanSerangan){
        this.nama = nama;
        this.kekuatanSerangan = kekuatanSerangan;
    }

    void display(){
        System.out.println("Weapon : " + this.nama + " , attack : " + this.kekuatanSerangan);
    }

    void pemain() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    void Pemain(){
        System.out.println("Armor : " + this.nama + " , defence : " + this.kekuatanBertahan);
    }

    void pemain() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Main{

    public static void main(String[] args) {
        
        // membuat object player
        Pemain pemain1 = new Pemain("ucup",100);
        Pemain pemain2 = new Pemain("otong",50);

        // membuat object weapon
        Senjata pedang = new Senjata("pedang",15);
        Senjata ketapel = new Senjata("ketapel",1);

        // membuat object armor
        Kostum bajuBesi = new Kostum("baju besi",10);
        Kostum kaos = new Kostum("kaos",0);
        
        // player 1
        pemain1.equipSenjata(pedang);
        pemain1.equipKostum(bajuBesi);
        pemain1.Pemain();

        // player 2
        pemain2.equipSenjata(ketapel);
        pemain2.equipKostum(kaos);
        pemain2.Pemain();
    }
}