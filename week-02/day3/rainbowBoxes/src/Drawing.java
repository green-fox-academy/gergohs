import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int squareSize = 240;

        Color[] squareColors = {Color.red, Color.ORANGE, Color.yellow, Color.green, Color.blue, Color.MAGENTA};

        for (int i = 0; i < 6; i++) {
            squareMaker(graphics, squareSize, squareColors[i]);
            squareSize -=40;
        }
    }

    public static void squareMaker(Graphics graphics, int squareSize, Color squareColors ) {
        int x = (WIDTH / 2) - (squareSize / 2);
        int y = (HEIGHT / 2) - (squareSize / 2) - 30;

        graphics.setColor(squareColors);
        graphics.fillRect(x, y, squareSize, squareSize);
    }





//***********************************************************************************************************

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