package player;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private int numberOfCoins;
    private String name;
    private int height;

    public Player(String name, int height, int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
        this.name = name;
        this.height = height;
    }
}
