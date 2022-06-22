package com.javacampus;
// constructor,class,object java
//this is class
class User{
    String username;
    String password;

    User(String inputName, String inputPassword){
        username = inputName;
        password = inputPassword;

        System.out.println("username:"+inputName);
        System.out.println("password:"+inputPassword);
    }
}
public class Main {
    public static void main(String[] args){
        //this istansiasi or object
        User muhaemin = new User("muhaemin", "8308493");
        User Rama = new User("Rama", "3848038");

    }

}
