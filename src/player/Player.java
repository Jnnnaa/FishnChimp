package player;

import item.Item;

public class Player {
    private int numberOfCoins;
    private String name;
    private boolean isAlive = true;
    private int health; //Combat health
    private int height;
    private Item[] inventory = new Item[10];


    private Weapon activeWeapon;

    public Player(String name, int height, int numberOfCoins, Weapon weapon ) {
        this.numberOfCoins = numberOfCoins;
        this.name = name;
        this.height = height;
        this.activeWeapon = weapon;
    }

    public void reduceHealth(int reductionValue) {
        health -= reductionValue;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setActiveWeapon(Weapon weapon) {
        this.activeWeapon = weapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setActiveWeapon(Weapon weapon){
        this.activeWeapon = weapon;
    }
}
