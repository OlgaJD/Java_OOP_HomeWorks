package units;

import java.util.ArrayList;

public abstract class Fighters extends BaseHeroes{
    public Fighters(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int maxHp, int speed,int posX, int posY) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, maxHp, speed, posX, posY);
    }

    @Override
    public boolean step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {
        if (state.equals("Die")) return false;
        BaseHeroes enemyTarget = team2.get(findNearest(team2));
        if (enemyTarget.coordinates.getDistance(coordinates) < 2) {
            float damage = (enemyTarget.def - attack) > 0 ? minDamage : (enemyTarget.def - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            enemyTarget.getDamage(damage);
        } else {

            Vector2D temp = coordinates.chooseWay(enemyTarget.coordinates);
            if (Math.abs(temp.posX) < Math.abs(temp.posY)) {
                if (coordinates.chooseWay(enemyTarget.coordinates).posY > 0) {
                    coordinates.posY--;
                } else {
                    coordinates.posY++;
                }
            } else {
                if (coordinates.chooseWay(enemyTarget.coordinates).posX > 0) {
                    coordinates.posX--;
                } else {
                    coordinates.posX++;
                }
            }
        }
        return true;
    }
}