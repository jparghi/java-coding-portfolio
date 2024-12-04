package swing.swing;

import javax.swing.*;

public class SwingUtility {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InstalmentAmountCalculation());
    }

}
