package classes;

import java.util.Random;

public class Warrior extends Character {
    private int stamina;
    private int strength;


    public Warrior(String name) {
        super(name);
        setStamina();
        setStrength();
    }

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name);
        this.hp = hp;
        this.stamina = stamina;
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina() {
        Random rand = new Random();
        int stamina = rand.nextInt(10, 50);
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        Random rand = new Random();
        int strength = rand.nextInt(1, 10);
        this.strength = strength;
    }

    @Override
    public void setHp() {
        Random rand = new Random();
        int hp = rand.nextInt(100, 200);
        this.hp = hp;
    }


    public int attack() {
        if (getStamina() >= 5) {
           return heavyAttack();
        } else return weakAttack();
    }

    public int heavyAttack() {
        int damage = this.strength;
        this.stamina -= 5;
        return damage;
    }


    public int weakAttack() {
        int damage = (this.strength/2);
        this.stamina ++;
        return damage;
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + getName() +
                ", id=" + getId() +
                ", hp=" + hp +
                ", stamina=" + stamina +
                ", strength=" + strength + '\'' +
                '}'+"\n";
    }


}
