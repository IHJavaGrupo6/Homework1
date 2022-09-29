package classes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadFromCSV {

    public static void readParties() {
        try {
            File file = new File("Characters.csv");
            Scanner fileReader = new Scanner(file);

            for (int i = 0; i < 9; i++) {
                String[] arr1 = fileReader.nextLine().split(",");
                switch (arr1[0]) {
                    case "Wizard":
                        Parties.addCharacterParty(new Wizard(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty1());
                        break;
                    case "Warrior":
                        Parties.addCharacterParty(new Warrior(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty1());
                        break;
                }
            }

            for (int i = 0; i < 9; i++) {
                String[] arr1 = fileReader.nextLine().split(",");
                switch (arr1[0]) {
                    case "Wizard":
                        Parties.addCharacterParty(new Wizard(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty2());
                        break;
                    case "Warrior":
                        Parties.addCharacterParty(new Warrior(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty2());
                        break;
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
