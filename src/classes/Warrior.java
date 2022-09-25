package classes;
import java.util.Random;

public class Warriors extends Character implements Attack{
    private int stamina;
    private int strength;


    public Warriors(String name, int stamina, int strength){
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
}