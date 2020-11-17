package forpractice;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage grass,dirt,rock,gamecharacter;

    public static void readyImages() {
        grass = ImageLoader.imageLoader("C:/Users/Sutriptim Nath/IdeaProjects/Game Programming/src/forpractice/resourses/grass.png");
        dirt = ImageLoader.imageLoader("C:/Users/Sutriptim Nath/IdeaProjects/Game Programming/src/forpractice/resourses/dirt.png");
        rock = ImageLoader.imageLoader("C:/Users/Sutriptim Nath/IdeaProjects/Game Programming/src/forpractice/resourses/rock.png");
        gamecharacter = ImageLoader.imageLoader("C:/Users/Sutriptim Nath/IdeaProjects/Game Programming/src/forpractice/resourses/gamecharacter.png");
    }
}
