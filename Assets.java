package sample;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage one, two, three;

    public static void initialize() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImg("C:/Users/Sutriptim Nath/IdeaProjects/Game Programming/src/sample/resourses/test2.png"));

        one = sheet.crop(0,0,210,270);
        two = sheet.crop(210,0,210,270);
        three = sheet.crop(210,270,210,270);
    }

}
