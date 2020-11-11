package forpractice.entity;

public abstract class Creature extends Entity {

    protected int health;
    protected float movement;
    protected float xDirection;
    protected float yDirection;

    public static final int defaultHealth = 10;
    public static final float defaultMovement = 3.0f;
    public static final int defaultCreatureHeight = 100;
    public static final int defaultCreatureWidth = 100;


    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = defaultHealth;
        movement = defaultMovement;
    }

    public void move() {
        x += xDirection;
        y += yDirection;
    }
}
