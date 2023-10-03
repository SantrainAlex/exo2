package org.example.Hotel;

import java.util.Random;

public class Chambre {
    private int id;
    private boolean status;
    private int nbrLits;
    private double tarif;
    {
        ++id;
        status = false;
    }

    public Chambre(int nbrLits, double tarif) {
        this.nbrLits = nbrLits;
        this.tarif = tarif;
    }

    {
        ++id;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", status=" + status +
                ", nbrLits=" + nbrLits +
                ", tarif=" + tarif +
                '}';
    }
}
