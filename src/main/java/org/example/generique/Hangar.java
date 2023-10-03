package org.example.generique;

import java.util.ArrayList;

public class Hangar<T> {
    private ArrayList<T> tableau;

    public Hangar() {
        this.tableau = new ArrayList<T>();
    }

    public ArrayList<T> getAll(){
        return tableau;
    }

    public void addElement(T value){
        tableau.add(value);
    }
}
