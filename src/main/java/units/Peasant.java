package units;

public class Peasant extends BaseHeroes {
    public Peasant(String name) {
        super("Крестьянин", name, 30, 1, 0, 1);
    }
    public Peasant() {
        super("Крестьянин", giveName(), 30, 1, 0, 1);
    }


    @Override
    public String getInfo() {
        return "Я крестьянин " + name;
    }

    public void help() {
    }

}
