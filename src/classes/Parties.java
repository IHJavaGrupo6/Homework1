package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Parties {
    private static List<Character> party1;
    private static List<Character> party2;

    private List<Character> graveyard;

    public Parties() {
        this.party1 = new ArrayList<>();
        this.party2 = new ArrayList<>();
        this.graveyard = new ArrayList<>();
    }

    public Parties(List<Character> party1, List<Character> party2) {
        setParty1(party1);
        setParty2(party2);
        this.graveyard = new ArrayList<>();
    }

    public static List<Character> getParty1() {
        return party1;
    }

    public void setParty1(List<Character> party1) {
        this.party1 = party1;
    }

    public static List<Character> getParty2() {
        return party2;
    }

    public void setParty2(List<Character> party2) {
        this.party2 = party2;
    }

    public List<Character> getGraveyard() {
        return graveyard;
    }


    // generates two random parties of 5 to 10 characters
    public static void generateParty() {
        Random random = new Random();
        int lengthParty = random.nextInt(5, 10);
        for (int i = 0; i < lengthParty; i++) {
            if (random.nextBoolean() == true) {
                party1.add(new Warrior());
                party2.add(new Warrior());
            } else {
                party1.add(new Wizard());
                party2.add(new Wizard());
            }
        }
        System.out.println("Created two parties!");
        System.out.println("Party 1: \n" + party1.toString());
        System.out.println("Party 2: \n" + party2.toString());
        System.out.println("Ready to battle!");
    }

    // moves killed character to graveyard
    public void moveToGraveyard(Character character, List<Character> party) {

        graveyard.add(character);
        party.remove(character);
    }

    // method for adding a character to one of the parties
    public static void addCharacterParty(Character character, List<Character> party) {
        party.add(character);
    }

    // method for picking a character for the round
    public Character selectCharacter(List<Character> party, int index) {
        return party.get(index);
    }


}
