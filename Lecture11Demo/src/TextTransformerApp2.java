import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// A template for making a GUI
public class TextTransformerApp2 {

    JTextArea textArea;

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        JFrame frame = new JFrame("Text Transformer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put the GUI here
        textArea = new JTextArea("Type in text here");
        textArea.setLineWrap(true);
        JButton uppercase = new JButton("Uppercase");
        uppercase.setActionCommand("uppercase");
        JButton lowercase = new JButton("lowercase");
        lowercase.setActionCommand("lowercase");
        JButton piglatinify = new JButton("Pig Latin-ify");
        piglatinify.setActionCommand("piglatinify");

        uppercase.addActionListener(new TransformListener());
        lowercase.addActionListener(new TransformListener());
        piglatinify.addActionListener(new TransformListener());

        JPanel panel = new JPanel();
        panel.add(uppercase);
        panel.add(lowercase);
        panel.add(piglatinify);

        frame.getContentPane().add(textArea, BorderLayout.CENTER);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        // Size the window and show it
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    // An action listener that makes the text uppercase
    class TransformListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = textArea.getText();

            if ("uppercase".equals(e.getActionCommand())) {
                s = s.toUpperCase();
            } else if ("lowercase".equals(e.getActionCommand())) {
                s = s.toLowerCase();
            } else if ("piglatinify".equals(e.getActionCommand())) {
                s = TextUtility.pigLatinify(s);
            }

            textArea.setText(s);
        }
    }

    // Create the application and show it
    public static void main(String[] args) {
        TextTransformerApp2 application = new TextTransformerApp2();
        application.createAndShowGUI();
    }
}
