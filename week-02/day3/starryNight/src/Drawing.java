import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)


        Random randomPoints = new Random();
        Random randomColorForStars = new Random();

        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, 320, 343);

        for (int i = 0; i < 1000; i++) {

            int colorOfStars = randomColorForStars.nextInt(30);
            int x = randomPoints.nextInt(300);
            int y = randomPoints.nextInt(300);
            int sizeOfStars = randomPoints.nextInt(10);

            graphics.setColor(new Color(colorOfStars, colorOfStars, colorOfStars));
            graphics.fillRect(x, y, sizeOfStars, sizeOfStars);
        }

    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}