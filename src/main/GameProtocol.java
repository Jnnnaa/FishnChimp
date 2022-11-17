package main;

import player.Player;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameProtocol {
    private Gamestate gamestate;
    private Player player;
    CombatHandler combatHandler;


    public GameProtocol() {
        gamestate = Gamestate.RUNNING;

    }

    public void startGame() {
        gamestate = Gamestate.STORYTELLING;
        gameLoop();
    }

    private void gameLoop() {
        while (player.getIsAlive()) {
            if (gamestate == Gamestate.STORYTELLING) {


            } else if (gamestate == Gamestate.COMBAT) {
                combatHandler.startCombat();
            }
        }
    }

    private int getNumberOfCoins() {
        return ThreadLocalRandom.current().nextInt(5, 85);
    }

    public void choosePlayer() {

        System.out.println("Enter cool name");
        Scanner sc = new Scanner(System.in);
        String coolName = sc.next();

        System.out.println("Wie groß bist du?");
        String heightString = sc.next();

        while (!heightString.matches("[0-9]*")) {
            System.out.println("Invalid number");
            heightString = sc.next();
        }
        int yourHeight = Integer.parseInt(heightString);

        player = new Player(coolName, yourHeight, getNumberOfCoins());

        System.out.println("Welcome " + coolName + ",your journey starts here! You have " + getNumberOfCoins() + "coins :)");
    }

}
