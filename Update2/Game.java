package forpractice;

import sample.entity.Entity;
import sample.entity.Player;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable {

    // Displaying Canvas
    Display display;
    private int width,height;
    private String title;

    // Thread
    Thread thread;
    private boolean isRunning = false;

    // Image
    BufferStrategy bufferStrategy;
    Graphics graphics;
    BufferedImage image;

    // SpriteSheet and Assets
    Assets assets;

    // States
    State gameState;

    // Key Events
    KeyManager keyManager;

    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
    }

    private void initialize() {
        display = new Display(title,width,height);
        display.getFrame().addKeyListener(keyManager);
        Assets.crop();
        gameState = new GameState(this);
        State.setCurrentState(gameState);
    }

    private void render() {
        bufferStrategy = display.getCanvas().getBufferStrategy();

        if(bufferStrategy == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }

        graphics = bufferStrategy.getDrawGraphics();

        // Clear previous Graphics
        graphics.clearRect(0,0,width,height);

        // Rendering Process
        if(gameState != null) {
            gameState.render(graphics);
        }

        bufferStrategy.show();
        graphics.dispose();
    }

    private void tick() {
        keyManager.tick();
        if(gameState != null) {
            gameState.tick();
        }
    }

    public synchronized void start() {
        if(!isRunning) {
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    public synchronized void stop() {
        if(isRunning) {
            isRunning = false;
            try{ thread.join(); }catch(Exception e) {}
        }
    }

    @Override
    public void run() {
        initialize();
        int fps = 60;
        double perTick = 1000000000/fps;
        double delta = 0;
        long lastTime = System.nanoTime();
        long now;

        while(isRunning) {
            now = System.nanoTime();
            delta = delta + (now - lastTime)/perTick;
            lastTime = now;

            if(delta >= 1) {
                render();
                tick();
                delta--;
            }
        }
        stop();
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }
}
