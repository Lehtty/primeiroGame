import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tileset {
    private static BufferedImage spritesheet;
    public static BufferedImage tileWall;

    static {
        try {
            spritesheet = ImageIO.read(Tileset.class.getResource("/tileset_0.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        tileWall = getSprite(35, 40, 16, 16);
    }

    public Tileset() {
    }

    public static BufferedImage getSprite(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }
}