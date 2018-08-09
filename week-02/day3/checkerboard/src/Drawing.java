import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int x = 30;
        int y = 30;
        int a = 30;

            for (int j = 0; j < 4; j++) {
                drawOddLines(graphics, x, y, a);
                drawEvenLines(graphics, x, y, a);
                y += 2*a;
            }
        }


    public static void drawOddLines(Graphics graphics, int x, int y, int a) {

        for (int j = 0; j < 4; j++) {
            graphics.setColor(Color.black);
            graphics.fillRect(x, y, a, a);

            graphics.setColor(Color.red);
            graphics.fillRect(x + a, y, a, a);
            x = x + 2 * a;
        }
    }

    public static void drawEvenLines(Graphics graphics, int x, int y, int a) {
        for (int j = 0; j < 4; j++) {
            graphics.setColor(Color.red);
            graphics.fillRect(x, y + a, a, a);

            graphics.setColor(Color.black);
            graphics.fillRect(x + a, y + a, a, a);
            x = x + 2 * a;
        }
    }


    //************************************************************************************************************
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
