package units;

public class Bandit extends Fighters {
    public Bandit(String name) {
        super("Разбойник", name, 8, 3, 2, 4, 10, 6);
    }
    public Bandit() {
        super("Разбойник", giveName(), 8, 3, 2, 4, 10, 6);
    }

    @Override
    public String getInfo() {
        return "Я разбойник " + name;
    }
}