package swing.swing;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.*;

public class LeftTopAlignedPanel extends JFrame {

    public LeftTopAlignedPanel() {
        // Set up the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Label on Top Left");
        setSize(400, 300);

        // Create a JPanel with FormLayout (Corrected column and row specs)
        FormLayout layout = new FormLayout(
                new ColumnSpec[] {
                        FormFactory.PREF_COLSPEC,
                        FormFactory.RELATED_GAP_COLSPEC,
                        ColumnSpec.decode("default:grow") // Use default:grow
                },
                new RowSpec[] {
                        FormFactory.PREF_ROWSPEC,
                        FormFactory.RELATED_GAP_ROWSPEC,
                        RowSpec.decode("default:grow") // Use default:grow
                });
        JPanel panel = new JPanel(layout);
        panel.setBorder(BorderFactory.createTitledBorder("test..."));
        add(panel);

        // Create the label
        JLabel topLeftLabel = new JLabel("Top Left Label");

        // Add the label to the top-left corner
        panel.add(topLeftLabel, "1, 1, left, top"); // Left-aligned and top-aligned

        // Add other components to the panel as needed
        // ...

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LeftTopAlignedPanel());
    }
}
