package org.example.Hotel;

import java.util.ArrayList;

public class Reservation {
    private int id;
    private boolean status;

    private ArrayList<Chambre> listChambre;
    private Client client;

    {
        ++id;
        this.status = false;
    }

    public Reservation(ArrayList<Chambre> listChambre, Client client) {
        this.listChambre = listChambre;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", status=" + status +
                ", listChambre=" + listChambre +
                ", client=" + client +
                '}';
    }
}
