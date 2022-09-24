package classes;

import interfaces.Attack;

import java.util.ArrayList;

public abstract class Character implements Attack {

    private int id;
    private String name;
    private int hp;
    private boolean isAlive;

    ArrayList<Character> character = new ArrayList<>();

    public Character(int id, String name, int hp, boolean isAlive, ArrayList<Character> character) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }

    public abstract void Attack();


}
