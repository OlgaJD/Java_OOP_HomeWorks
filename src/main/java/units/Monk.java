package units;

public class Monk extends Magicans {

    public Monk(String name, Vector2D coordinates) {
        super("Монах", giveName(), 12, 7, -4, -4, 300, 300, 5, 15, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах: \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append("\t| MP:\t").append(Monk.super.mp)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coordinates.posX).append(".").append(Monk.super.coordinates.posY);
    }

}
