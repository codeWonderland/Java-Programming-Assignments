package me.codewonderland.finalexam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A template for making a GUI
public class SurveyApp {

    JButton yesButton, noButton;
    JFrame frame;
    VoteWidget widget;

    // Create the GUI
    private void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Is pie delicious?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ------------------
        // Write this code
        // ------------------
        yesButton = new JButton("yes");
        yesButton.addActionListener(new yesButtonListener());
        noButton = new JButton("no");
        noButton.addActionListener(new noButtonListener());

        JPanel panel = new JPanel();

        panel.add(yesButton);
        panel.add(noButton);

        widget = new VoteWidget();

        frame.getContentPane().add(widget, BorderLayout.CENTER);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    // Create the application and show it
    public static void main(String[] args) {
        SurveyApp application = new SurveyApp();
        application.createAndShowGUI();
    }

    class yesButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            widget.yes = true;
            widget.repaint();
        }
    }

    class noButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            widget.yes = false;
            widget.repaint();
        }
    }
}