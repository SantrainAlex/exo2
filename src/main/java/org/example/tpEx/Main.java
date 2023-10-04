package org.example.tpEx;

import org.example.cours.exption.DivisionEx;
import org.example.cours.exption.MainEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        boolean checkType = false;
        do{
            a = 0;
            try {
                System.out.println("Donner a :");
                a = scanner.nextInt();
            }catch (Exception e){
                a = 0;
                System.out.println("type incorrecte Veuillez donner un nombre");
            }
            if(a == 0) {
                System.out.println("Donner un chiffre diférent de 0");
            }
        }while (a == 0 );


        System.out.println("Donner b :");
        int b = scanner.nextInt();
        int resultat =0;
        try {
            resultat = Main.divideNumber(a,b);
        }catch (DivisionEx e) {
            System.out.println(e.getMessage());
        }
        System.out.println("res "+ resultat);
    }

    public static int divideNumber(int a, int b) throws DivisionEx {
        if( b == 0 || a == 0){
            throw new DivisionEx();
        }
        return a / b;
    }
}
