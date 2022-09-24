package classes;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Parties {
    private ArrayList<Character> party;
    private ArrayList<Character> graveyard;



    //Constructor - Crea una party desde una lista de personajes

    public Parties(ArrayList<Character> party) {
        setParty(party);
    }
    //Genera una party aleatoria entre 10 y 20
    public ArrayList<Character> generateParty(){
       int lengthParty = ThreadLocalRandom.current().nextInt(10,20);
        for (int i = 0; i < lengthParty; i++) {
            if(Math.random() == 0.0){
                party.add(Warrior.randomWarrior);
            }else{
                party.add(Wizzard.randomWizzard);
            }
        }
        return party;
    }
    //Quita al personaje selecionado a la lista graveyard
    public void moveToGraveyard(int index){
        graveyard.add(party.get(index));
        party.remove(index);
    }
    //añade un personaje en la ultima posicion
    public void addNewCharacter(Character character){
        party.add(character);
    }
    //el metodo esta sobrecargado para que añada a un character en un determinado indice
    public void addNewCharacter(Character character,int index){
        party.add(index,character);
    }
    //Quita el ultimo personaje en la lista
    public void removeCharacter(){
        int index = party.size() - 1;
        party.remove(index);
    }
    //El metodo esta sobrecargado para quitar a un personaje de un indice.
    public void removeCharacter(int index){
        party.remove(index);
    }
    //getter
    public ArrayList<Character> getGraveyard() {
        return graveyard;
    }
    public ArrayList<Character> getParty() {
        return party;
    }
    //Setter
    public void setParty(ArrayList<Character> party) {
        this.party = party;
    }
}
