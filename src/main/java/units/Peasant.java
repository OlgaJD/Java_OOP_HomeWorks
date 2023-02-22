package units;

public class Peasant extends BaseHeroes {
    public Peasant(String name) {
        super("Крестьянин", name, 30, 1, 0, 1);
    }

    @Override
    public String toString() {
        return "Крестьянин " + name;
    }

    public void help() {
    }

}
