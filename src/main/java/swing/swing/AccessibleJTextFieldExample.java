package swing.swing;

import javax.swing.*;
import java.awt.*;

public class AccessibleJTextFieldExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Accessible JTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);
        // Set accessible name
        textField.getAccessibleContext().setAccessibleName("Enter your name:");
        // Set accessible description
        textField.getAccessibleContext().setAccessibleDescription("This field is for entering your name.");


        JTextField textField2 = new JTextField(20);
        // Set accessible name
        textField2.getAccessibleContext().setAccessibleName("Enter your password:");
        // Set accessible description
        textField2.getAccessibleContext().setAccessibleDescription("This field is for entering your password.");

        frame.getContentPane().add(textField, BorderLayout.NORTH);
        frame.getContentPane().add(textField2, BorderLayout.SOUTH);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
