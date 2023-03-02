package units;

import java.util.ArrayList;

public abstract class Archers extends BaseHeroes{
    protected int shoots;

    public Archers(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int maxHp, int speed, int shoots, int posX, int posY) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, maxHp, speed, posX, posY);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        if (state.equals("Die") || shoots == 0) return;
        BaseHeroes enemy = team2.get(findNearest(team2));
        float damage = (enemy.def - attack)>0 ? minDamage : (enemy.def - attack)<0 ? maxDamage : (minDamage+maxDamage)/2;
        enemy.getDamage(damage);
        for (BaseHeroes hero: team1) {
            if (hero.heroType.equals("Крестьянин") && hero.state.equals("Stand")) {
                hero.state = "Busy";
                return;
            }
        }
        shoots--;

    }

}