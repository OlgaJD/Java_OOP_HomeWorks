import units.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import static units.BaseHeroes.giveName;

public class Main {
    static final int UNITS = 10;
    public static ArrayList<BaseHeroes> whiteTeam = new ArrayList<>();
    public static ArrayList<BaseHeroes> blackTeam = new ArrayList<>();
    public static ArrayList<BaseHeroes> allHeroes = new ArrayList<>();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Нажмите клавишу Enter для начала игры");
        input.nextLine();
        createTeam(whiteTeam, 0, 1);
        createTeam(blackTeam, 3, 10);
        allHeroes.addAll(whiteTeam);
        allHeroes.addAll(blackTeam);
        sort(allHeroes);
        boolean game = true;
        int countWhite = 0;
        int countBlack = 0;
         while (game){
             View.view();
             input.nextLine();
             countWhite = 0;
             countBlack = 0;
             for (BaseHeroes hero: allHeroes) {
                 if (whiteTeam.contains(hero)) {
                     if (hero.step(whiteTeam, blackTeam)) countWhite++;
                 } else {
                     if (hero.step(blackTeam, whiteTeam)) countBlack++;
                 }
             }

             if (countWhite == 0 || countBlack == 0) {
                 game = false;
             }
         }
        View.results();
        View.view();
        if (countWhite == 0) View.blackWin();
        else View.whiteWin();;
        View.gameOver();
    }

    static void sort(ArrayList<BaseHeroes> team) {
        team.sort(new Comparator<BaseHeroes>() {
            @Override
            public int compare(BaseHeroes o1, BaseHeroes o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                return o2.getSpeed() - o1.getSpeed();}
        });
    }

    static void createTeam (ArrayList team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Arbalester(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Spearman(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Monk(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Peasant(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Sniper(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Bandit(giveName(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Sorcerer(giveName(), new Vector2D(i + 1, posY)));
                    break;
            }
        }
    }

}
