package classes;

import interfaces.Attack;

public abstract class Character implements Attack {

    private static int id = 0;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character(String name) {
        this.id = id++;
        setName(name);
        setHp(hp);
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

    public void setHp(int hp) {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract void attack();

}