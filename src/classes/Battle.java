package classes;

import java.util.List;
import java.util.Scanner;

public class Battle {

    private Parties parties;

    public Battle() {
        parties = new Parties();
    }

    public Battle(List<Character> party1, List<Character> party2) {
        parties = new Parties(party1, party2);
    }


    // round: attack while both of the players has hp
    public void battleRound() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select player from party 1: ");
        for (int i = 0; i < parties.getParty1().size(); i++) {
            System.out.println(i + ". " + parties.getParty1().get(i).toString());
        }
        int index1 = input.nextInt();
        input.nextLine();
        Character player1 = parties.selectCharacter(parties.getParty1(), index1);

        System.out.println("Select player from party 2: ");
        for (int i = 0; i < parties.getParty2().size(); i++) {
            System.out.println(i + ". " + parties.getParty2().get(i).toString());
        }
        int index2 = input.nextInt();
        input.nextLine();
        Character player2 = parties.selectCharacter(parties.getParty2(), index2);

        while (player1.isAlive() && player2.isAlive()) {

            int damage1 = player2.attack();
            player1.decreaseHp(damage1);
            System.out.println(player2.getName() + " deals " + damage1 + " damage points to " + player1.getName() + ".");
            System.out.println(player1.getName() + " has " + player1.getHp() + " health points left.");
            int damage2 = player1.attack();
            player2.decreaseHp(damage2);
            System.out.println(player1.getName() + " deals " + damage2 + " damage points to " + player2.getName() + ".");
            System.out.println(player2.getName() + " has " + player2.getHp() + " health points left.\n");
        }

        if (!player1.isAlive()) {
            parties.moveToGraveyard(player1, parties.getParty1());
            System.out.println(player1.getName() + " is dead now. Moved to Graveyard.\n");
        }
        if (!player2.isAlive()) {
            parties.moveToGraveyard(player2, parties.getParty2());
            System.out.println(player2.getName() + " is dead now. Moved to Graveyard.\n");
        }

        System.out.println("Graveyard:\n" + parties.getGraveyard().toString() + "\n");

        if (Parties.getParty1().size() > 0 && Parties.getParty2().size() == 0)
            System.out.println("Party 1 is the winner!\n");
        if (Parties.getParty2().size() > 0 && Parties.getParty1().size() == 0)
            System.out.println("Party 2 is the winner!\n");
    }
}
