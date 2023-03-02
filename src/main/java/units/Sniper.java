package units;

public class Sniper extends Archers{
    public Sniper(String name, int posX, int posY) {
        super("Снайпер", name, 12, 10, 8, 10, 15, 15, 9, 32, posX, posY);
    }

    public Sniper(int posX, int posY) {
        super("Снайпер", giveName(), 12, 10, 8, 10, 15, 15, 9, 32, posX, posY);
    }
    @Override
    public String getInfo() {
        return "Я снайпер " + name;
    }
}
