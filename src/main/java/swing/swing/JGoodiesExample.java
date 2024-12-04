package swing.swing;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;

public class JGoodiesExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JGoodies Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a FormLayout
        FormLayout layout = new FormLayout(
                "right:pref, 3dlu, pref:grow", // Column specifications
                "pref, 3dlu, pref, 3dlu, pref"); // Row specifications

        DefaultFormBuilder builder = new DefaultFormBuilder(layout);
        builder.setDefaultDialogBorder();

        // Add components to the form
        builder.append("Label:", new JLabel("Name:"));
        builder.append(new JTextField());
        builder.nextLine();

        builder.append("Label:", new JLabel("Age:"));
        builder.append(new JTextField());
        builder.nextLine();

        builder.append(new JButton("Submit"));

        frame.add(builder.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
