package npc;

public abstract class Npc {
    private int health;
    private int armor;
    protected int level;

    /**
     * constructor
     */
    public Npc() {

    }

    /**
     * getter for Health value
     * @return health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Handles the case, a npc gets damaged.
     * @param reductionValue the damage the npc receives
     * @return how much the health was reduced
     */
    public int reduceHealth(int reductionValue) {
        int damage = damageAfterArmorReduction(reductionValue);
        if (health - damage <= 0) {
            health = 0;
            return health;
        } else {
            health -= damage;
            return damage;
        }
    }

    /**
     * Calculates the damage with the npcs armor
     * @param damage the damage the npc received
     * @return the reduced damage
     */
    public int damageAfterArmorReduction(int damage) {
        return (int) (damage - (damage*(20*Math.log10((armor/3)+1)/100)));
    }
}
