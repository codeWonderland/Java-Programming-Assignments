package me.codewonderland.lab11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by aliceeaster on 4/13/17.
 */
@SuppressWarnings("Serial")
public class TicTacToeCell extends JButton {
    int mark = 0, row, column;

    TicTacToeCell(int x, int y) {
        row = x;
        column = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(0, 0, 0));
        int radius = getWidth() - 10;

        if(mark == 1) {
            g2.drawString("X", (getWidth() / 2), (getHeight() / 2));
        } else if(mark == 2) {
            int centerX = (getWidth() / 2) - (radius / 2);
            int centerY = (getHeight() / 2) - (radius / 2);

            g2.fillOval(centerX, centerY, radius, radius);
        }
    }
}
