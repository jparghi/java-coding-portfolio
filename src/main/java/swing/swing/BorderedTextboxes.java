package swing.swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BorderedTextboxes {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bordered Textboxes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10)); // 3 rows, 1 column, 10px gaps

        JPanel childPanel1 = getChildPanel1();
        JPanel childPanel2 = getChildPanel2();

        panel.add(childPanel1);
        panel.add(childPanel2);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static JPanel getChildPanel2() {
        JPanel childPanel2 = new JPanel();
        JTextField textField1 = new JTextField("Textbox 2.1");
        JTextField textField2 = new JTextField("Textbox 2.2");
        JTextField textField3 = new JTextField("Textbox 2.3");

        // Create a titled border
        TitledBorder titledBorder1 = BorderFactory.createTitledBorder("My Textboxes 2");

        // Add the border to each text field
        //textField1.setBorder(titledBorder);
        //textField2.setBorder(titledBorder);
        //textField3.setBorder(titledBorder);
        childPanel2.add(textField1);
        childPanel2.add(textField2);
        childPanel2.add(textField3);
        childPanel2.setBorder(titledBorder1);
        return childPanel2;
    }

    private static JPanel getChildPanel1() {
        JPanel childPanel1 = new JPanel();
        JTextField textField1 = new JTextField("Textbox 1.1");
        JTextField textField2 = new JTextField("Textbox 1.2");
        JTextField textField3 = new JTextField("Textbox 1.3");

        // Create a titled border
        TitledBorder titledBorder1 = BorderFactory.createTitledBorder("My Textboxes");

        // Add the border to each text field
        //textField1.setBorder(titledBorder);
        //textField2.setBorder(titledBorder);
        //textField3.setBorder(titledBorder);
        childPanel1.add(textField1);
        childPanel1.add(textField2);
        childPanel1.add(textField3);
        childPanel1.setBorder(titledBorder1);
        return childPanel1;
    }
}
