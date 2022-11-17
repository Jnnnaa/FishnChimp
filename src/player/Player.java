package player;

public class Player {
    private int numberOfCoins;
    private String name;

    private boolean isAlive = true;


    private int health; //Combat health
    private int height;

    public Player(String name, int height, int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
        this.name = name;
        this.height = height;
    }

    public void reduceHealth(int reductionValue) {
        health -= reductionValue;
    }

    public boolean getIsAlive() {
        return isAlive;
    }
}
