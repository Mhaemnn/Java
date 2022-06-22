package com.javacampus;
//tugas class constructor dan method

//Player
class Player{
    String name;
    double health;
    int level;

    //object member
    Weapon weapon;
    Armor armor;

    //constructor
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("nama: "+this.name);
        System.out.println(("health: "+this.health + "hp"));
        this.weapon.display();
        this.armor.display();
    }
}

//weapon
class Weapon{
    String name;
    double attPower;

    Weapon(String name, double attPower){
        this.name = name;
        this.attPower = attPower;
    }
    void display(){
        System.out.println("Weapon: " + this.name + ", power: " + this.attPower);
    }
}

//armor
class Armor{
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Armor: " + this.name + ", power: " + this.defencePower);
    }

}
public class Main {
    public static void main(String[] args){
        //object player
        Player player1 = new Player("muhaemin",100);
        Player player2 = new Player("Rama", 90);
        //object weapon
        Weapon katana = new Weapon("katana", 90);
        Weapon panah = new Weapon("panagh", 50);

        //obect armor
        Armor bajuBesi = new Armor("Baju Besi", 100);
        Armor bajuBatu = new Armor("bajuBatu", 10);
        //equip Weapon and Armor
        player1.equipWeapon(katana);
        player1.equipArmor(bajuBesi);
        player1.display();

        System.out.println("==============================");

        player2.equipWeapon(panah);
        player2.equipArmor(bajuBatu);
        player2.display();
    }
}
