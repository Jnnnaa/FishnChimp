package player;

public class Player {
    private int numberOfCoins;
    private String name;

    private boolean isAlive = true;


    private int health; //Combat health
    private int height;
    private WeaponType weapon;

    public Player(String name, int height, int numberOfCoins, WeaponType weapon ) {
        this.numberOfCoins = numberOfCoins;
        this.name = name;
        this.height = height;
        //this.weapon = weapon;
    }



    public void reduceHealth(int reductionValue) {
        health -= reductionValue;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public WeaponType getWeapon(){
        return weapon;
    }
    public void setWeapon(WeaponType weaponType){
    }
}
