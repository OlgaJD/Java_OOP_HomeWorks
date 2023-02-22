package units;

public class Sniper extends Archers{
    boolean luck;
    public Sniper(String name) {
        super("Снайпер", name, 50, 10, 3, 5, 10, 10);
    }

    @Override
    public void attack() {
    }

    public void luckyAttack(){
    }

}
