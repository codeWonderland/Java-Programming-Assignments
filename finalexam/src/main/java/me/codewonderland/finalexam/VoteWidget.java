package me.codewonderland.finalexam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class VoteWidget extends JComponent {

    boolean yes = true;

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        int s = getWidth() / 6;

        if (yes) {
            g.setColor(Color.GREEN);

            int[] xPoints = { 0,   s,   19*s/8, 5*s, 6*s, 6*s, 3*s, 2*s, 0  };
            int[] yPoints = { 3*s, 3*s, 35*s/8, 0,   0,   s,   6*s, 6*s, 4*s};

            int nPoints = xPoints.length;

            g2.fillPolygon(xPoints, yPoints, nPoints);
        } else {
            g.setColor(Color.RED);

            int[] xPoints = { s, 3*s, 5*s, 6*s, 4*s, 6*s, 5*s, 3*s, s  , 0  , 2*s, 0};
            int[] yPoints = { 0, 2*s, 0  , s  , 3*s, 5*s, 6*s, 4*s, 6*s, 5*s, 3*s, s};

            int nPoints = xPoints.length;

            g2.fillPolygon(xPoints, yPoints, nPoints);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

}