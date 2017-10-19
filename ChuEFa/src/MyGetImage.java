import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MyGetImage {
    public static BufferedImage OutputToScrn(BufferedImage img){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("C:\\CsGuO93fCZ0.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}