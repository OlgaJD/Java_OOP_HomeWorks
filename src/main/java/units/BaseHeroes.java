package units;

import java.util.Random;

public abstract class BaseHeroes implements GameInterface{
    protected String heroType;
    protected String name;
    protected int hp;
    protected int damage;
    protected int def;
    protected int speed;

    public BaseHeroes (String heroType, String name, int hp, int damage, int def, int speed) {
        this.heroType = heroType;
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.def = def;
        this.speed = speed;
    }

    public String getInfo() {
        return String.format("Класс: %s, имя: %s", this.heroType, this.name);
    }

    public void step() {
    }

    public static String giveName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    public String getFullInfo() {
        return String.format("Класс: %s, имя: %s, здоровье: %d, урон: %d, защита: %d, скорость: %d", this.heroType, this.name, this.hp, this.damage, this.def, this.speed);
    }


    public void attack() {
    }
    public void getDamage() {
    }


    public String getHeroType() {
        return heroType;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }

}