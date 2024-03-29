package units;

import java.util.ArrayList;

public class Peasant extends BaseHeroes {
    protected int delivery;

    public Peasant(String name, Vector2D coordinates) {
        super("Фермер",  giveName(), 1, 1, 1, 1, 1, 1, 3, coordinates.posX, coordinates.posY);
        this.delivery = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coordinates.posX).append(".").append(Peasant.super.coordinates.posY);
    }

    @Override
    public boolean step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        if (!state.equals("Die")) {
            state = "Stand";
            return true;
        }
        else return false;
    }
}
