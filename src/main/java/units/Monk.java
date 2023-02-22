package units;

public class Monk extends Magicans {
    public Monk(String name) {
        super("Монах", name, 45, 15, 3, 5, 10, 10);
    }
    public Monk() {
        super("Монах", giveName(), 45, 15, 3, 5, 10, 10);
    }

    @Override
    public String getInfo() {
        return "Я монах " + name;
    }

    @Override
    public void heal () {
    }

    public void enhance() {
    }
}
