package swing.swing;

import javax.swing.*;
import java.awt.*;

public class NestedFrames extends JFrame {

    public NestedFrames() {
        setTitle("Nested Frames Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Create the desktop pane
        JDesktopPane desktopPane = new JDesktopPane();
        add(desktopPane);

        // Create internal frames
        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1", true, true, true, true);
        internalFrame1.setSize(200, 150);
        internalFrame1.setLocation(50, 50);
        internalFrame1.setVisible(true);

        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2", true, true, true, true);
        internalFrame2.setSize(200, 150);
        internalFrame2.setLocation(250, 50);
        internalFrame2.setVisible(true);

        // Add internal frames to the desktop pane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NestedFrames());
    }
}
