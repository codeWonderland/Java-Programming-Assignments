import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

// A template for making a GUI
public class MeasuresApp {

    JTextField fromValue;
    JList<String> fromUnits;
    JLabel answer;

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame("Measurements");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put the GUI here
        fromValue = new JTextField("0", 5);
        

        String[] units = { "pounds", "kilograms", "miles", "kilometers", "gallons", "liters" };
        fromUnits = new JList<String>(units);

        answer = new JLabel("= 0.00 kilograms");

        JPanel panel = new JPanel();
        panel.add(fromValue);
        panel.add(fromUnits);
        panel.add(answer);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Size the window and show it
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        MeasuresApp application = new MeasuresApp();
        application.createAndShowGUI();
    }
}
