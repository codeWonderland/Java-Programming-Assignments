import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A simple button that does nothing
 * 
 * @author skelly
 */
public class FunnyButton1 {

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame("Funny Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        // Create the button
        JButton button = new JButton("Push Me!");

        // Put the button into the window
        frame.getContentPane().add(button);
        
        // Size the window and show it
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        FunnyButton1 funnyButton = new FunnyButton1();
        funnyButton.createAndShowGUI();
    }

}
