package classes;

public class Warriors extends Character{
    private int stamina;
    private int strength;
    private boolean randomWarrior;

    public Warriors(int id, String name, int hp, boolean isAlive, int stamina, int strength, boolean randomWarrior) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
        this.randomWarrior = randomWarrior;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isRandomWarrior() {
        return randomWarrior;
    }

    public void setRandomWarrior(boolean randomWarrior) {
        this.randomWarrior = randomWarrior;
    }
}