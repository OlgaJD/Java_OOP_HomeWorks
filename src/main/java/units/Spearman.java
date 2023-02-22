package units;

public class Spearman extends Fighters{
    public Spearman(String name) {
        super("Копейщик", name, 60, 5, 6, 5);
    }
    public Spearman() {
        super("Копейщик", giveName(), 60, 5, 6, 5);
    }

    @Override
    public String getInfo() {
        return "Я копейщик " + name;
    }

}