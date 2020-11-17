package forpractice.entity;

import forpractice.Assets;
import forpractice.Game;

import java.awt.*;

public class Player extends Creature{

    Game game;
    public Player(Game game, float x, float y) {
        super(x, y, defaultCreatureWidth, defaultCreatureHeight);
        this.game = game;
    }

    @Override
    public void tick() {
        getInput();
        move();
    }

    public void getInput() {
        xDirection = 0;
        yDirection = 0;

        if(game.getKeyManager().up) {
            yDirection = -movement;
        }

        else if(game.getKeyManager().down) {
            yDirection = +movement;
        }

        else if(game.getKeyManager().right) {
            xDirection = +movement;
        }

        else if(game.getKeyManager().left) {
            xDirection = -movement;
        }

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.gamecharacter,(int)x, (int)y, width, height,null);
    }

}
