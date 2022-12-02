package main;

import npc.Enemy;
import npc.Entitystate;
import player.Player;

public class CombatHandler {

    private Enemy[] enemys;

    public void startCombat(Gamestate gamestate, Player player) {
        enemys = initEnemys();

        combatLoop(gamestate, player);
    }

    private void combatLoop(Gamestate gamestate, Player player) {
        while (gamestate == Gamestate.COMBAT) {
            playerTurn(player);
            enemyTurn(player);
        }
    }

    private void playerTurn(Player player) {
        System.out.println("Your Turn!");
        System.out.println("Current weapon:" + player.getWeapon().toString());
        System.out.println("Change Weapon?");
    }


    private Enemy[] initEnemys() {
        int numberOfEnemys = 5;
        return new Enemy[numberOfEnemys];
    }

    private void enemyTurn(Player player) {

        for (int i = 0; i < enemys.length; i++) {
            if (enemys[i].getEntitystate() == Entitystate.READY) {

            }
        }
    }
}
