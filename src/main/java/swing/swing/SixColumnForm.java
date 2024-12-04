package swing.swing;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

public class SixColumnForm {

public static void main(String[] args) {
        JFrame frame = new JFrame("JGoodies FormLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with FormLayout
        JPanel panel = new JPanel(new FormLayout(
        "right:pref, 3dlu, pref, 3dlu, pref, 3dlu, pref, 3dlu, pref, 3dlu, pref", // 6 columns
        "p, 3dlu, p, 3dlu, p")); // 3 rows

        CellConstraints cc = new CellConstraints();

        // Add labels and text fields
        panel.add(new JLabel("Label 1:"), cc.xy(1, 1));
        panel.add(new JTextField(10), cc.xy(3, 1));
        panel.add(new JLabel("Label 2:"), cc.xy(5, 1));
        panel.add(new JTextField(10), cc.xy(7, 1));
        panel.add(new JLabel("Label 3:"), cc.xy(9, 1));
        panel.add(new JTextField(10), cc.xy(11, 1));

        panel.add(new JLabel("Label 4:"), cc.xy(1, 3));
        panel.add(new JTextField(10), cc.xy(3, 3));
        panel.add(new JLabel("Label 5:"), cc.xy(5, 3));
        panel.add(new JTextField(10), cc.xy(7, 3));
        panel.add(new JLabel("Label 6:"), cc.xy(9, 3));
        panel.add(new JTextField(10), cc.xy(11, 3));

        // Add a button
        panel.add(new JButton("Submit"), cc.xyw(1, 5, 11, "center, default"));

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        }
        }
