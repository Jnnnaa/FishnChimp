package item;

public class Hands extends Item implements Weapon{
    @Override
    public MoveTypes[] getMoves() {
        return new MoveTypes[0];
    }

    @Override
    public int getDamage(MoveTypes moveTypes) {

        return 0;
    }
}
