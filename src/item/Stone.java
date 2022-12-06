package item;

public class Stone extends Item implements Weapon{
    MoveTypes[] moveTypes;
    private int damage;

    public Stone() {
        setMoveTypes();
        damage = 1;
    }
    private void setMoveTypes() {

        this.moveTypes = new MoveTypes[2];
        moveTypes[0] = MoveTypes.THROW;
        moveTypes[1] = MoveTypes.HIT;
    }

    public MoveTypes[] getMoves() {
        return moveTypes;
    }

    @Override
    public int getDamage(MoveTypes moveTypes) {
        return damage;
    }


}
