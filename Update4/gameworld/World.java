package forpractice.gameworld;

import java.awt.*;

public class World {

    private int width, height;
    private int spawnX, spawnY;
    private int tilePosId[][];


    public World(String path) {
        loadTile(path);
    }

    private void loadTile(String path) {
        String txtFile = Utils.loadFile(path);
        String tokens[] = txtFile.split("\\s+");

        width = Integer.parseInt(tokens[0]);
        height = Integer.parseInt(tokens[1]);
        tilePosId = new int[width][height];

        spawnX = Integer.parseInt(tokens[2]);
        spawnY = Integer.parseInt(tokens[3]);

        for(int y=0 ; y<height; y++) {
            for(int x=0; x<width; x++) {
                tilePosId[x][y] = Integer.parseInt(tokens[(x+y * width) + 4]);
            }
        }
    }

    public void render(Graphics graphics) {
        for(int y=0 ; y<height; y++) {
            for(int x=0; x<width; x++) {
                getTile(x,y).render(graphics,x*Tiles.tileWidth, y*Tiles.tileHeight);
            }
        }
    }

    private Tiles getTile(int x, int y) {
        Tiles t = Tiles.tiles[tilePosId[x][y]];

        if(t == null)
            return Tiles.grassTile;
        else
            return t;
    }

}
