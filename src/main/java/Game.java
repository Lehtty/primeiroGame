import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener {
    public static int WIDTH = 1920;
    public static int HEIGHT = 1080;
    public Player player;
    public World world;

    public Game() {
        this.addKeyListener(this);
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.player = new Player(32,32);
        this.world = new World();
    }

    public void tick() {
        this.player.tick();
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
        } else {
            Graphics g = bs.getDrawGraphics();
            g.setColor(new Color(93, 227, 122));
            g.fillRect(0, 0, WIDTH, HEIGHT);
            this.world.render(g);
            bs.show();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setTitle("Test");
        frame.pack();
        frame.setLocationRelativeTo((Component)null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        (new Thread(game)).start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 39) {
            this.player.right = true;
        } else if (e.getKeyCode() == 37) {
            this.player.left = true;
        }

        if (e.getKeyCode() == 38) {
            this.player.up = true;
        } else if (e.getKeyCode() == 40) {
            this.player.down = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 39) {
            this.player.right = false;
        } else if (e.getKeyCode() == 37) {
            this.player.left = false;
        }

        if (e.getKeyCode() == 38) {
            this.player.up = false;
        } else if (e.getKeyCode() == 40) {
            this.player.down = false;
        }

    }

    @Override
    public void run() {
        while(true) {
            this.tick();
            this.render();

            try {
                Thread.sleep(16L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}