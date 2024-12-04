package swing.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout()); // Use BorderLayout for easy positioning

        // Create a JLabel with a border
        JLabel label = new JLabel("This label is on top!");
        Border compoundBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createEtchedBorder()
        );
        label.setBorder(compoundBorder);

        // Add the label to the NORTH position of the panel
        panel.add(label, BorderLayout.NORTH);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
