package units;

public class Peasant extends BaseHeroes {
    protected int delivery;

    public Peasant(String name) {
        super("Крестьянин",  name, 1, 1, 1, 1, 1, 3);
        this.delivery = 1;
    }
    public Peasant() {
        super("Крестьянин",  giveName(), 1, 1, 1, 1, 1, 3);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Я крестьянин " + name;
    }

}
