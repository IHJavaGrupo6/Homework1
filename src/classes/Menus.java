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
        System.out.println("2. Generate random parties");
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
                System.out.println("=Enter a name=");
                String name = input.nextLine();
                System.out.println("=Enter warrior's hp=");
                int hp = input.nextInt();
                System.out.println("=Enter warrior's stamina=");
                int stamina = input.nextInt();
                System.out.println("=Enter warrior's strength=");
                int strength = input.nextInt();
                Character character = new Warrior(name, hp, stamina, strength);
                addCharToParty(character);
                System.out.println("Character added: " + character.getName()); //?????????????????????
                break;
            case 2:
                System.out.println("=Enter a name=");
                String name2 = input.nextLine();
                System.out.println("=Enter wizard's hp=");
                int hp2 = input.nextInt();
                System.out.println("=Enter wizard's mana=");
                int mana = input.nextInt();
                System.out.println("=Enter wizard's intelligence=");
                int intelligence = input.nextInt();
                Character character2 = new Wizard(name2, hp2, mana, intelligence);
                addCharToParty(character2);
                System.out.println("Character added: " + character2.getName()); //?????????????????????
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
                System.out.println("==Character added to Party1");
                break;
            case 2:
                Parties.addCharacterParty(character, Parties.getParty2());
                System.out.println("==Character added to Party2");
                break;
            default:
                System.err.println("Incorrect option");
                addCharToParty(character);
        }
    }
}
