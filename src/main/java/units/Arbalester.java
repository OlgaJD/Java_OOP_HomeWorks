package units;

public class Arbalester extends Archers{

    public Arbalester(String name) {
        super("Арбалетчик", name, 50, 8, 4, 5, 15, 15);
    }

    public Arbalester() {
        super("Арбалетчик", giveName(), 50, 8, 4, 5, 15, 15);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик " + name;
    }
}