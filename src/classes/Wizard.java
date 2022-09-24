package classes;

import java.util.Random;

public class Wizard extends Character implements Attack{
    private int mana;
    private int intelligence;

    //Constructor
    public Wizard(String name) {
        setName(name);
        setHp();
        setMana();
        setIntelligence();
    }

    //Getter mana
    public int getMana() {
        return mana;
    }

    //Setter mana
    public void setMana() {
        Random rand = new Random();
        int mana = rand.nextInt(10,50);
        this.mana = mana;
    }

    //Getter intelligence
    public int getIntelligence() {
        return intelligence;
    }

    //Setter intelligence
    public void setIntelligence() {
        Random rand = new Random();
        int intelligence = rand.nextInt(1,50);
        this.intelligence = intelligence;
    }

    //Decrease HP
    public void decreaseHP(int damage){
        this.hp -= damage;
    }

    //Decrease mana
    public void decreaseMana(){
        this.mana -= 5;
    }

    //Increase mana
    public void increaseMana(){
        this.mana ++;
    }

    //interface method attack
    public void attack() {
        if (getMana() >= 5){
            fireball();
        } else staffHit();
    }

    //Setter name
    public void setName(String name){
        this.name = name;
    }

    //Setter hp
    public void setHp(){
        Random rand = new Random();
        int hp = rand.nextInt(50,100);
        this.hp = hp;
    }

    //Fireball attack
    public int fireball(){
        int damage = this.intelligence;
        decreaseMana();
        return damage;
    }

    //Staffhit attack
    public int staffHit(){
        int damage = 2;
        increaseMana();
        return damage;
    }


}
