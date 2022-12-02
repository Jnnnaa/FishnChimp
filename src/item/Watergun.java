package item;

public class Watergun extends Item implements Weapon {
    MoveTypes[] moveTypes;

    public Watergun() {
        setMoveTypes();
    }

    private void setMoveTypes() {

        this.moveTypes = new MoveTypes[2];
        moveTypes[0] = MoveTypes.FIRE;
        moveTypes[1] = MoveTypes.HIT_ON_HEAD;
    }

    public MoveTypes[] getMoves() {
        return moveTypes;
    }
}
