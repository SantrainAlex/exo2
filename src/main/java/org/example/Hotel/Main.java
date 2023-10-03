package org.example.Hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> listClient = new ArrayList<Client>();
        ArrayList<Chambre> listChambre = new ArrayList<Chambre>();
        ArrayList<Reservation> listReservation = new ArrayList<Reservation>();

        listClient.add(new Client("Santrain", "Alexis", "060600"));
        listChambre.add(new Chambre(5, 55.1));
        listReservation.add(new Reservation(listChambre, listClient.get(0)));

        Hotel noveHotel = new Hotel(listClient, listChambre, listReservation);

        System.out.println(noveHotel.getListChambres());
        System.out.println(noveHotel.getListClients());
        System.out.println(noveHotel.getListReservation());

    }
}
