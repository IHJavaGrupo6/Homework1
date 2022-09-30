package classes;

import interfaces.Attack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character implements Attack {

    private int id;
    private static int contador = 0;
    private String name;
    protected int hp;
    private boolean isAlive;
    private static List<String> juniorNames = new ArrayList<>();

    public Character(String name) {
        this.id = contador++;
        setName(name);
        setHp();
        setAlive(true);
    }

    public Character() {
        this.id = contador++;
        setName();
        setHp();
        setAlive(true);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract int attack();

    public void decreaseHp(int damage) {
        this.hp = getHp() - damage;
        if (getHp() <= 0) {
            setAlive(false);
        }
    }

    public void setName() {
        String[] randomNames = {"Danny", "Quim", "Anya", "Oscar", "Irina", "Ale", "Jose", "Jaume", "Chloe", "Alfonso", "Armando", "Asaf",
                "Cinta", "Clàudia", "Diana", "Espe", "Fran", "Ingrid", "Javi", "Kenny", "Lili", "Martin", "Max", "Miguel", "Nil", "Núria",
                "Oxana", "Piero", "Pol", "Ricardo", "Sergi", "Soledad", "Veronika", "Yehosua", "Alberto"};

        Random random = new Random();
        int index = random.nextInt(0, randomNames.length - 1);

        if (juniorNames.contains(randomNames[index])) {
            this.name = randomNames[index] + " Jr";
        } else {
            this.name = randomNames[index];
            juniorNames.add(this.name);
        }
    }
}