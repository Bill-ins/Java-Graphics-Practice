package forpractice.tiles;
import forpractice.Assets;
import java.awt.image.BufferedImage;

public class RockTile extends Tiles {

    public RockTile(int id) {
        super(Assets.rock, id);
    }

    @Override
    public boolean isWalkable() {
        return false;
    }
}
