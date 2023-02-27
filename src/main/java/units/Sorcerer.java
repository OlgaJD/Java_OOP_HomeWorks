package units;

public class Sorcerer extends Magicans {
    public Sorcerer(String name) {
        super("Колдун", name, 17, 12, -5, -5, 30, 9, 1);
    }
    public Sorcerer() {
        super("Колдун", giveName(), 17, 12, -5, -5, 30, 9, 1);
    }

    @Override
    public String getInfo() {
        return "Я колдун " + name;
    }
}