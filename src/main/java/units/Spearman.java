package units;

public class Spearman extends Fighters{

    public Spearman(String name, Vector2D coordinates) {
        super("Копейщик", giveName(), 8, 3, 2, 4, 100, 100, 6, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append("\t|").append("\t| (X.Y) : ").append(Spearman.super.coordinates.posX).append(".").append(Spearman.super.coordinates.posY);
    }
}