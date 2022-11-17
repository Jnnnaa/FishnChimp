package npc;

public abstract class Npc {
    private int health;

    public Npc() {

    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int reductionValue) {
        health -= reductionValue;
    }


}
