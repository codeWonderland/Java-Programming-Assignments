import javax.swing.JFrame;

/**
 * A demostration of making custom widgets in Swing
 * 
 * @author skelly
 */
public class BalloonGame1 {

    // Create the GUI
    public void createAndShowGUI() {
        // Create the window
        JFrame frame = new JFrame("Balloon Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        // Create our custom balloon widget
        Balloon1 balloon = new Balloon1();

        // Place the balloon widget in the window
        frame.getContentPane().add(balloon);

        // Show the window
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        BalloonGame1 balloonGame = new BalloonGame1();
        balloonGame.createAndShowGUI();
    }
}
