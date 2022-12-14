package classes;

import java.util.Scanner;

import static classes.ReadFromCSV.readParties;

public class Menus {
    private Battle battle;

    public Menus() {
        this.battle = new Battle();
    }

    public Battle getBattle() {
        return battle;
    }


    public void menuInicial() {

        System.out.println("===Welcome to Renegados RPG Battle===");
        System.out.println("=Select an option=");
        System.out.println("1. Create a Character");
        System.out.println("2. Generate random Parties");
        System.out.println("3. Import parties from CSV files");
        System.out.println("4. Go to Battle");
        System.out.println("5. Exit Game");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                characterCreation();
                menuInicial();
            case 2:
                Parties.generateParty();
                menuInicial();
            case 3:
                readParties();
                menuInicial();
            case 4:
                while (Parties.getParty1().size() > 0 && Parties.getParty2().size() > 0) {
                    getBattle().battleRound();
                }
                menuInicial();
            case 5:
                System.out.println("Exiting game");
                System.exit(0);
            default:
                System.err.println("Incorrect option");
                menuInicial();

        }

    }

    public static void characterCreation() {
        Scanner input = new Scanner(System.in);
        System.out.println("=Choose a character type=");
        System.out.println("1. Warrior");
        System.out.println("2. Wizard");

        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                System.out.println("=Enter warrior's name=");
                String name = input.nextLine();
                System.out.println("=Enter warrior's hp (between 100 and 200)=");
                int hp = input.nextInt();
                System.out.println("=Enter warrior's stamina (between 10 and 50)=");
                int stamina = input.nextInt();
                System.out.println("=Enter warrior's strength (between 1 and 10)=");
                int strength = input.nextInt();
                Character character = new Warrior(name, hp, stamina, strength);
                System.out.println("Created Warrior " + character.getName());
                addCharToParty(character);
                break;
            case 2:
                System.out.println("=Enter wizard's name=");
                String name2 = input.nextLine();
                System.out.println("=Enter wizard's hp (between 50 and 100)=");
                int hp2 = input.nextInt();
                System.out.println("=Enter wizard's mana (between 10 and 50)=");
                int mana = input.nextInt();
                System.out.println("=Enter wizard's intelligence (between 1 and 50)=");
                int intelligence = input.nextInt();
                Character character2 = new Wizard(name2, hp2, mana, intelligence);
                System.out.println("Created Wizard " + character2.getName());
                addCharToParty(character2);
                break;
            default:
                System.err.println("Incorrect option");
                characterCreation();
        }
    }

    public static void addCharToParty(Character character) {
        Scanner input = new Scanner(System.in);
        System.out.println("=Choose to which party you want to add the character=");
        System.out.println("1. Party1");
        System.out.println("2. Party2");

        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                Parties.addCharacterParty(character, Parties.getParty1());
                System.out.println("Character " + character.getName() + " added to Party1");
                break;
            case 2:
                Parties.addCharacterParty(character, Parties.getParty2());
                System.out.println("Character " + character.getName() + " added to Party2");
                break;
            default:
                System.err.println("Incorrect option");
                addCharToParty(character);
        }
    }
}
