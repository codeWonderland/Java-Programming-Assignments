import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A template for making a GUI
public class BlankApplication{

    JButton deflateButton, inflateButton;
    Balloon balloon;
    final String[] phrases = {"Tee hee!", "Oh, dear!", "Wow!", "(giggle)", "HA!"};

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        // Put the GUI here
        /*JButton buttonC = new JButton("Push Me!");
        frame.getContentPane().add(BorderLayout.CENTER, buttonC);

        JButton buttonW = new JButton("Push Me!");
        frame.getContentPane().add(BorderLayout.WEST, buttonW);

        JButton buttonE = new JButton("Push Me!");
        frame.getContentPane().add(BorderLayout.EAST, buttonE);
        */


        deflateButton = new JButton("Deflate");
        inflateButton = new JButton("Inflate");
        balloon = new Balloon();
        deflateButton.addActionListener(new DeflateListener());
        inflateButton.addActionListener(new InflateListener());

        frame.getContentPane().add(BorderLayout.SOUTH, deflateButton);

        frame.getContentPane().add(BorderLayout.NORTH, inflateButton);
        frame.getContentPane().add(BorderLayout.CENTER, balloon);

        // Size the window and show it
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.toFront();
    }

    class InflateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            balloon.inflateBalloon();
        }
    }

    class DeflateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            balloon.deflateBalloon();
        }
    }

    // Create the application and show it
    public static void main(String[] args) {
        BlankApplication application = new BlankApplication();
        application.createAndShowGUI();
    }
}
