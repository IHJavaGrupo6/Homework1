import classes.Character;
import classes.Parties;
import classes.Warriors;
import classes.Wizard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> party1 = new ArrayList<>();
        party1.add(new Wizard("wizard1"));
        Character character1 = party1.get(0);

        //character1.attack();

        Character playerOne = party1.get(0);

        if (party1.get(0) instanceof Wizard){
            playerOne = (Wizard) party1.get(0);
        } else if (character1 instanceof Warriors) {
            playerOne = (Warriors) party1.get(0);
        } else {
            System.out.println("Not a valid character");
        }

        //character1.attack();
        (Wizard)playerOne.attack();



    }
}