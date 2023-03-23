package units;
import java.util.ArrayList;
import java.util.Random;


public abstract class BaseHeroes implements GameInterface{
    protected int attack;
    protected int def;
    protected int minDamage;
    protected int maxDamage;
    protected int hp;
    protected int maxHp;
    protected int speed;
    protected String name;
    protected String heroType;
    protected Vector2D coordinates;
    protected String state;

    public BaseHeroes (String heroType, String name, int attack, int def, int minDamage, int maxDamage, int hp, int maxHp, int speed, int posX, int posY) {
        this.attack = attack;
        this.def = def;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.name = name;
        this.heroType = heroType;
        coordinates = new Vector2D(posX, posY);
        state = "Stand";
    }

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }

    @Override
    public boolean step(ArrayList<BaseHeroes> team1, ArrayList<BaseHeroes> team2) {return true;}

    protected int findNearest(ArrayList<BaseHeroes> allHeroes) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < allHeroes.size(); i++) {
            if (min > coordinates.getDistance(allHeroes.get(i).coordinates ) && !allHeroes.get(i).state.equals("Die") ) {
                index = i;
                min = coordinates.getDistance(allHeroes.get(i).coordinates);
            }
        }
        return index;
    }

    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) {
            hp = maxHp;
        }
    }

    public static String giveName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }


    public String statusInfo(){
        return  heroType + " " +
                name + " " +
                state +
                " Здоровье: " + Math.round(hp);
    }

    @Override
    public String toString() {
        return name +
                " Здоровье:" + Math.round(hp) +
                " Защита:" + def +
                " Атака:" + attack +
                " Урон:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                " " + state;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public int[] getCoords() {return new int[]{coordinates.posX, coordinates.posY};}

}