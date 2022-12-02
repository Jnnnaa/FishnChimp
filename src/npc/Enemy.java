package npc;

public interface Enemy {


    Entitystate currentState = Entitystate.READY;
    public Entitystate getEntitystate();

    public Attack getRandomAttack();

    public int getDamageOfAttack(Attack attack);
}


