package units;

public class Bandit extends Fighters {
    public Bandit(String name) {
        super("Разбойник", name, 60, 7, 6, 5);
    }
    public Bandit() {
        super("Разбойник", giveName(), 60, 7, 6, 5);
    }

    @Override
    public String getInfo() {
        return "Я разбойник " + name;
    }

    public void steal() {
    }

}