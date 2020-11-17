package forpractice;

import forpractice.entity.Player;
import forpractice.gameworld.World;

import java.awt.*;

public class GameState extends State {

    Player player;
    World world;

    public GameState(Game game) {
        player = new Player(game,200,200);
        world = new World("C:/Users/Sutriptim Nath/IdeaProjects/Game Programming/src/forpractice/tiles/map.txt");
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics graphics) {
        world.render(graphics);
        player.render(graphics);
    }

}
