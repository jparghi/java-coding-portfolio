package swing.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("This label has a fancy border!");
        Border compoundBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(1, 1, 1, 1), // Outer empty border for padding
                BorderFactory.createEtchedBorder() // Inner etched border
        );
        label.setBorder(compoundBorder);

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
