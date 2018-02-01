package me.codewonderland.lab11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by aliceeaster on 4/13/17.
 */
public class LayoutPractice {

    JTextArea textArea;
    JButton sendButton, cancelButton;
    JLabel label;

    public void createAndShowGUI() {
        //Creating Frame
        JFrame frame = new JFrame("Java Instant Messenger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adding GUI
        label = new JLabel("Send a message:");

        textArea = new JTextArea("Type message here...");
        textArea.setLineWrap(true);

        sendButton = new JButton("Send");
        cancelButton = new JButton("Cancel");

        JPanel panel = new JPanel();
        panel.add(sendButton);
        panel.add(cancelButton);

        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(textArea, BorderLayout.CENTER);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        // Size the window and show it
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // Create the application and show it
    public static void main(String[] args) {
        LayoutPractice application = new LayoutPractice();
        application.createAndShowGUI();
    }
}
