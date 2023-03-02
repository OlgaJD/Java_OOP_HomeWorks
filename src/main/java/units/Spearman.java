package units;

public class Spearman extends Fighters{
    public Spearman(String name, int posX, int posY) {
        super("Копейщик", name, 4, 5, 1, 3, 10, 10,  4, posX, posY);
    }
    public Spearman(int posX, int posY) {
        super("Копейщик", giveName(), 4, 5, 1, 3, 10, 10, 4, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Я копейщик " + name;
    }

}