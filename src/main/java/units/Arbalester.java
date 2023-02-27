package units;

public class Arbalester extends Archers{

    public Arbalester(String name) {
        super("Арбалетчик", name, 6, 3, 2, 3, 10, 4, 16);
    }

    public Arbalester() {
        super("Арбалетчик", giveName(), 6, 3, 2, 3, 10, 4, 16);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик " + name;
    }
}