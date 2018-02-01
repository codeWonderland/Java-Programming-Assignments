import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FunnyButton3 implements ActionListener {

    // The button that laughs
    JButton button;
    
    // A preset list of phrases
    String[] phrases = {"Tee hee!", "Oh, dear!", "Wow!", "(giggle)", "HA!"};
    
    // Create the GUI
    public void createAndShowGUI() {
        // Create the window
        JFrame frame = new JFrame("Funny Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        // Create the button
        button = new JButton("Push Me!");
        
        // Tell the button who is listening for it to be pressed
        button.addActionListener(this);

        // Put the button into the window
        frame.getContentPane().add(button);
        
        // Show the window
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // This method is automatically called every time the user presses the button
    @Override
    public void actionPerformed(ActionEvent e) {
        // Choose a random phrase and set the button text to that
        int n = (int)(Math.random() * phrases.length);
        button.setText(phrases[n]);
    }

    // Create the application and show it
    public static void main(String[] args) {
        FunnyButton3 funnyButton = new FunnyButton3();
        funnyButton.createAndShowGUI();
    }
}
