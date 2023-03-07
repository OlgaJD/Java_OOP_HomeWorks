import units.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<BaseHeroes> blackTeam = getTeam(5, "black", 10);
        ArrayList<BaseHeroes> whiteTeam = getTeam(5, "white", 1);
        ArrayList<BaseHeroes> allHeroes = new ArrayList<>();
        allHeroes.addAll(blackTeam);
        allHeroes.addAll(whiteTeam);
////        System.out.println("All heroes");
////        allHeroes.forEach(n -> System.out.println(n.getSpeedSortedInfo()));
////        System.out.println("Heroes sorted by speed");
        sort(allHeroes);
////        allHeroes.forEach(n -> System.out.println(n.getSpeedSortedInfo()));
//



        Scanner input = new Scanner(System.in);
        String stop = "";
        System.out.println("\n");
        System.out.println("\nWhite team");
        whiteTeam.forEach(n -> System.out.println(n.statusInfo()));
        System.out.println("\nBlack team\n");
        blackTeam.forEach(n -> System.out.println(n.statusInfo()));
        System.out.println("\n");
        while (stop.equals("")) {
//            if (whiteTeam.size() == 0 | blackTeam.size() == 0 ) {
//                System.out.println("Игра закончена");
//                return;
//            }
            for (BaseHeroes hero : allHeroes) {
                if (whiteTeam.contains(hero)) hero.step(whiteTeam, blackTeam);
                else hero.step(blackTeam, whiteTeam);
            }
//            allHeroes.forEach(n -> System.out.println(n.statusInfo()));
            stop = input.nextLine();

            System.out.println("\n");
            System.out.println("\n White team");
            whiteTeam.forEach(n -> System.out.println(n.statusInfo()));
            System.out.println("\n");
            System.out.println("\nBlack team");
            blackTeam.forEach(n -> System.out.println(n.statusInfo()));
            System.out.println("\n");
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
