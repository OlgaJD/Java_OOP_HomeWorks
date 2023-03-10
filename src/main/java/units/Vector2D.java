package units;

public class Vector2D {
    protected int posX;
    protected int posY;
    public Vector2D(int x, int y) {
        this.posX = posX;
        this.posY = posY;
    }
    protected double getDistance (Vector2D enemy) {
        return Math.sqrt(Math.pow(posX - enemy.posX, 2) + Math.pow(posY - enemy.posY,2));
    }
}
