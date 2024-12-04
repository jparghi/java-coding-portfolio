package swing.swing;


import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TaxCalculatorJGoodies extends JFrame {

    public TaxCalculatorJGoodies() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Instalment amount calculation");

        // FormLayout setup
        FormLayout layout = new FormLayout(
                "right:pref, 5dlu, pref:grow",  // 3 columns
                "p, 5dlu, p, 5dlu, p, 5dlu, p, 5dlu, p, 3dlu, p, 5dlu, p, 5dlu, p, 5dlu, p, 5dlu, p, 5dlu, p"); // Many rows

        JPanel panel = new JPanel(layout);
        add(panel);

        // Components
        JLabel taxableIncomeLabel = new JLabel("Taxable income");
        JTextField taxableIncomeField = new JTextField("$275,504.00");
        taxableIncomeField.setEditable(false);

        JLabel nonRefundableTaxCreditsLabel = new JLabel("Non-refundable tax credits");
        JTextField nonRefundableTaxCreditsField = new JTextField("$2,077.00");
        nonRefundableTaxCreditsField.setEditable(false);

        JLabel instalmentDueDateLabel = new JLabel("Instalment due date");
        JTextField instalmentDueDateField = new JTextField("2020-03-15");
        instalmentDueDateField.setEditable(false);

        // ... (Similarly add labels and text fields for other values)

        // Add components to the panel using FormLayout constraints
        panel.add(taxableIncomeLabel, "1, 1, right, default");
        panel.add(taxableIncomeField, "3, 1, fill, default");
        panel.add(nonRefundableTaxCreditsLabel, "1, 3, right, default");
        panel.add(nonRefundableTaxCreditsField, "3, 3, fill, default");
        panel.add(instalmentDueDateLabel, "1, 5, right, default");
        panel.add(instalmentDueDateField, "3, 5, fill, default");

        // ... (Add other components with appropriate constraints)

        // Separators and titles
        JSeparator separator1 = new JSeparator();
        panel.add(separator1, "1, 7, 3, 1");
        JLabel payableLabel = new JLabel("A - Payable");
        payableLabel.setBorder(new TitledBorder(""));
        panel.add(payableLabel, "1, 9, 3, 1");

        // ... (Add other separators and titles)

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TaxCalculatorJGoodies());
    }
}
