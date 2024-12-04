package swing.swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class TitledBorderExample extends JFrame {

    private JLabel label;
    private TitledBorder titledBorder = BorderFactory.createTitledBorder("");;
    private ResourceBundle labels;

    public TitledBorderExample() {
        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create a label
        label = new JLabel("Sample Label");

        // Create a TitledBorder
        titledBorder = BorderFactory.createTitledBorder("");
        label.setBorder(titledBorder);

        // Add the label to the frame
        add(label);

        // Set the initial locale to English
        setLocale(Locale.ENGLISH);

        // Add buttons for language switching
        JPanel buttonPanel = new JPanel();
        JButton englishButton = new JButton("English");
        JButton frenchButton = new JButton("Français");
        buttonPanel.add(englishButton);
        buttonPanel.add(frenchButton);
        add(buttonPanel, BorderLayout.SOUTH);

        englishButton.addActionListener(e -> setLocale(Locale.ENGLISH));
        frenchButton.addActionListener(e -> setLocale(Locale.CANADA_FRENCH));

        setVisible(true);
    }

    public void setLocale(Locale locale) {
        // Load the resource bundle for the given locale
        labels = ResourceBundle.getBundle("Labels", locale);

        titledBorder = BorderFactory.createTitledBorder("");
        // Update the border title
        titledBorder.setTitle(labels.getString("borderTitle"));

        // Update the label text (optional)
        label.setText(labels.getString("labelText"));

        // Refresh the UI
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new TitledBorderExample();
    }
}
