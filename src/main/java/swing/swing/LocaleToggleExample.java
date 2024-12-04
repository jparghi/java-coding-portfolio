package swing.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class LocaleToggleExample {

    private static Locale currentLocale = Locale.getDefault(); // Store the current locale

    public static void main(String[] args) {
        JFrame frame = new JFrame("Locale Toggle Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton toggleButton = new JButton("Toggle Language");
        toggleButton.addActionListener(e -> {
            // Toggle between English and French locales
            if (currentLocale.getLanguage().equals("en")) {
                currentLocale = new Locale("fr", "FR");
            } else {
                currentLocale = new Locale("en", "US");
            }

            Locale.setDefault(currentLocale);

            // Update the button text
            toggleButton.setText(currentLocale.getLanguage().equals("en") ? "Toggle Language" : "Changer la langue");

            // Revalidate and repaint the panel
            panel.revalidate();
            panel.repaint();
        });
        panel.add(toggleButton);

        frame.add(panel);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
