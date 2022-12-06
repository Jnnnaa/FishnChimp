package main;

import npc.*;
import player.Player;

import java.util.Scanner;

public class CombatHandler {

    private Enemy[] enemys;

    public void startCombat(Player player, GameProtocol gameProtocol) {
        enemys = initEnemys();

        combatLoop(player, gameProtocol);
    }

    private void combatLoop(Player player, GameProtocol gameProtocol) {
        boolean playerTurn = true;
        while (gameProtocol.getGamestate() == Gamestate.COMBAT) {
            manageEffects(player);
            if (playerTurn) {
                playerTurn(player, gameProtocol);
            } else {
                enemyTurn(player, gameProtocol);
            }
            playerTurn = !playerTurn;
        }
    }

    private void playerTurn(Player player, GameProtocol gameProtocol) {
        System.out.println("Your Turn!");
        System.out.println("What do you want to do?");
        System.out.println();
        System.out.println("1. Attack");
        System.out.println("2. Items");
        System.out.println("3. Flee");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (input.matches("1+2+3")){
            System.out.println("Invalid number, again:");
            input = sc.nextLine();
        }
        switch (input) {
            case "1" -> playerAttack();
            case "2" -> playerItems();
            case "3" -> playerFlee();
        }
    }

    private Enemy[] initEnemys() {
        return new Enemy[] { new Shrimp() };
    }

    private void enemyTurn(Player player, GameProtocol gameProtocol) {
        for (int i = 0; i < enemys.length; i++) {
            if (enemys[i].getEntitystate() == Entitystate.READY) {
                Attack attack = enemys[i].getRandomAttack();
                System.out.println("You got " + switch(attack) {
                    case HIT -> "hit";
                    case BITE -> "bit";
                    case KICK -> "kicked";
                    case FLAP -> "flapped";
                    case POISON -> "poisoned";
                } + "!");
                player.reduceHealth(enemys[i].getDamageOfAttack(attack));
                if (!player.getIsAlive()) {
                    gameProtocol.setGamestate(Gamestate.PLAYER_DIED);
                    break;
                }
            }
        }
    }

    private void manageEffects(Player player) {

    }

    private void playerAttack() {
    }

    private void playerItems() {
    }

    private void playerFlee() {
    }

}
