import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.


        for (int i = 0; i < 3; i++) {

            Random randomStartPoint = new Random();
            int x = randomStartPoint.nextInt(250);              //random X és Y kezdő koordináták
            int y = randomStartPoint.nextInt(250);

            squareDrawingFunction(graphics, x, y);
        }
    }

    private static void squareDrawingFunction(Graphics graphics, int x, int y) {
        int a = 50;
        graphics.drawRect(x, y, a, a);
    }


    //    Don't touch the code below
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