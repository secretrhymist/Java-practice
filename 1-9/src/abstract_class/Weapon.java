package abstract_class;

public class Weapon extends Item {
    @Override
    public boolean disposable() {
        return false;
    }
}
