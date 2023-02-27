package units;

public class Spearman extends Fighters{
    public Spearman(String name) {
        super("Копейщик", name, 4, 5, 1, 3, 4, 4);
    }
    public Spearman() {
        super("Копейщик", giveName(), 4, 5, 1, 3, 4, 4);
    }

    @Override
    public String getInfo() {
        return "Я копейщик " + name;
    }

}