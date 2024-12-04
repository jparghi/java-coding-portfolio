package swing.swing;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;

public class TextAreaWidth {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea Width Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FormLayout(
                "pref, 3dlu, fill:100dlu:grow", // Column specs
                "pref")); // Row specs

        CellConstraints cc = new CellConstraints();

        JTextArea textArea = new JTextArea(5, 20); // Initial size

        panel.add(new JLabel("Label:"), cc.xy(1, 1));
        panel.add(textArea, cc.xy(3, 1)); // Add the text area

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
