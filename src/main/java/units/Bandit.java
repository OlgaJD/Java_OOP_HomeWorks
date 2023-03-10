package units;

public class Bandit extends Fighters {
    // public Bandit(String name, int posX, int posY) {
    //     super("Разбойник", name, 8, 3, 2, 4, 100, 100, 6, posX, posY);
    // }
    // public Bandit(int posX, int posY) {
    //     super("Разбойник", giveName(), 8, 3, 2, 4, 100, 100, 6, posX, posY);
    // }

    public Bandit(String name, Vector2D coordinates) {
        super("Разбойник", giveName(), 8, 3, 2, 4, 100, 100, 6, coordinates.posX, coordinates.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Bandit.super.name)
                .append("\t| ATK:\t").append(Bandit.super.attack)
                .append("\t| HP:\t").append(Bandit.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Bandit.super.coordinates.posX).append(".").append(Bandit.super.coordinates.posY);
    }
}