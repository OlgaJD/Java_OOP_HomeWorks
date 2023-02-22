import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<BaseHeroes> newTeam = getTeam(10);
        newTeam.forEach(n -> System.out.println(n.getInfo()));
    }


    public static ArrayList<BaseHeroes> getTeam(int groupSize) {
        ArrayList<BaseHeroes> team = new ArrayList<>();
        int count = 0;
        while (count < groupSize)
        {
            switch (new Random().nextInt(0,7)) {
                case 0:
                    team.add(new Peasant());
                    break;
                case 1:
                    team.add(new Spearman());
                    break;
                case 2:
                    team.add(new Bandit());
                    break;
                case 3:
                    team.add(new Arbalester());
                    break;
                case 4:
                    team.add(new Sniper());
                    break;
                case 5:
                    team.add(new Monk());
                    break;
                case 6:
                    team.add(new Sorcerer());
                    break;
            }
            count++;
        }
        return team;
    }
}
