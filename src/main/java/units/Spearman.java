package units;

public class Spearman extends Fighters{
    // public Spearman(String name, int posX, int posY) {
    //     super("Копейщик", name, 4, 5, 1, 3, 100, 100,  4, posX, posY);
    // }
    // public Spearman(int posX, int posY) {
    //     super("Копейщик", giveName(), 4, 5, 1, 3, 100, 100, 4, posX, posY);
    // }

    public Spearman(String name, Vector2D coordinates) {
        super("Копейщик", giveName(), 4, 5, 1, 3, 100, 100, 4, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coordinates.posX).append(".").append(Spearman.super.coordinates.posY);
    }

}