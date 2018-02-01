import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A simple game where the user can inflate a balloon
 * 
 * @author skelly
 */
public class BalloonGame2 implements ActionListener {

    // A button that inflates the balloon
    JButton button;
    
    // A component that draws a balloon
    Balloon2 balloon;
    
    // Create the GUI
    public void createAndShowGUI() {
        // Create the window
        JFrame frame = new JFrame("Balloon Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        // Create our custom balloon widget
        balloon = new Balloon2();
        
        // Create the button, and tell what to call when pressed
        button = new JButton("Blow up the balloon!");
        button.addActionListener(this);
        
        // Put the balloon in the middle of the window
        frame.getContentPane().add(BorderLayout.CENTER, balloon);
        
        // Put the balloon at the bottom of the window
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        // Show the window
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }
    
    // This method is automatically called every time the user presses the button
    @Override
    public void actionPerformed(ActionEvent e) {
        // Run the custom inflate method on the balloon
        balloon.inflate();
    }
    
    // Create the application and show it
    public static void main(String[] args) {
        BalloonGame2 balloonGame = new BalloonGame2();
        balloonGame.createAndShowGUI();
    }
}
