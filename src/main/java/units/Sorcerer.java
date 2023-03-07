package units;

public class Sorcerer extends Magicans {
    public Sorcerer(String name, int posX, int posY) {
        super("Колдун", name, 17, 12, -5, -5, 300, 300, 9, 15, posX, posY);
    }
    public Sorcerer(int posX, int posY) {
        super("Колдун", giveName(), 17, 12, -5, -5, 300, 300, 9, 15, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Я колдун " + name;
    }
}