package player;

import item.Item;
import item.Weapon;

public class Player {
    private int numberOfCoins;
    private String name;
    private boolean isAlive = true;
    private int health; //Combat health
    private int height;
    private Item[] inventory = new Item[10];
    private int armor;

    private Weapon activeWeapon;

    public Player(String name, int height, int numberOfCoins, Weapon weapon ) {
        this.numberOfCoins = numberOfCoins;
        this.name = name;
        this.height = height;
        this.activeWeapon = weapon;
        health = 100;
        armor = 0;
    }

    public void reduceHealth(int reductionValue) {
        if (health-reductionValue <= 0) {
            health = 0;
            isAlive = false;
        }
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setActiveWeapon(Weapon weapon) {
        this.activeWeapon = weapon;
    }

    public Weapon getWeapon(){
        return activeWeapon;
    }
}
