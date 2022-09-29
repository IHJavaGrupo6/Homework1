package classes;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battle {

    private Parties parties;

    public Battle() {
        parties = new Parties();
    }

    public Battle(List<Character> party1,List<Character> party2) {
        parties = new Parties(party1, party2);
    }


    // round: attack while both of the players has hp
    public void battleRound(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select player from party 1: ");
        System.out.println(parties.getParty1().toString());
        int index1 = input.nextInt();
        input.nextLine();
        Character player1 = parties.selectCharacter(parties.getParty1(), index1);

        System.out.println("Select player from party 2: ");
        System.out.println(parties.getParty2().toString());
        int index2 = input.nextInt();
        input.nextLine();
        Character player2 = parties.selectCharacter(parties.getParty2(), index2);

        while (player1.isAlive() && player2.isAlive()){
            player1.decreaseHp(player2.attack());
            player2.decreaseHp(player1.attack());
        }

        if (!player1.isAlive()){
            parties.moveToGraveyard(player1, parties.getParty1());
        }
        if (!player2.isAlive()) {
            parties.moveToGraveyard(player2, parties.getParty2());
        }
        System.out.println((parties.getGraveyard().toString()));
    }

    //attack tiene que devolver la cantidad de damage

    //select player
    /*este metodo podria ir en Parties
    entonces seria:
    playerOne = partyOne.getPlayer()
    playerTwo = partyTwo.getPlayer()
    or
    playerOne = partyOne.getPlayer(index)
    playerTwo = partyTwo.getPlayer(index)

    //option 1 select random player
    public Character selectPlayer(){
        Random random = new Random();
        int index = random.nextInt(0, partyOne.size());
        return partyOne.getPlayer(index);
    }
    //option 2 select player by index
    public Character selectPlayer(int index){
        return partyOne.getPlayer(index);
    }


    public void battleRound(){
        while (selectPlayer().isAlive() || )

    }

    public Character getPlayerOne() {
        return playerOne;
    }

     */
}
