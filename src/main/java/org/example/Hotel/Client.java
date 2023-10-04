package org.example.Hotel;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String tel;

    private static int nbrClient = 0;


    public Client( String nom, String prenom, String tel) {
        this.id = nbrClient++;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Client n°" +
                id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel;
    }
}
