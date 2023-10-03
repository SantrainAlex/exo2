package org.example.generique;

public class Hangar<T> {
    private T contenu;

    public Hangar(T contenu){
        this.contenu = contenu;
    }

    public T getContenu(){
        return contenu;
    }

    public void setContenu(T contenu){
        this.contenu = contenu;
    }
}
