package classes;

import interfaces.Attack;

public abstract class Character implements Attack {

    private int id;
    private static int contador = 0;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character(String name) {
        this.id = contador++;
        setName(name);
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

    public abstract void attack();

    public void decreaseHp(int damage) {
        this.hp -= damage;
        if (getHp() <= 0) {
            this.isAlive = false;
        }
    }
}