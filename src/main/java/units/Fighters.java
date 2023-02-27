package units;

public abstract class Fighters extends BaseHeroes{
    public Fighters(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int speed) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, speed);
    }

}