package forpractice;

import forpractice.entity.Player;

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
        player.render(graphics);
    }

}
