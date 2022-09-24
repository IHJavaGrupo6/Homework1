package classes;

import interfaces.Attack;

<<<<<<< HEAD
    int id;
    String name;
    int hp;
    boolean isAlive;

=======
public abstract class Character implements Attack {

    private int id;
    private String name;
    private int hp;
    private boolean isAlive;

>>>>>>> f3c8765daf409c32576de443985396f6f2ce526d
    public Character(int id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

<<<<<<< HEAD
=======
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
>>>>>>> f3c8765daf409c32576de443985396f6f2ce526d
}
