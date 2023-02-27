package units;

public class Monk extends Magicans {
    public Monk(String name) {
        super("Монах", name, 12, 7, -4, -4, 30, 5, 1);
    }
    public Monk() {
        super("Монах", giveName(), 12, 7, -4, -4, 30, 5, 1);
    }

    @Override
    public String getInfo() {
        return "Я монах " + name;
    }

}
