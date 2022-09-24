package classes;

import java.util.ArrayList;

public class Parties {
    private ArrayList<Character> party;

    //Constructor - Crea una party desde una lista de personajes
    public Parties(ArrayList<Character> party) {
        setParty(party);
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
    public ArrayList<Character> getParty() {
        return party;
    }
    //Setter
    public void setParty(ArrayList<Character> party) {
        this.party = party;
    }
}
