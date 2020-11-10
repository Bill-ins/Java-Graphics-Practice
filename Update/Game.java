package sample;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable {

    private Display display;
    private int width, height;
    private String title;

    private BufferStrategy bs;
    private Graphics g;
    private BufferedImage testImage;

    private SpriteSheet sheet;

    Thread thread;
    private boolean running = false;

    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void initialize() {
        display = new Display(title, width, height);
        Assets.initialize();
    }

    private void tick() {

    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        //Clear Screen
        g.clearRect(0,0,width,height);

        // Redering Stuff

        g.drawImage(Assets.two,10,10,null);

        // Redering Stuff

        bs.show();
        g.dispose();
    }

    public synchronized void start() {
        if(!running) {
            running = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    public synchronized void stop() {
        if(running) {
            running = false;
            try { thread.join(); } catch (Exception e) {}
        }
    }

    @Override
    public void run() {
        initialize();
        while(running) {
            render();
            tick();
        }
        stop();
    }


}
