import javax.swing.*;

import java.awt.*;

import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.


        for (int i = 0; i < 4; i++) {
            Random randomStart = new Random();         //random számokat ad meg az első négyzet kezdő koordinátáihoz
            int x = randomStart.nextInt(180);   //a random számok a for cikluson belül minden körben új értéket kapnak
            int y = randomStart.nextInt(180);
            int x2 = randomStart.nextInt(140);
            int y2 = randomStart.nextInt(160);

            rectangleMaker(graphics, x, y, x2, y2);
        }
    }

    public static void rectangleMaker(Graphics graphics, int x, int y, int x2, int y2) {

        Random randomColor = new Random();                  //beállítja a random RGB színeket
        int red = randomColor.nextInt(255);
        int green = randomColor.nextInt(255);
        int blue = randomColor.nextInt(255);

        graphics.setColor(new Color(red, green, blue));

        graphics.drawRect(x, y, x2, y2);
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