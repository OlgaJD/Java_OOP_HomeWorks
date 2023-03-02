import units.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<BaseHeroes> blackTeam = getTeam(10, "black", 10);
        ArrayList<BaseHeroes> whiteTeam = getTeam(10, "white", 1);
        ArrayList<BaseHeroes> allHeroes = new ArrayList<>();
        allHeroes.addAll(blackTeam);
        allHeroes.addAll(whiteTeam);
        System.out.println("All heroes");
        allHeroes.forEach(n -> System.out.println(n.getSpeedSortedInfo()));
        System.out.println("Heroes sorted by speed");
        sort(allHeroes);
        allHeroes.forEach(n -> System.out.println(n.getSpeedSortedInfo()));

        for (BaseHeroes hero: allHeroes) {
            if (whiteTeam.contains(hero)) hero.step(whiteTeam,blackTeam);
            else hero.step(blackTeam, whiteTeam);
        }
    }

    static void sort(ArrayList<BaseHeroes> team) {
        team.sort(new Comparator<BaseHeroes>() {
            @Override
            public int compare(BaseHeroes o1, BaseHeroes o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                return o2.getSpeed() - o1.getSpeed();}
        });
    }

    public static ArrayList<BaseHeroes> getTeam(int groupSize, String teamName, int posY) {
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
                    team.add(new Spearman(count+1, posY));
                    break;
                case 1:
                    team.add(new Arbalester(count+1, posY));
                    break;
                case 2:
                    team.add(new Monk(count+1, posY));
                    break;
                case 3:
                    team.add(new Peasant(count+1, posY));
                    break;
                case 4:
                    team.add(new Bandit(count+1, posY));
                    break;
                case 5:
                    team.add(new Sniper(count+1, posY));
                    break;
                case 6:
                    team.add(new Sorcerer(count+1, posY));
                    break;
            }
            count++;
        }
        return team;
    }

}
