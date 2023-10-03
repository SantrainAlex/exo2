package org.example;

import org.example.generique.Hangar;
import org.example.generique.Moto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hangar<Moto> motoHangar = new Hangar<Moto>();
        motoHangar.addElement(new Moto("1000 CBR"));
        System.out.println(motoHangar.getAll());
    }
}