package main;

import npc.Attack;
import npc.Enemy;
import npc.Entitystate;
import npc.Shrimp;
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
        return new Enemy[] {new Shrimp()};
    }

    private void enemyTurn(Player player) {

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

                if (player.getIsAlive()) {

                }
            }
        }
    }
}
