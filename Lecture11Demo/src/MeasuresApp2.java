import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// A template for making a GUI
public class MeasuresApp2 {

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
        fromUnits.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fromUnits.setSelectedIndex(0);

        answer = new JLabel("= 0.00 kilograms");

        fromValue.addActionListener(new ConvertUnitsListener());
        fromUnits.addListSelectionListener(new ConvertUnitsListener());

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

    // An action listener that makes the text uppercase
    class ConvertUnitsListener implements ActionListener, ListSelectionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateText();
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            updateText();
        }

        void updateText() {
            double convert = Double.valueOf(fromValue.getText());
            String newUnit;

            if ("pounds".equals(fromUnits.getSelectedValue())) {
                convert = Measures.poundsToKilograms(convert);
                newUnit = "kilograms";
            } else if ("kilograms".equals(fromUnits.getSelectedValue())) {
                convert = Measures.kilogramsToPounds(convert);
                newUnit = "pounds";
            } else if ("miles".equals(fromUnits.getSelectedValue())) {
                convert = Measures.milesToKilometers(convert);
                newUnit = "kilometers";
            } else if ("kilometers".equals(fromUnits.getSelectedValue())) {
                convert = Measures.kilometersToMiles(convert);
                newUnit = "miles";
            } else if ("gallons".equals(fromUnits.getSelectedValue())) {
                convert = Measures.gallonsToLiters(convert);
                newUnit = "liters";
            } else {
                convert = Measures.litersToGallons(convert);
                newUnit = "gallons";
            }

            String newText = String.format(" = %.2f %s", convert, newUnit);
            answer.setText(newText);
        }
    }

    // Create the application and show it
    public static void main(String[] args) {
        MeasuresApp2 application = new MeasuresApp2();
        application.createAndShowGUI();
    }
}
