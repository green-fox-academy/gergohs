import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        int x = 10;
        int y = 10;
        int a = 10;

        for (int i = 0; i < 6; i++) {
            rectDrawer(graphics, x, y, a);
            x += a;
            y += a;
            a = a + 10;
        }
    }

    public static void rectDrawer(Graphics graphics, int x, int y, int a) {
        graphics.setColor(new Color(152, 0, 173));
        graphics.fillRect(x, y, a, a);
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