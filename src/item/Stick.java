package item;

public class Stick extends Item implements Weapon{

    MoveTypes[] moveTypes;
    private int damage;

    public Stick() {
        setMoveTypes();
    }

    private void setMoveTypes() {

    this.moveTypes = new MoveTypes[2];
    moveTypes[0] = MoveTypes.THROW;
    moveTypes[1] = MoveTypes.HIT_ON_HEAD;
    }

    public MoveTypes[] getMoves() {
        return moveTypes;
    }

    private void setDamage(){ damage =  }
}
