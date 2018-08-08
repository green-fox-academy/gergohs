import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        Random rand = new Random();

        int low = 20;
        int high = 70;

        int x = rand.nextInt(2);
        int y = rand.nextInt(2);
        int a = rand.nextInt(high-low)+low;

        System.out.println("Value of X is: " + x);
        System.out.println("Value of Y is: " + y);
        System.out.println("Value of a is: " + a);

        if (x == 0 && y == 0) {
            graphics.setColor(Color.green);
        }
        else {graphics.setColor(Color.red);}

        for (int j = 0; j < 4; j++) {
            drawRowOfSquares(graphics, x, y, a, j);
        }

    }

    private static void drawRowOfSquares(Graphics graphics, int x, int y, int a, int j) {
        for (int i = 0; i < 4; i++) {
            drawOneSquare(graphics, x + i * a , y + j * a, a);
        }
    }
    private static void drawOneSquare(Graphics graphics, int x, int y, int a) {
        graphics.drawLine(x, y, x + a, y);
        graphics.drawLine(x + a, y, x + a, y + a);
        graphics.drawLine(x + a, y + a, x, y + a);
        graphics.drawLine(x, y + a, x, y);
    }


    // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 343;

        public static void main (String[]args){
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
