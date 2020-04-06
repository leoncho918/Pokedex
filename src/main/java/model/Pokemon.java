package main.java.model;

public class Pokemon {
    private String name;
    private int number;
    private String[] type;

    public Pokemon(String name, int number, String[] type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String[] getType() {
        return type;
    }
}