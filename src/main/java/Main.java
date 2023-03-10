import units.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import static units.BaseHeroes.giveName;

public class Main {
    public static ArrayList<BaseHeroes> whiteTeam = new ArrayList<>();
    public static ArrayList<BaseHeroes> blackTeam = new ArrayList<>();
    public static ArrayList<BaseHeroes> allHeroes = new ArrayList<>();
    static final int UNITS = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        input.nextLine();
        createTeam(whiteTeam, 0, 1);
        createTeam(blackTeam, 3, 1);
        allHeroes.addAll(whiteTeam);
        allHeroes.addAll(blackTeam);
        sort(allHeroes);

       allHeroes.forEach(n -> System.out.println(n.toString()));

       allHeroes.forEach(n -> System.out.println(n.getInfo()));

       for (BaseHeroes hero: Main.allHeroes) {
            System.out.println(AnsiColors.ANSI_RED + hero.getInfo().charAt(0) + AnsiColors.ANSI_RESET);

    }



        // while (true){
        //     View.view();
        //     input.nextLine();
        //     for (BaseHeroes hero: allHeroes) {
        //         if (whiteTeam.contains(hero)) hero.step(whiteTeam, blackTeam);
        //         else hero.step(blackTeam, whiteTeam);
        //     }
        // }
    }





//        ArrayList<BaseHeroes> whiteTeam = getTeam(5, "black", 10);
//        ArrayList<BaseHeroes> blackTeam = getTeam(5, "white", 1);
//        ArrayList<BaseHeroes> allHeroes = new ArrayList<>();
//        allHeroes.addAll(blackTeam);
//        allHeroes.addAll(whiteTeam);
//        sort(allHeroes);
//        String stop = "";
//        System.out.println("\n");
//        System.out.println("\nWhite team");
//        whiteTeam.forEach(n -> System.out.println(n.statusInfo()));
//        System.out.println("\nBlack team\n");
//        blackTeam.forEach(n -> System.out.println(n.statusInfo()));
//        System.out.println("\n");
//        while (stop.equals("")) {
//
//            for (BaseHeroes hero : allHeroes) {
//                if (whiteTeam.contains(hero)) hero.step(whiteTeam, blackTeam);
//                else hero.step(blackTeam, whiteTeam);
//            }
//
//            stop = input.nextLine();
//            System.out.println("\n");
//            System.out.println("\n White team");
//            whiteTeam.forEach(n -> System.out.println(n.statusInfo()));
//            System.out.println("\n");
//            System.out.println("\nBlack team");
//            blackTeam.forEach(n -> System.out.println(n.statusInfo()));
//            System.out.println("\n");
//        }
//    }
    
    static void sort(ArrayList<BaseHeroes> team) {
        team.sort(new Comparator<BaseHeroes>() {
            @Override
            public int compare(BaseHeroes o1, BaseHeroes o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                return o2.getSpeed() - o1.getSpeed();}
        });
    }

    // public static ArrayList<BaseHeroes> getTeam(int groupSize, String teamName, int posY) {
    //     ArrayList<BaseHeroes> team = new ArrayList<>();
    //     int start = 0;
    //     int end = 0;
    //     int count = 0;
    //     if (teamName.equals("white")) {
    //         start = 0;
    //         end = 4;
    //     }
    //     if (teamName.equals("black")) {
    //         start = 3;
    //         end = 7;
    //     }
    //     while (count < groupSize) {
    //         switch (new Random().nextInt(start,end)) {
    //             case 0:
    //                 team.add(new Spearman(count+1, posY));
    //                 break;
    //             case 1:
    //                 team.add(new Arbalester(count+1, posY));
    //                 break;
    //             case 2:
    //                 team.add(new Monk(count+1, posY));
    //                 break;
    //             case 3:
    //                 team.add(new Peasant(count+1, posY));
    //                 break;
    //             case 4:
    //                 team.add(new Bandit(count+1, posY));
    //                 break;
    //             case 5:
    //                 team.add(new Sniper(count+1, posY));
    //                 break;
    //             case 6:
    //                 team.add(new Sorcerer(count+1, posY));
    //                 break;
    //         }
    //         count++;
    //     }
    //     return team;
    // }


    static void createTeam (ArrayList team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Bandit(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Sorcerer(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Peasant(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Arbalester(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Monk(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Spearman(giveName(), new Vector2D(i + 1, posY)));
                    break;
            }
        }
    }

}
