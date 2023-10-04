package org.example.Hotel;

import java.util.ArrayList;

public class Reservation {
    private int id;
    private boolean status = false;

    private ArrayList<Chambre> listChambre;
    private Client client;
    private static int nbrReservation = 0;


    public Reservation(ArrayList<Chambre> listChambre, Client client) {
        this.id = nbrReservation++;
        this.listChambre = listChambre;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation n° " +
                 id +
                ", status=" + (status ? "en cour ": "fini") +
                ", listChambre=" + listChambre +
                ", client=" + client;
    }
}
