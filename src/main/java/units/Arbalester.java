package units;

public class Arbalester extends Archers{

    public Arbalester(String name,  int posX, int posY) {
        super("Арбалетчик", name, 6, 3, 2, 3, 100, 100, 4, 16, posX, posY);
    }

    public Arbalester(int posX, int posY) {
        super("Арбалетчик", giveName(), 6, 3, 2, 3, 100, 100, 4, 16, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик " + name;
    }
}