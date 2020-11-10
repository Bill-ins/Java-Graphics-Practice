package forpractice.entity;

import forpractice.Assets;
import forpractice.Game;

import java.awt.*;

public class Player extends Creature{

    Game game;
    public Player(Game game, float x, float y) {
        super(x, y);
        this.game = game;
    }

    @Override
    public void tick() {
        if(game.getKeyManager().up) {
            y--;
        }

        else if(game.getKeyManager().down) {
            y++;
        }

        else if(game.getKeyManager().right) {
            x++;
        }

        else if(game.getKeyManager().left) {
            x--;
        }

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.two,(int)x, (int)y,null);
    }

}
