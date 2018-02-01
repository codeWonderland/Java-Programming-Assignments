import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A button that laughs when pressed. 
 * Demonstrates a basic ActionListener
 * 
 * @author skelly
 */
public class FunnyButton2 implements ActionListener {

    // The button.  It must be a field so that we can
    // access it in the actionPerformed method 
    JButton button;
    
    // Create the GUI
    public void createAndShowGUI() {
        // Create the window
        JFrame frame = new JFrame("Funny Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        // Create the button
        button = new JButton("Push Me!");
        
        // Tell the button who is listening for it to be pressed
        button.addActionListener(this);

        // Put the button in the window
        frame.getContentPane().add(button);
        
        // Show the window
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.toFront();
    }

    // This method is automatically called every time the user presses the button
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Tee hee!");
    }

    // Create the application and show it
    public static void main(String[] args) {
        FunnyButton2 funnyButton = new FunnyButton2();
        funnyButton.createAndShowGUI();
    }
}
