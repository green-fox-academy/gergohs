import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.


        for (int i = 0; i < 3; i++) {

            Random randomSize = new Random();
            int a = randomSize.nextInt(260);              //random a szám a négyzet méretéhez

            squareDrawingFunction(graphics, a);
        }
    }

    private static void squareDrawingFunction(Graphics graphics, int a) {

        int x = (WIDTH / 2) - (a / 2);
        int y = (HEIGHT / 2) - (a / 2) - 30;             // -30 --> levonja a felugró ablak magasságából a "fejléc" méretét

        graphics.drawRect(x, y, a, a);
    }


    //*******************************************************************************************************


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