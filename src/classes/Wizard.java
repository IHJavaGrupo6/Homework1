package classes;

import java.util.Random;

public class Wizard extends Character{
    private int mana;
    private int intelligence;

    //Constructor
    public Wizard(String name) {
        super(name);
        setMana();
        setIntelligence();

    }
    public Wizard(String name, int hp, int mana, int intelligence){
        super(name);
        this.hp = hp;
        this.mana = mana;
        this.intelligence = intelligence;
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


    //interface method attack
    public int attack() {
        if (getMana() >= 5){
            return fireball();
        } else return staffHit();

    }



    //Setter hp
    @Override
    public void setHp(){
        Random rand = new Random();
        int hp = rand.nextInt(50,100);
        this.hp = hp;
    }


    //Fireball attack
    public int fireball(){
        int damage = this.intelligence;
        this.mana = getMana() - 5;
        return damage;
    }

    //Staffhit attack
    public int staffHit(){
        int damage = 2;
        this.mana = getMana() + 1;
        return damage;
    }


}
