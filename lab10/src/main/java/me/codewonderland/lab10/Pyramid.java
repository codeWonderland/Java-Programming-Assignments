package me.codewonderland.lab10;

import javax.swing.*;
import java.awt.*;

/**
 * Created by aliceeaster on 4/6/17.
 */
public class Pyramid extends JComponent {
    int steps = 5;
    int width = 50;
    int height = 20;
    Color color = new Color(255, 204, 102);

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(color);


        int gap = 2;

        for (int i = 0; i < steps; i++) {
            for (int j = 0; j <= i; j++) {
                g2.fillRect(j * (width + gap) + ((steps - i) * (width / 2 + gap)), i * (height + gap), width, height);
            }
        }
    }
}
