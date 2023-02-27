package units;

public abstract class Archers extends BaseHeroes{
    protected int shoots;

    public Archers(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int speed, int shoots) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, speed);
        this.shoots = shoots;
    }

}