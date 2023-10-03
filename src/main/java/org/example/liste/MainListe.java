package org.example.liste;

import java.util.ArrayList;

public class MainListe {
    public static void main(String[] args) {
        ArrayList<String> prenoms = new ArrayList<String>();

        prenoms.add("Alexis");
        prenoms.add("Toto");
        prenoms.add("Tata");
        prenoms.add("Christophe");

        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(3));

        prenoms.set(0, "Santrain");
        System.out.println(prenoms.get(0));

        System.out.println("Taille de la list "+prenoms.size());

        prenoms.remove(0);
        System.out.println(prenoms.size());
        System.out.println(prenoms.get(0));

        for (String prenom:prenoms) {
            System.out.println(prenom);
        }

        for (int i = 0; i < prenoms.size(); i++) {
            System.out.println(prenoms.get(i));
        }

    }
}
