package units;

public class Arbalester extends Archers{

    // public Arbalester(String name,  int posX, int posY) {
    //     super("Арбалетчик", name, 6, 3, 2, 3, 100, 100, 4, 16, posX, posY);
    // }

    // public Arbalester(int posX, int posY) {
    //     super("Арбалетчик", giveName(), 6, 3, 2, 3, 100, 100, 4, 16, posX, posY);
    // }

    public Arbalester(String name, Vector2D coordinates) {
        super("Арбалетчик", giveName(), 6, 3, 2, 3, 100, 100, 4, 16, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: \t").append(Arbalester.super.name)
                .append("\t| ATK:\t").append(Arbalester.super.attack)
                .append("\t| HP:\t").append(Arbalester.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Arbalester.super.coordinates.posX).append(".").append(Arbalester.super.coordinates.posY);
    }
}