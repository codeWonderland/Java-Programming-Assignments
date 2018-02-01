import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Balloon3 extends JComponent {

    int radius = 20;
    boolean popped = false;
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);
        
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        if (!popped) {
            int x = centerX - (radius / 2);
            int y = centerY - (radius / 2);
            g2.fillOval(x, y, radius, radius);
        } else {
            String s = "Pop!";
            Font font = new Font(Font.SANS_SERIF, Font.BOLD, 32);
            g2.setFont(font);
            
            FontMetrics fm = g2.getFontMetrics();
            int x = centerX - (fm.stringWidth(s) / 2);
            int y = centerY - (fm.getHeight() / 2) + fm.getAscent();
            
            g2.drawString(s, x, y);
            
            int n = 10;
            int r1 = 50;
            int r2 = 90;
            
            for (int i = 0; i < n; i++) {
                double angle = 2 * Math.PI * i / n;

                int x1 = centerX + (int)(r1 * Math.cos(angle));
                int y1 = centerY + (int)(r1 * Math.sin(angle));
                int x2 = centerX + (int)(r2 * Math.cos(angle));
                int y2 = centerY + (int)(r2 * Math.sin(angle));
                
                g2.drawLine(x1, y1, x2, y2);
            }
        }
    }
    
    public void inflate() {
        radius = radius + 20;
        
        if (radius > 120) {
            popped = true;
        }
        
        repaint();
    }

    public void deflate() {
        radius = Math.max(radius - 20, 20);
        repaint();
    }
}
