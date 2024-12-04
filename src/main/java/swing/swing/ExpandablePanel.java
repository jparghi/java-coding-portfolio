package swing.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpandablePanel extends JFrame {

    private JPanel contentPanel;
    private JButton toggleButton;

    public ExpandablePanel() {
        super("Expandable Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the button to toggle visibility
        toggleButton = new JButton("Show/Hide Content");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleContentPanel();
            }
        });
        add(toggleButton, BorderLayout.NORTH);

        // Create the panel to hold the content
        contentPanel = new JPanel();
        contentPanel.add(new JLabel("This is the content panel!"));
        contentPanel.setVisible(false); // Initially hide the content
        add(contentPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void toggleContentPanel() {
        contentPanel.setVisible(!contentPanel.isVisible());
        pack(); // Resize the frame to accommodate the panel
    }

    public static void main(String[] args) {
        new ExpandablePanel();
    }
}
