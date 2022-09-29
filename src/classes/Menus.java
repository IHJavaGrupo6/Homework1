package classes;

import java.util.Scanner;

public class Menus {
        private Battle battle;

    public Menus() {
        this.battle = new Battle();
    }

    public Battle getBattle() {
        return battle;
    }


    public void menuInicial(){

        System.out.println("===Welcome to our RPG Game===");
        System.out.println("=Select an option=");
        System.out.println("1. Create a Character");
        System.out.println("2. Go to Battle");
        System.out.println("3. Exit Game");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();
        switch (option){
            case 1:
                characterCreation();
                menuInicial();
            case 2:
                while(Parties.getParty1().size() > 0 && Parties.getParty2().size() > 0){
                    getBattle().battleRound();
                }
                menuInicial();
            case 3:
                System.out.println("Exiting game");
                System.exit(0);
            default:
                System.err.println("Incorrect option");
                menuInicial();

        }

    }

    public static void characterCreation(){
        Scanner input = new Scanner(System.in);
        System.out.println("=Choose a character type=");
        System.out.println("1. Warrior");
        System.out.println("2. Wizard");

        int option = input.nextInt();
        input.nextLine();
        switch (option){
            case 1:
                System.out.println("=Enter a name=");
                String name = input.nextLine();
                Character character = new Warrior(name);
                addCharToParty(character);
                break;
            case 2:
                System.out.println("=Enter a name=");
                String name2 = input.nextLine();
                Character character2 = new Wizard(name2);
                addCharToParty(character2);
                break;
            default:
                System.err.println("Incorrect option");
                characterCreation();

        }
    }
    public static void addCharToParty(Character character){
        Scanner input = new Scanner(System.in);
        System.out.println("=Choose to which party you want to add the character=");
        System.out.println("1. Party1");
        System.out.println("2. Party2");

        int option = input.nextInt();
        input.nextLine();
        switch (option){
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
