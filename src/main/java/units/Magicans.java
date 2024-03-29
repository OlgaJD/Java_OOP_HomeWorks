package units;

import java.util.ArrayList;

public abstract class Magicans extends BaseHeroes {
    protected int mp;

    public Magicans(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int maxHp, int speed, int mp, int posX, int posY) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, maxHp, speed, posX, posY);
        this.mp = mp;
    }

    public boolean step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        if (state.equals("Die")) return false;
        for (BaseHeroes healTarget: team1) {
            if (healTarget.hp < healTarget.maxHp & !healTarget.state.equals("Die")) {
                healTarget.getDamage(maxDamage);
//                System.out.println(heroType + " " + name + " вылечил " + healTarget.name + " " + maxDamage + " очков здоровья");
                return true;
            }
        }
        return true;
    }

    @Override
    public String statusInfo() {
        return super.statusInfo() + " Мана: " + mp;
    }

}
