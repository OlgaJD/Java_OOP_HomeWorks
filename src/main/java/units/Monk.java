package units;

public class Monk extends Magicans {
    public Monk(String name, int posX, int posY) {
        super("Монах", name, 12, 7, -4, -4, 30, 30, 5, 1, posX, posY);
    }
    public Monk(int posX, int posY) {
        super("Монах", giveName(), 12, 7, -4, -4, 30, 30, 5, 1, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Я монах " + name;
    }

}
