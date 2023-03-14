package units;

public class Vector2D {
    protected int posX;
    protected int posY;
    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Vector2D enemy){
        return posX < enemy.posX;
    }
    protected double getDistance (Vector2D enemy) {
        return Math.sqrt(Math.pow(posX - enemy.posX, 2) + Math.pow(posY - enemy.posY,2));
    }
}
