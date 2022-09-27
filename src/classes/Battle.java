package classes;

import java.util.Random;

public class Battle {

    private Parties parties = new Parties();
    private Parties partyOne = parties.getPartyOne();
    private Parties partyTwo = parties.getPartyTwo();
    private Parties graveyard = parties.getGraveyard();
    private Character playerOne;
    private Character playerTwo;

    public Battle() {
        //creando una party nueva para cada jugador
        this.partyOne = new Parties();
        this.partyTwo = new Parties();
        this.graveyard = new Parties(); //una party vacia
    }

    public Battle(Parties partyOne, Parties partyTwo, Parties garveyard, Character playerOne, Character playerTwo) {
        this.partyOne = parties.getPartyOne;
        this.partyTwo = parties.getPartyTwo;
        this.graveyard = parties.getGraveyard();
    }


    // round: attack while both of the players has hp
    public void battleRound(){
        parties.getPlayerOne();
        parties.getPlayerTwo();
        while (playerOne.getHp() > 0 && playerTwo.getHp() > 0){
            //method attack has to return int damage
            int damagePlayerOne = playerOne.attack;
            playerTwo.setHp(playerTwo.getHp() - damagePlayerOne);
            int damagePlayerTwo = playerTwo.attack;
            playerOne.setHp(playerOne.getHp() - damagePlayerTwo);
        }
        if (playerOne.getHp() <= 0 ){
            playerOne.moveToGraveyard();
        } else if (playerTwo.getHp() <= 0) {
            playerTwo.moveToGraveyard();
        }
        parties.showGraveyard();
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
