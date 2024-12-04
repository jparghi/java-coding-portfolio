package swing.swing;

import javax.swing.*;
import java.awt.*;

public class TaxCalculatorUI_V1 extends JFrame {

    public TaxCalculatorUI_V1() {
        setTitle("Instalment Amount Calculation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1)); // 7 rows, 1 column

        // Taxable Income
        JPanel taxableIncomePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        taxableIncomePanel.add(new JLabel("Taxable Income:"));
        JTextField taxableIncomeField = new JTextField(10);
        taxableIncomePanel.add(taxableIncomeField);
        add(taxableIncomePanel);

        // Non-refundable Tax Credits
        JPanel taxCreditsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        taxCreditsPanel.add(new JLabel("Non-refundable Tax Credits:"));
        JTextField taxCreditsField = new JTextField(10);
        taxCreditsPanel.add(taxCreditsField);
        add(taxCreditsPanel);

        // Instalment Due Date
        JPanel dueDatePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dueDatePanel.add(new JLabel("Instalment Due Date:"));
        JTextField dueDateField = new JTextField(10);
        dueDatePanel.add(dueDateField);
        add(dueDatePanel);

        // A - Payable
        JPanel payablePanel = new JPanel(new GridLayout(4, 4));
        payablePanel.setLayout(new BoxLayout(payablePanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement
        payablePanel.setBorder(BorderFactory.createTitledBorder("A - Payable")); // Add titled border

        payablePanel.add(new JLabel("Provincial Taxes:"));
        JTextField provincialTaxesField = new JTextField(10);
        payablePanel.add(provincialTaxesField);
        payablePanel.add(new JLabel("First Nations Taxes:"));
        JTextField firstNationsTaxesField = new JTextField(10);
        payablePanel.add(firstNationsTaxesField);
        payablePanel.add(new JLabel("Canada Pension Plan:"));
        JTextField cppField = new JTextField(10);
        payablePanel.add(cppField);
        payablePanel.add(new JLabel("Federal Amount:"));
        JTextField federalAmountField = new JTextField(10);
        payablePanel.add(federalAmountField);
        add(payablePanel);

        // B - Credits
        JPanel creditsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        creditsPanel.add(new JLabel("Credits:"));
        JTextField creditsField = new JTextField(10);
        creditsPanel.add(creditsField);
        add(creditsPanel);

        // C - Base
        JPanel basePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        basePanel.add(new JLabel("Base Amount:"));
        JTextField baseAmountField = new JTextField(10);
        basePanel.add(baseAmountField);
        add(basePanel);

        // D - Multiply by
        JPanel multiplyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        multiplyPanel.add(new JLabel("Multiply by:"));
        JTextField multiplyField = new JTextField(10);
        multiplyField.setText("1/4"); // Default value
        multiplyField.setEditable(false); // Non-editable
        multiplyPanel.add(multiplyField);
        add(multiplyPanel);

        // E - Calculation Results
        JPanel calculationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        calculationPanel.add(new JLabel("Amount Calculated:"));
        JTextField calculatedAmountField = new JTextField(10);
        calculatedAmountField.setEditable(false);
        calculationPanel.add(calculatedAmountField);
        add(calculationPanel);

        // F - Instalment Amount
        JPanel instalmentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        instalmentPanel.add(new JLabel("Amount Due on Reminder:"));
        JTextField instalmentAmountField = new JTextField(10);
        instalmentAmountField.setEditable(false);
        instalmentPanel.add(instalmentAmountField);
        add(instalmentPanel);

        // Calculate Button
        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);

        // Calculate Button Action Listener
        calculateButton.addActionListener(e -> {
            try {
                // Get input values (add error handling for parsing)
                double taxableIncome = Double.parseDouble(taxableIncomeField.getText());
                double taxCredits = Double.parseDouble(taxCreditsField.getText());
                // ... get other values similarly

                // Perform calculations
                // ... (Your calculation logic here)

                // Update result fields
                calculatedAmountField.setText(String.format("%.2f", "5.223"));
                instalmentAmountField.setText(String.format("%.2f", "5.35"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        pack();
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TaxCalculatorUI_V1::new);
    }
}
