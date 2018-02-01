import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// A template for making a GUI
public class TextTransformerApp {

    JTextArea textArea;

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame("Text Transformer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put the GUI here
        textArea = new JTextArea("Type in text here");
        textArea.setLineWrap(true);

        frame.getContentPane().add(textArea, BorderLayout.CENTER);

        // Size the window and show it
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        TextTransformerApp application = new TextTransformerApp();
        application.createAndShowGUI();
    }
}
