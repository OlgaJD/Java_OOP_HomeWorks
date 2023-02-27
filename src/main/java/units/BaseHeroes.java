package units;
import java.util.Random;

public abstract class BaseHeroes implements GameInterface{
    protected int attack;
    protected int def;
    protected int minDamage;
    protected int maxDamage;
    protected int hp;
    protected int speed;
    protected String name;
    protected String heroType;


    public BaseHeroes (String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int speed) {
        this.attack = attack;
        this.def = def;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.speed = speed;
        this.name = name;
        this.heroType = heroType;
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
        return String.format("Класс: %s, имя: %s, здоровье: %d, минимальный урон: %d, максимальный урон: %d, защита: %d, скорость: %d", this.heroType, this.name, this.hp, this.minDamage, this.maxDamage, this.def, this.speed);
    }

    public String getSpeedSortedInfo() { // метод для проверки сортировки
        return String.format("%s %s, скорость: %d, здоровье: %d", this.heroType, this.name, this.speed, this.hp);
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }
}