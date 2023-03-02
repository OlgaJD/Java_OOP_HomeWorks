package units;

public class Sorcerer extends Magicans {
    public Sorcerer(String name, int posX, int posY) {
        super("Колдун", name, 17, 12, -5, -5, 30, 30, 9, 1, posX, posY);
    }
    public Sorcerer(int posX, int posY) {
        super("Колдун", giveName(), 17, 12, -5, -5, 30, 30, 9, 1, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Я колдун " + name;
    }
}