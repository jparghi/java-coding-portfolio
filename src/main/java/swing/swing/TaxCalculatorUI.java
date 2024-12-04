package swing.swing;

import com.jgoodies.forms.layout.FormLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TaxCalculatorUI extends JFrame {

    public TaxCalculatorUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Instalment amount calculation");

        // FormLayout setup with enough rows
        FormLayout layout = new FormLayout(
                "right:pref, 3dlu, left:pref, 3dlu, pref:grow",
                "p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, " +
                        "p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu," +
                        " p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, p");

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

        JLabel provincialTaxesLabel = new JLabel("Provincial Taxes");
        JTextField provincialTaxesField = new JTextField("$0.00");
        provincialTaxesField.setEditable(false);

        JLabel firstNationsTaxesLabel = new JLabel("First Nations taxes");
        JTextField firstNationsTaxesField = new JTextField("$0.00");
        firstNationsTaxesField.setEditable(false);

        JLabel canadaPensionPlanLabel = new JLabel("Canada Pension Plan");
        JTextField canadaPensionPlanField = new JTextField("$0.00");
        canadaPensionPlanField.setEditable(false);

        JLabel federalAmountLabel = new JLabel("Federal amount");
        JTextField federalAmountField = new JTextField("$56,631.91");
        federalAmountField.setEditable(false);

        JLabel creditsLabel = new JLabel("Credits");
        JTextField creditsField = new JTextField("$98,907.96");
        creditsField.setEditable(false);

        JLabel baseAmountLabel = new JLabel("Base amount");
        JTextField baseAmountField = new JTextField("$40,324.05");
        baseAmountField.setEditable(false);

        JLabel multiplyByLabel = new JLabel("Multiply by");
        JTextField multiplyByField = new JTextField("1/4");
        multiplyByField.setEditable(false);

        JLabel amountCalculatedLabel = new JLabel("Amount calculated");
        JTextField amountCalculatedField = new JTextField("$10,081.01");
        amountCalculatedField.setEditable(false);

        JLabel amountDueLabel = new JLabel("Amount due / remainder");
        JTextField amountDueField = new JTextField("$10,081.01");
        amountDueField.setEditable(false);

        // Add components to the panel
        panel.add(taxableIncomeLabel, "1, 1, right, default");
        panel.add(taxableIncomeField, "3, 1, fill, default");
        panel.add(nonRefundableTaxCreditsLabel, "1, 3, right, default");
        panel.add(nonRefundableTaxCreditsField, "3, 3, fill, default");
        panel.add(instalmentDueDateLabel, "1, 5, right, default");
        panel.add(instalmentDueDateField,
                "3, 5, fill, default");

        // Separators and titles
        JSeparator separator1 = new JSeparator();
        panel.add(separator1, "1, 7, 5, 1");

        JLabel payableLabel = new JLabel("A - Payable");
       // payableLabel.setBorder(new TitledBorder(""));
        panel.add(payableLabel, "1, 9, 3, 1");

        panel.add(new JLabel(""),  "2, 9");

        panel.add(provincialTaxesLabel, "3, 9, right, default");
        panel.add(provincialTaxesField, "5, 9, fill, default");
        panel.add(firstNationsTaxesLabel, "1, 13, right, default");
        panel.add(firstNationsTaxesField, "3, 13, fill, default");
        panel.add(canadaPensionPlanLabel, "1, 15, right, default");
        panel.add(canadaPensionPlanField, "3, 15, fill, default");
        panel.add(federalAmountLabel, "1, 17, right, default");
        panel.add(federalAmountField, "3, 17, fill, default");

        JSeparator separator2 = new JSeparator();
        panel.add(separator2, "1, 19, 3, 1");

        JLabel creditsSectionLabel = new JLabel("B - Credits");
        creditsSectionLabel.setBorder(new TitledBorder(""));
        panel.add(creditsSectionLabel, "1, 21, 3, 1");

        panel.add(creditsLabel, "1, 23, right, default");
        panel.add(creditsField, "3, 23, fill, default");

        JSeparator separator3 = new JSeparator();
        panel.add(separator3, "1, 25, 3, 1");

        JLabel baseSectionLabel = new JLabel("C - Base");
        baseSectionLabel.setBorder(new TitledBorder(""));
        panel.add(baseSectionLabel, "1, 27, 3, 1");

        panel.add(baseAmountLabel, "1, 29, right, default");
        panel.add(baseAmountField, "3, 29, fill, default");

        JSeparator separator4 = new JSeparator();
        panel.add(separator4, "1, 31, 3, 1");

        JLabel multiplySectionLabel = new JLabel("D - Multiply by");
        multiplySectionLabel.setBorder(new TitledBorder(""));
        panel.add(multiplySectionLabel, "1, 33, 3, 1");

        panel.add(multiplyByLabel, "1, 35, right, default");
        panel.add(multiplyByField, "3, 35, fill, default");

        JSeparator separator5 = new JSeparator();
        panel.add(separator5, "1, 37, 3, 1");

        JLabel calculationSectionLabel = new JLabel("E - Calculation results");
        calculationSectionLabel.setBorder(new TitledBorder(""));
        panel.add(calculationSectionLabel, "1, 39, 3, 1");

        panel.add(amountCalculatedLabel, "1, 41, right, default");
        panel.add(amountCalculatedField, "3, 41, fill, default");

        JSeparator separator6 = new JSeparator();
        panel.add(separator6, "1, 43, 3, 1");

        JLabel instalmentSectionLabel = new JLabel("F - Instalment amount");
        instalmentSectionLabel.setBorder(new TitledBorder(""));
        panel.add(instalmentSectionLabel, "1, 45, 3, 1");

        panel.add(amountDueLabel, "1, 47, right, default");
        panel.add(amountDueField, "3, 47, fill, default");

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TaxCalculatorUI());
    }
}
