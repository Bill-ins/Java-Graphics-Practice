package forpractice.gameworld;
import forpractice.Assets;

public class RockTile extends Tiles {

    public RockTile(int id) {
        super(Assets.rock, id);
    }

    @Override
    public boolean isWalkable() {
        return false;
    }
}
