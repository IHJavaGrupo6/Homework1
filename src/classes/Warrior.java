package classes;
import java.util.Random;

public class Warrior extends Character implements Attack{
    private int stamina;
    private int strength;


    public Warrior(String name, int stamina, int strength){
        super(name);
        setHp();
        setStamina();
        setStrength();


    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        Random rand = new Random();
        int stamina = rand.nextInt(10,50)
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        Random rand = new Random();
        int strength = rand.nextInt(1,10);
        this.strength = strength;
    }

    public void setHp();
    Random rand = new Random();
    int hp = rand.nextInt(100,200);
    this.hp = hp;
    }

       public void decreaseHP(int damage){
        this.hp -= damage;
    }

    //Decrease mana
    public void decreaseStamina(){
        this.stamina -= 5;
    }

    //Increase mana
    public void increaseStamina(){
        this.stamina ++;
    }

    public void attack() {
        if (getStamina() >= 5) {
            fireball();
        } else staffHit();
    }

        public int fireball(){
            int damage = this.stamina;
            decreaseStamina();
            return damage;
        }

        //Staffhit attack
        public int staffHit(){
            int damage = 2;
            increaseStamina();
            return damage;
        }



    }
}