import units.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<BaseHeroes> blackTeam = getTeam(10, "black");
        ArrayList<BaseHeroes> whiteTeam = getTeam(10, "white");
        ArrayList<BaseHeroes> allHeroes = new ArrayList<>();
        allHeroes.addAll(blackTeam);
        allHeroes.addAll(whiteTeam);
        System.out.println("All heroes");
        allHeroes.forEach(n -> System.out.println(n.getSpeedSortedInfo()));
        System.out.println("Heroes sorted by speed");
        sort(allHeroes);
        allHeroes.forEach(n -> System.out.println(n.getSpeedSortedInfo()));
    }


    static void sort(ArrayList<BaseHeroes> team) {
        team.sort(new Comparator<BaseHeroes>() {
            @Override
            public int compare(BaseHeroes o1, BaseHeroes o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                return o2.getSpeed() - o1.getSpeed();}
        });
    }

    public static ArrayList<BaseHeroes> getTeam(int groupSize, String teamName) {
        ArrayList<BaseHeroes> team = new ArrayList<>();
        int start = 0;
        int end = 0;
        int count = 0;
        if (teamName.equals("white")) {
            start = 0;
            end = 4;
        }
        if (teamName.equals("black")) {
            start = 3;
            end = 7;
        }
        while (count < groupSize) {
            switch (new Random().nextInt(start,end)) {
                case 0:
                    team.add(new Spearman());
                    break;
                case 1:
                    team.add(new Arbalester());
                    break;
                case 2:
                    team.add(new Monk());
                    break;
                case 3:
                    team.add(new Peasant());
                    break;
                case 4:
                    team.add(new Bandit());
                    break;
                case 5:
                    team.add(new Sniper());
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
