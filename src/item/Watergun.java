package item;

public class Watergun extends Item implements Weapon {
    MoveTypes[] moveTypes;

    private int damage;
    public Watergun() {
        setMoveTypes();
        damage = 1;
    }

    private void setMoveTypes() {

        this.moveTypes = new MoveTypes[2];
        moveTypes[0] = MoveTypes.FIRE;
        moveTypes[1] = MoveTypes.HIT_ON_HEAD;
    }

    public MoveTypes[] getMoves() {
        return moveTypes;
    }

    @Override
    public int getDamage(MoveTypes moveTypes) {
        return damage;
    }

    @Override
    public MoveTypes getMoveByIndex(int i) {
        return moveTypes[i];
    }

    @Override
    public String getName() {
        return "Watergun";
    }
}
