package units;

import java.util.ArrayList;

public class Peasant extends BaseHeroes {
    protected int delivery;

    // public Peasant(String name, int posX, int posY) {
    //     super("Крестьянин",  name, 1, 1, 1, 1, 1, 1, 3, posX, posY);
    //     this.delivery = 1;
    // }
    // public Peasant(int posX, int posY) {
    //     super("Крестьянин",  giveName(), 1, 1, 1, 1, 1, 1, 3, posX, posY);
    //     this.delivery = 1;
    // }

    public Peasant(String name, Vector2D coordinates) {
        super("Крестьянин",  giveName(), 1, 1, 1, 1, 1, 1, 3, coordinates.posX, coordinates.posY);
        this.delivery = 1;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Peasant.super.coordinates.posX).append(".").append(Peasant.super.coordinates.posY);
    }

    @Override
    public void step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        if (!state.equals("Die")) {
            state = "Stand";
            System.out.println("Я, " + name +", не бесполезный крестьянин, несу стрелы лучникам");
        } 
    }

}
