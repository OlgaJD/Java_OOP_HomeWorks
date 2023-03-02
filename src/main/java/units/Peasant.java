package units;

public class Peasant extends BaseHeroes {
    protected int delivery;

    public Peasant(String name, int posX, int posY) {
        super("Крестьянин",  name, 1, 1, 1, 1, 1, 1, 3, posX, posY);
        this.delivery = 1;
    }
    public Peasant(int posX, int posY) {
        super("Крестьянин",  giveName(), 1, 1, 1, 1, 1, 1, 3, posX, posY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Я крестьянин " + name;
    }

}
