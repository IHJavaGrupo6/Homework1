package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Parties {
    private List<Character> party1;
    private List<Character> party2;

    private  List<Character> graveyard;





    public Parties() {
        this.party1 = new ArrayList<>();
        this.party2 = new ArrayList<>();
        this.graveyard = new ArrayList<>();
    }

    public Parties(List<Character> party1,List<Character> party2 ) {
        setParty1(party1);
        setParty2(party2);
        this.graveyard = new ArrayList<>();
    }

    public List<Character> getParty1() {
        return party1;
    }

    public void setParty1(List<Character> party1) {
        this.party1 = party1;
    }

    public List<Character> getParty2() {
        return party2;
    }

    public void setParty2(List<Character> party2) {
        this.party2 = party2;
    }
    public List<Character> getGraveyard() {
        return graveyard;
    }


    //Constructor - Crea una party desde una lista de personajes

    /*//Genera una party aleatoria entre 10 y 20
    public List<Character> generateParty(){
       int lengthParty = ThreadLocalRandom.current().nextInt(10,20);
        for (int i = 0; i < lengthParty; i++) {
            if(ThreadLocalRandom.current().nextBoolean() == true){
                party.add(Warrior.random);
            }else{
                party.add(Wizard.random);
            }
        }
        return party;
    }
    */
    //Quita al personaje selecionado a la lista graveyard
    public void moveToGraveyard(Character character,List<Character> party){

        graveyard.add(character);
        party.remove(character);
    }

    // el metodo añade a un character en un determinado indice
    public void addCharacterParty(Character character, List<Character> party){
        party.add(character);
    }

    public Character selectCharacter(List<Character> party,int index){
        return party.get(index);
    }


}
