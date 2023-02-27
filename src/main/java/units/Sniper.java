package units;

public class Sniper extends Archers{
    public Sniper(String name) {
        super("Снайпер", name, 12, 10, 8, 10, 15, 9, 32);
    }

    public Sniper() {
        super("Снайпер", giveName(), 12, 10, 8, 10, 15, 9, 32);
    }
    @Override
    public String getInfo() {
        return "Я снайпер " + name;
    }
}
