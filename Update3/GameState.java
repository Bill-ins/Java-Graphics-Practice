package forpractice;

import forpractice.entity.Player;
import forpractice.tiles.Tiles;

import java.awt.*;

public class GameState extends State {

    Player player;

    public GameState(Game game) {
        player = new Player(game,200,200);

    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics graphics) {
        Tiles.tiles[2].render(graphics,0,0);
        player.render(graphics);
    }

}
