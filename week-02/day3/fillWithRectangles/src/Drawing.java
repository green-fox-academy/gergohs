import javax.swing.*;

import java.awt.*;

import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random randomStart = new Random();

        int x = randomStart.nextInt(30);
        int y = randomStart.nextInt(10);
        int x2 = randomStart.nextInt(70);
        int y2 = randomStart.nextInt(80);

        for (int i = 0; i < 4; i++) {

            graphics.drawRect(x, y, x2, y2);

            Random randomNum = new Random();
            int rand = randomNum.nextInt(80);
            int rand2 = randomNum.nextInt(40);

            x = x + rand;
            y = y + rand;
            x2 = x2 + rand2;
            y2 = y2 + rand2;

        }

        //int x = randomNum.nextInt();
        //int y = randomNum.nextInt();

        //    int red = randomNum.nextInt();
        //  int green = randomNum.nextInt();
        //int blue = randomNum.nextInt();

        //   graphics.setColor(new Color((red), (blue), (green)));

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