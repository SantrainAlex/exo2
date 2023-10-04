package org.example.Hotel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Client> listClient = new ArrayList<Client>();
        ArrayList<Chambre> listChambre = new ArrayList<Chambre>();
        ArrayList<Reservation> listReservation = new ArrayList<Reservation>();

        listClient.add(new Client("Santrain", "Alexis", "060600"));
        int randomInt = new Random().nextInt(7);

        for (int i = 0; i < randomInt +1; i++) {
            int nbrLit = new Random().nextInt(3);
            int price = new Random().nextInt(100);

            listChambre.add(new Chambre(nbrLit, price));
        }

        listReservation.add(new Reservation(listChambre, listClient.get(0)));

        Hotel noveHotel = new Hotel(listClient, listChambre, listReservation);
        for (Chambre chambre:noveHotel.getListChambres()) {
            System.out.println(chambre);
        }
        boolean exit = true;
        int choix = 0;
        while ((exit)) {
            switch (choix){
                case 0:
                    Scanner scanner = new Scanner(System.in);
                    String nomHotel = scanner.nextLine();
                    System.out.println("ok");
                    exit = false;
                    break;
            }
        }
        System.out.println(noveHotel.getListClients());
        System.out.println(noveHotel.getListReservation());

    }
}
