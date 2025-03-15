import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

public class Blocks extends Rectangle {
    public Blocks(int x, int y) {
        super(x, y, 32, 32);
    }

    public void render(Graphics g) {
        g.drawImage(Tileset.tileWall, this.x, this.y, 32, 32, (ImageObserver)null);
    }
}
