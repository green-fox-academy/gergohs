import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        
        upperLines(graphics);
        bottomLines(graphics);

    }

    private static void upperLines(Graphics graphics) {
        int startX = 40;
        int startY = 5;
        int endX = 300;
        int endY = 20;

        for (int i = 0; i < 13; i++) {

            graphics.setColor(new Color(70, 11, 68));

            graphics.drawLine(startX, startY, endX, endY);
            startX = startX + 20;
            endY = endY + 20;
        }
    }

    private static void bottomLines(Graphics graphics) {
        int startX = 5;
        int startY = 40;
        int endX = 20;
        int endY = 300;

        for (int i = 0; i < 13; i++) {

            graphics.setColor(new Color(19, 88, 13));

            graphics.drawLine(startX, startY, endX, endY);
            startY = startY + 20;
            endX = endX + 20;

        }
    }

    //****************************************************************************************************************
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
