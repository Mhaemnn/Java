package com.javacampus;

import javax.swing.*;
import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        // deklarasi varible
        String strFarenhait;
        double farenhait, celcius;

        // menghitung data fahrenheit
        strFarenhait = JOptionPane.showInputDialog(null,"masukan nilai derajat Fahrenheit", "Fahrenheit ke celcius", JOptionPane.QUESTION_MESSAGE);


        // konversi string numerik ke numerik
        farenhait = Double.parseDouble(strFarenhait);

        // Menghitung Celcius
        celcius = (int)((5.0 / 9) * (fahrenheit - 32) * 100) / 100.0;

        // menampilkan hasil
        JOptionPane.showMessageDialog(null, "Suhu dalam Fahrenheit : " + fahrenheit + "\nHasil konversi ke Celcius : " + celcius,"Fahrenheit Ke Celcius", JOptionPane.INFORMATION_MESSAGE);
        // akhir program
        System.exit(0);
    }
}
