package units;

public class Sorcerer extends Magicans {

    public Sorcerer(String name, Vector2D coordinates) {
        super("Колдун", giveName(), 17, 12, -5, -5, 300, 300, 9, 15, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Sorcerer.super.name)
                .append("\t| ATK:\t").append(Sorcerer.super.attack)
                .append("\t| HP:\t").append(Sorcerer.super.hp)
                .append("\t|").append("\t| (X.Y) : ").append(Sorcerer.super.coordinates.posX).append(".").append(Sorcerer.super.coordinates.posY);
    }
}