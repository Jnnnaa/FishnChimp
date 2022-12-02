package item;

public class Hands extends Item implements Weapon{
    @Override
    public MoveTypes[] getMoves() {
        return new MoveTypes[0];
    }

    @Override
    public MoveTypes getMoveByIndex() {
        return null;
    }
}
