package org.example.cours.exption;

import java.util.Scanner;

public class MainEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner a :");
        int a = scanner.nextInt();
        System.out.println("Donner b :");
        int b = scanner.nextInt();
        int resultat =0;
        try {
         resultat = MainEx.divideNumber(a,b);
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
//    public static int divideNumber(int a, int b) throws Exception {
//        if( b == 0 || a == 0){
//            throw new Exception("pas de division par zerro");
//        }
//        return a / b;
//    }
}
