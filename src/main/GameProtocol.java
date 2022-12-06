package main;

import item.*;
import player.Player;
//import player.WeaponType;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameProtocol {
    private Gamestate gamestate;
    private Player player;
    public String coolName;
    private CombatHandler combatHandler;

    public Storyyy storyyy = new Storyyy();;




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
                storyyy.textAtTheBeginning();
            } else if (gamestate == Gamestate.COMBAT) {
                combatHandler.startCombat(player, this);
            }
        }
    }

    public int getNumberOfCoins() {
        return ThreadLocalRandom.current().nextInt(5, 85);
    }


    public void choosePlayer() {

        System.out.println("Enter cool name");
        Scanner sc = new Scanner(System.in);
        String coolName = sc.next();
        this.coolName = coolName;

        System.out.println("Wie groß bist du?");
        String heightString = sc.next();

        while (!heightString.matches("[0-9]*")) {
            System.out.println("Invalid number");
            heightString = sc.next();
        }
        int yourHeight = Integer.parseInt(heightString);

        System.out.println("Choose your first weapon:");

        System.out.println("1. Stick");
        System.out.println("2. Stone");
        System.out.println("3. Watergun");

        String weaponNumber = sc.next();

        while (!weaponNumber.matches("1??2??3??")) {
            System.out.println("Invalid number, again:");
            weaponNumber = sc.next();
        }

        Weapon weapon = switch (weaponNumber) {
            case "1" -> new Stick();
            case "2" -> new Stone();
            case "3" -> new Watergun();
            default -> new Hands();
        };

        player = new Player(coolName, yourHeight, getNumberOfCoins(), weapon);

        System.out.println("Welcome " + coolName + ",your journey starts here! You have " + getNumberOfCoins() + " coins :)");
    }

    public void setGamestate(Gamestate gamestate) {
        this.gamestate = gamestate;
    }

    public Gamestate getGamestate() {
        return gamestate;
    }
}
