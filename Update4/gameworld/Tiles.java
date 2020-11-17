package forpractice.gameworld;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tiles {

    protected BufferedImage texture;
    protected final int id;
    public static final int tileHeight = 50;
    public static final int tileWidth = 50;

    public static Tiles tiles[] = new Tiles[256];
    public static Tiles grassTile = new GrassTile(0);
    public static Tiles rockTile = new RockTile(1);
    public static Tiles dirtTile = new DirtTile(2);

    public Tiles(BufferedImage texture, int id) {
        this.id = id;
        this.texture = texture;

        tiles[id] = this;
    }

    public int getId() {
        return id;
    }

    public void render(Graphics graphics, int x, int y) {
        graphics.drawImage(texture, x, y, tileWidth, tileHeight,null);
    }

    public boolean isWalkable() {
        return true;
    }

}
