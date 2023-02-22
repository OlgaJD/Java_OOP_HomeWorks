package units;

public class Sorcerer extends Magicans {
    public Sorcerer(String name) {
        super("Колдун", name, 45, 17, 4, 5, 10, 10);
    }

    public Sorcerer() {
        super("Колдун", giveName(), 45, 17, 4, 5, 10, 10);
    }

    @Override
    public String getInfo() {
        return "Я колдун " + name;
    }

    @Override
    public void attack() {
    }

    public void curse() {
    }

}