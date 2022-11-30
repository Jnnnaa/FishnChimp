package npc;

public interface Enemy {
    Entitystate currentState = Entitystate.READY;
    public Entitystate getEntitystate();
}
