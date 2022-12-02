package item;

public class Stone extends Item implements Weapon{
    MoveTypes[] moveTypes;

    public Stone() {
        setMoveTypes();
    }
    private void setMoveTypes() {

        this.moveTypes = new MoveTypes[2];
        moveTypes[0] = MoveTypes.THROW;
        moveTypes[1] = MoveTypes.HIT;
    }

    public MoveTypes[] getMoves() {
        return moveTypes;
    }



}
