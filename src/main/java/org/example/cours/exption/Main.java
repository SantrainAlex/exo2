package org.example.cours.exption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner a :");
        int a = scanner.nextInt();
        System.out.println("Donner b :");
        int b = scanner.nextInt();
        int resultat =0;
        try {
            resultat = Main.divideNumber(a,b);
        }catch (ArithmeticException e){
            System.out.println(e);

        }
        System.out.println("res "+ resultat);
    }

    public static int divideNumber(int a, int b){
        return a / b;
    }
}
