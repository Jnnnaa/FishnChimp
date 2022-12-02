package item;

public class Stick extends Item implements Weapon{

    MoveTypes[] moveTypes;

    public Stick() {
        setMoveTypes();
    }

    private void setMoveTypes() {

    this.moveTypes = new MoveTypes[2];
    moveTypes[0] = MoveTypes.THROW;
    moveTypes[1] = MoveTypes.HIT_ON_HEAD;
    }
}
