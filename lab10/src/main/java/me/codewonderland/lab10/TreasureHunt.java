package me.codewonderland.lab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A template for making a GUI
public class TreasureHunt {

    int numLayers = 16;
    int treasureLoc = (int)(Math.random() * (numLayers * numLayers));

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Put the GUI here
        frame.getContentPane().setLayout(new GridLayout(numLayers, numLayers));

        for(int i = 0; i < (numLayers * numLayers); i++) {
            JButton button = new JButton();

            if (i == treasureLoc) {
                button.addActionListener(new TreasureListener());
            } else {
                button.addActionListener(new EmptyListener(i ));
            }

            frame.getContentPane().add(button);
        }

        // Size the window and show it
        frame.setSize(numLayers * 66, numLayers * 66);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        TreasureHunt application = new TreasureHunt();
        application.createAndShowGUI();
    }

    class EmptyListener implements ActionListener {
        String textValue = "";

        EmptyListener(int choiceLoc) {
            int choiceX = choiceLoc % numLayers;
            int choiceY = choiceLoc / numLayers;
            int treasureX = treasureLoc % numLayers;
            int treasureY = treasureLoc / numLayers;

            int xDiff = Math.abs(choiceX - treasureX);
            int yDiff = Math.abs(choiceY - treasureY);

            if(xDiff < yDiff) {
                textValue = Integer.toString(xDiff);
            } else {
                textValue = Integer.toString(yDiff);
            }

        }
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            button.setForeground(Color.red);
            button.setText(textValue);
        }

    }

    class TreasureListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)e.getSource();
            button.setForeground(Color.green);
            button.setText("$$$");
        }

    }


}