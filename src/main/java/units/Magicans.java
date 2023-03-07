package units;

import java.util.ArrayList;

public abstract class Magicans extends BaseHeroes {
    protected int mp;

    public Magicans(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int maxHp, int speed, int mp, int posX, int posY) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, maxHp, speed, posX, posY);
        this.mp = mp;
    }


    public void step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        for (BaseHeroes healTarget: team1) {
            if (healTarget.hp < healTarget.maxHp & !healTarget.state.equals("Die")) {
                healTarget.getDamage(maxDamage);
                System.out.println(heroType + " " + name + " вылечил " + healTarget.name + " " + maxDamage + " очков здоровья");
                return;
            }
        }
    }

    //    protected BaseHeroes findHealTarget(ArrayList<BaseHeroes> teamMates) {
//        double minHp = Double.MAX_VALUE;
//        int index = 0;
//        for (int i = 0; i < teamMates.size(); i++) {
//            if (minHp > (teamMates.get(i).maxHp - teamMates.get(i).hp) && !teamMates.get(i).state.equals("Die")) {
//                index = i;
//                minHp = teamMates.get(i).maxHp - teamMates.get(i).hp;
//            }
//        }
//        return teamMates.get(index);
//    }
//    @Override
//    public void step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
//        if (state.equals("Die") || mp <= 0) return;
//        BaseHeroes healTarget = findHealTarget(team1);
//        healTarget.getDamage(maxDamage);
//        System.out.println(heroType + " " + name + " вылечил " + healTarget.name + " " + maxDamage + " очков здоровья");
//        mp--;
//    }

    @Override
    public String statusInfo() {
        return super.statusInfo() + " Мана: " + mp;
    }

}
