package classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadFromCSV {

    public static void readParties() {
        try {
            File file = new File("Characters.csv");
            Scanner fileReader = new Scanner(file);
            int numberOfLines = (int) Files.lines(file.toPath()).count();

            // adding the first half of the characters to party 1:
            for (int i = 0; i < numberOfLines / 2; i++) {
                String[] arr1 = fileReader.nextLine().split(",");
                switch (arr1[0]) {
                    case "Wizard" ->
                            Parties.addCharacterParty(new Wizard(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty1());
                    case "Warrior" ->
                            Parties.addCharacterParty(new Warrior(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty1());
                }
            }

            // adding the second half of the characters to party 2:
            for (int i = numberOfLines / 2; i < numberOfLines; i++) {
                String[] arr1 = fileReader.nextLine().split(",");
                switch (arr1[0]) {
                    case "Wizard" ->
                            Parties.addCharacterParty(new Wizard(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty2());
                    case "Warrior" ->
                            Parties.addCharacterParty(new Warrior(arr1[1], parseInt(arr1[2]), parseInt(arr1[3]), parseInt(arr1[4])), Parties.getParty2());
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
