package units;

public class Bandit extends Fighters {
    public Bandit(String name, int posX, int posY) {
        super("Разбойник", name, 8, 3, 2, 4, 10, 10, 6, posX, posY);
    }
    public Bandit(int posX, int posY) {
        super("Разбойник", giveName(), 8, 3, 2, 4, 10, 10, 6, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Я разбойник " + name;
    }
}