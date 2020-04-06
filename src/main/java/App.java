package main.java;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.model.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        // Create list to store pokemons
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        boolean running = true;
        Scanner in = new Scanner(System.in);
        // Add pokemons to the list
        pokemons.add(new Pokemon("Bulbasaur", 1, new String[] { "Grass", "Poison" }));
        pokemons.add(new Pokemon("Ivysaur", 2, new String[] { "Grass", "Poison" }));
        pokemons.add(new Pokemon("Venusaur", 3, new String[] { "Grass", "Poison" }));
        pokemons.add(new Pokemon("Charmander", 4, new String[] { "Fire" }));
        pokemons.add(new Pokemon("Charmeleon", 5, new String[] { "Fire" }));
        pokemons.add(new Pokemon("Charizard", 6, new String[] { "Fire", "Flying" }));
        pokemons.add(new Pokemon("Squirtle", 7, new String[] { "Water" }));
        pokemons.add(new Pokemon("Wartortle", 8, new String[] { "Water" }));
        pokemons.add(new Pokemon("Blastoise", 9, new String[] { "Water" }));

        // Focus on the code above for OOP, below is just functionality stuff.

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        displayMenu();

        while (running)
            switch (in.nextInt()) {
                case 0:
                    System.out.println();
                    displayPokemon(pokemons);
                    displayMenu();
                    break;
                case 1:
                    System.out.println();
                    displayMenu();
                    break;
                case 2:
                    System.out.println();
                    displayMenu();
                    break;
                case 3:
                    System.out.println();
                    displayMenu();
                    break;
                case 4:
                    System.out.println();
                    displayMenu();
                    break;
                case 5:
                    System.out.println();
                    displayMenu();
                    break;
                case 6:
                    System.out.println();
                    displayMenu();
                    break;
                case 7:
                    System.out.println();
                    displayMenu();
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Exiting...");
                    running = false;
                    in.close();
                    break;
                default:
                    System.out.println();
                    System.out.println("Please enter a valid number.");
                    displayMenu();
                    break;
            }

    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("Welcome to your Pokedex");
        System.out.println("Please select an option");
        System.out.println("0. Show all Pokemon.");
        System.out.println("1. Show all Starter Pokemon.");
        System.out.println("2. Show all Grass Pokemon.");
        System.out.println("3. Show all Fire Pokemon.");
        System.out.println("4. Show all Water Pokemon.");
        System.out.println("5. Show all Final Pokemon.");
        System.out.println("6. Add a Pokemon.");
        System.out.println("7. Remove a Pokemon.");
        System.out.println("8. Exit.");
        System.out.print("Option: ");
    }

    private static void displayPokemon(ArrayList<Pokemon> pokemons) {
        String format = "%-5s %-20s %-20s";
        for (Pokemon p : pokemons) {
            String[] types = p.getType();
            String stringTypes = "";
            for (int index = 0; index < types.length - 1; index++) {
                stringTypes = stringTypes.concat(types[index] + ", ");
            }
            stringTypes = stringTypes.concat(types[types.length - 1]);
            System.out.printf(format, p.getNumber(), p.getName(), stringTypes);
            System.out.println();
        }
    }
}