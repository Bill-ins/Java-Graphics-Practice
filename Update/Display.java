package sample;

import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame frame;
    private String frameTitle;
    private int width;
    private int height;
    private Canvas canvas;

    public Display(String frameTitle, int width, int height) {

        this.frameTitle = frameTitle;
        this.width = width;
        this.height = height;
        createDisplay();
    }

    private void createDisplay() {
        frame = new JFrame(frameTitle);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}




