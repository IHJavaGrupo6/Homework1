import classes.Character;
import classes.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warrior anya = new Warrior(1, "Anya", 3, true);
        System.out.println("Hello world!");
        List<Character> characters = new ArrayList<>();
        characters.add(anya);
        anya.attack();
        Warrior pum = (Warrior) characters.get(0);
        System.out.println(pum);
        pum.attack();
    }
}