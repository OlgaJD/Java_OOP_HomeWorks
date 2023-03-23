package units;

public class Sniper extends Archers{

    public Sniper(String name, Vector2D coordinates) {
        super("Снайпер", giveName(), 12, 10, 8, 10, 100, 100, 9, 32, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coordinates.posX).append(".").append(Sniper.super.coordinates.posY);
    }
}
