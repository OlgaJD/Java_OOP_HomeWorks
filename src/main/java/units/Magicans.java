package units;

public abstract class Magicans extends BaseHeroes {
    protected int mp;

    public Magicans(String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int maxHp, int speed, int mp, int posX, int posY) {
        super(heroType, name, attack, def, minDamage, maxDamage, hp, maxHp, speed, posX, posY);
        this.mp = mp;
    }

}
