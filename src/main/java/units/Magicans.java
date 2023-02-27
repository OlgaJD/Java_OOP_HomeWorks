package units;

public abstract class Magicans extends BaseHeroes {
    protected int mp;

    public Magicans(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int speed, int mp) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, speed);
        this.mp = mp;
    }

}
