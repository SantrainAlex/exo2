package org.example.Hotel;

import java.util.Random;

public class Chambre {
    private int id;
    private boolean status = false;
    private int nbrLits;
    private double tarif;

    private static int nbrChambre = 0;


    public Chambre(int nbrLits, double tarif) {
        this.id = nbrChambre++;
        this.nbrLits = nbrLits;
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Chambre n° " +
                id +
                ", status=" + status +
                ", nbrLits=" + nbrLits +
                ", tarif=" + tarif;
    }
}
