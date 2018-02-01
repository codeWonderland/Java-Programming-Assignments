import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A simple game where the user can inflate and deflate a balloon.
 * The balloon will pop if overinflated
 * 
 * This program uses inner classes to give the two buttons different behaviors
 * 
 * @author skelly
 */
public class BalloonGame3 {

    // The button that inflates the balloon
    JButton inflateButton;

    // The button that deflates the balloon
    JButton deflateButton;
    
    // The balloon widget
    Balloon3 balloon;
    
    // Create the GUI
    public void createAndShowGUI() {
        // Create the window
        JFrame frame = new JFrame("Balloon Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        // Create the balloon
        balloon = new Balloon3();
        
        // Create the buttons
        inflateButton = new JButton("Blow up the balloon!");
        deflateButton = new JButton("Deflate the balloon!");
        
        // Give each button a different behavior by given each a different
        // action listener object        
        inflateButton.addActionListener(new InflateListener());
        deflateButton.addActionListener(new DeflateListener());
        
        // Place the components into the window
        frame.getContentPane().add(BorderLayout.CENTER, balloon);
        frame.getContentPane().add(BorderLayout.NORTH, inflateButton);
        frame.getContentPane().add(BorderLayout.SOUTH, deflateButton);

        // Show the window
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }
    
    // Create the application and show it
    public static void main(String[] args) {
        BalloonGame3 balloonGame = new BalloonGame3();
        balloonGame.createAndShowGUI();
    }
    
    // An action listener that inflates the balloon
    class InflateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            balloon.inflate();
        }
    }
    
    // An action listener that deflates the balloon
    class DeflateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            balloon.deflate();
        }
    }
    
}
