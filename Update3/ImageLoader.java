package forpractice;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageLoader {

    public static BufferedImage imageLoader(String path) {

        try {
            return ImageIO.read(new File(path));
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
