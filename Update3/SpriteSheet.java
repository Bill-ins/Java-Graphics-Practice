package forpractice;

import java.awt.image.BufferedImage;

public class SpriteSheet {

    BufferedImage image;

    public SpriteSheet(BufferedImage image) {
        this.image = image;
    }

    public BufferedImage crop(int x, int y, int width, int height) {
        return image.getSubimage(x, y, width, height);
    }

}
