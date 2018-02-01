import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Balloon2 extends JComponent {

    int radius = 20;
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);
        g2.fillOval(100, 100, radius, radius);
    }
    
    public void inflate() {
        radius = radius + 20;
        repaint();
    }
}
