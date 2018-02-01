package me.codewonderland.lab10;

/**
 * Created by aliceeaster on 4/6/17.
 */
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A template for making a GUI
public class PyramidApp {

    Pyramid pyramid;
    JSlider slider, heightSlider, widthSlider;
    JButton button, button2;
    JFrame frame;

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put the GUI here
        pyramid = new Pyramid();
        frame.getContentPane().add(pyramid);

        slider = new JSlider(JSlider.VERTICAL, 1, 20, pyramid.steps);
        slider.addChangeListener(new StepsListener());
        frame.getContentPane().add(slider, BorderLayout.EAST);

        heightSlider = new JSlider(JSlider.VERTICAL, 20, 200, pyramid.height);
        heightSlider.addChangeListener(new HeightListener());
        frame.getContentPane().add(heightSlider, BorderLayout.WEST);

        widthSlider = new JSlider(JSlider.HORIZONTAL, 50, 500, pyramid.width);
        widthSlider.addChangeListener(new WidthListener());
        frame.getContentPane().add(widthSlider, BorderLayout.SOUTH);

        button = new JButton("Change Color");
        button.addActionListener(new ColorListener());

        button2 = new JButton("Save");

        JPanel topPanel = new JPanel();
        topPanel.add(button);
        topPanel.add(button2);

        frame.getContentPane().add(topPanel, BorderLayout.NORTH);

        // Size the window and show it
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.toFront();
    }

    class StepsListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            pyramid.steps = slider.getValue();
            pyramid.repaint();
        }
    }

    class HeightListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            pyramid.height = heightSlider.getValue();
            pyramid.repaint();
        }
    }

    class WidthListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            pyramid.width = widthSlider.getValue();
            pyramid.repaint();
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pyramid.color = JColorChooser.showDialog(frame, "Choose Color", pyramid.color);
            pyramid.repaint();
        }
    }

    // Create the application and show it
    public static void main(String[] args) {
        PyramidApp application = new PyramidApp();
        application.createAndShowGUI();
    }
}