package org.example.generique;

public class Moto {
    private String Name;

    public Moto(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
