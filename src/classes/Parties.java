package classes;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Parties {
    private List<Character> party;
    private List<Character> graveyard;

    private boolean hasGraveyard;



    //Constructor - Crea una lista vacia

    public Parties(boolean hasGraveyard){
        if( hasGraveyard == false){
            party = Arrays.asList();
        }else {
            graveyard = Arrays.asList();
        }
    }
    //Constructor - Crea una party desde una lista de personajes
    public Parties(List<Character> party) {
        setParty(party);
    }
    //Genera una party aleatoria entre 10 y 20
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
    //Quita al personaje selecionado a la lista graveyard
    public void moveToGraveyard(int index){
        graveyard.add(party.get(index));
        party.remove(index);
    }
    //añade Warrior / Wizard en la ultima posicion,
    // el metodo esta sobrecargado para que añada a un character en un determinado indice
    public void addWarrior(Warrior warrior){
        party.add(warrior);
    }
    public void addWarrior(Warrior warrior,int index){
        party.add(index,warrior);
    }

    public void addWizard(Wizard wizard){
        party.add(wizard);
    }
    public void addWizard(Wizard wizard,int index){
        party.add(index,wizard);
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
    public List<Character> getGraveyard() {
        return graveyard;
    }
    public List<Character> getParty() {
        return party;
    }
    //Setter
    public void setParty(List<Character> party) {
        this.party = party;
    }
}
