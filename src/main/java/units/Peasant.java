package units;

import java.util.ArrayList;

public class Peasant extends BaseHeroes {
    protected int delivery;

    public Peasant(String name, int posX, int posY) {
        super("Крестьянин",  name, 1, 1, 1, 1, 1, 1, 3, posX, posY);
        this.delivery = 1;
    }
    public Peasant(int posX, int posY) {
        super("Крестьянин",  giveName(), 1, 1, 1, 1, 1, 1, 3, posX, posY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Я крестьянин " + name;
    }

    @Override
    public void step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        if (!state.equals("Die")) {
            state = "Stand";
            System.out.println("Я, " + name +", не бесполезный крестьянин, несу стрелы лучникам");
        } 
    }

}
