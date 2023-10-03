package org.example.Hotel;

import java.util.ArrayList;
import java.util.Random;

public class Hotel {
    private ArrayList<Client> listClients;
    private ArrayList<Chambre> listChambres;
    private ArrayList<Reservation> listReservation;

    public Hotel(ArrayList<Client> listClients, ArrayList<Chambre> listChambres, ArrayList<Reservation> listReservation) {
        this.listClients = listClients;
        this.listChambres = listChambres;
        this.listReservation = listReservation;
    }

    public ArrayList<Client> getListClients() {
        return listClients;
    }

    public ArrayList<Chambre> getListChambres() {
        return listChambres;
    }

    public ArrayList<Reservation> getListReservation() {
        return listReservation;
    }
}
