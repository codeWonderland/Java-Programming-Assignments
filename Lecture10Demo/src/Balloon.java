import javax.swing.*;
import java.awt.*;

/**
 * Created by aliceeaster on 4/4/17.
 */
public class Balloon extends JComponent {

    int radius = 20;
    boolean popped = false;

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        int centerX = (getWidth() / 2)  - (radius / 2);
        int centerY = (getHeight() / 2)  - (radius / 2);

        g2.setColor(new Color(255, 0, 0));

        g2.fillOval(centerX, centerY, radius, radius);
    }

    public void inflateBalloon() {
        radius += 20;

        if(radius >= 120) {
            popped = true;
        }

        repaint();
    }

    public void deflateBalloon() {
        if(radius > 20) {
            radius -= 20;
        }
        repaint();
    }
}
