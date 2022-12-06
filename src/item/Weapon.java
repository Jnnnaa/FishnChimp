package item;

/**
 * //Methoden, der Items, die Weapons sind (Stick, Gun, Slingshot,...)
 */
public interface Weapon {

    MoveTypes[] moveTypes = null;

    private void setMoveTypes(){};

    public MoveTypes[] getMoves();

    public int getDamage(MoveTypes moveTypes);

    private void setDamage(){};


}
