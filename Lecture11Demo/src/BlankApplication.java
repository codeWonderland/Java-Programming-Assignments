import javax.swing.JFrame;

// A template for making a GUI
public class BlankApplication {

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        // Put the GUI here

        // Size the window and show it
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        BlankApplication application = new BlankApplication();
        application.createAndShowGUI();
    }
}
