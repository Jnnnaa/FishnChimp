package npc;

import java.util.concurrent.ThreadLocalRandom;

public class Shrimp extends Npc implements Enemy {

    Attack[] attacks;

    public int numberOfEqualEnemyInArray;

    public Shrimp() {
        initAttacks();
    }
    public Entitystate getEntitystate() {
        return currentState;
    }

    private void initAttacks() {
        attacks = new Attack[] {Attack.BITE, Attack.FLAP};
    }

    public Attack getRandomAttack() {
        return attacks[ThreadLocalRandom.current().nextInt(0, attacks.length)];
    }

    @Override
    public int getDamageOfAttack(Attack attack) {
        return switch(attack) {
            case BITE -> this.level;
            case FLAP -> this.level;
            default -> 0;
        };
    }

}
