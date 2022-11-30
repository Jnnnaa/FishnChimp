package npc;

public abstract class Npc {
    private int health;
    private int armor;

    public Npc() {

    }

    public int getHealth() {
        return health;
    }

    /**
     * Handles the case, a npc gets damaged.
     * @param reductionValue the damage the npc receives
     * @return how much the health was reduced
     */
    public int reduceHealth(int reductionValue) {
        if (health - reductionValue <= 0) {
            health = 0;
            return health;
        } else {
            health -= reductionValue;
            return reductionValue;
        }
    }

    public int damageAfterArmorReduction(int damage) {
        return (int) (damage - (damage*(20*Math.log10((armor/3)+1)/100)));
    }
}
