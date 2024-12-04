package swing.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class NestedPanelExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Nested Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // Outer panel to hold inner panels
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new GridLayout(1, 2, 10, 10)); // Two columns, spacing
        outerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding around the outer panel

        // Create inner panels
        JPanel panel1 = createPanelWithTextFields("Group 1", 3);
        JPanel panel2 = createPanelWithTextFields("Group 2", 4);

        // Add inner panels to the outer panel
        outerPanel.add(panel1);
        outerPanel.add(panel2);

        // Add the outer panel to the frame
        frame.add(outerPanel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to create a panel with a specified number of text fields
    private static JPanel createPanelWithTextFields(String title, int numberOfFields) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(numberOfFields, 4, 2, 2)); // Arrange text fields in rows
        panel.setPreferredSize(new Dimension(200, 150));

        // Add a titled border
        Border border = BorderFactory.createTitledBorder(title);
        panel.setBorder(border);

        // Add text fields to the panel
        for (int i = 0; i < numberOfFields; i++) {
            JTextField textField = new JTextField();
            panel.add(textField);
        }

        return panel;
    }

}
