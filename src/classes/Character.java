package classes;

public abstract class Character {

    int id;
    String name;
    int hp;
    boolean isAlive;

    public Character(int id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

}
