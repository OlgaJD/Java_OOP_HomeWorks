package units;

import java.util.ArrayList;

public interface GameInterface {
    boolean step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2);
    StringBuilder getInfo();
}