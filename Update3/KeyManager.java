package forpractice;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    protected boolean key[];
    public boolean up, down, left, right;

    public KeyManager() {
        key = new boolean[256];
    }

    public void tick() {
        up = key[KeyEvent.VK_UP];
        down = key[KeyEvent.VK_DOWN];
        right = key[KeyEvent.VK_RIGHT];
        left = key[KeyEvent.VK_LEFT];
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        key[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        key[e.getKeyCode()] = false;
    }

}
