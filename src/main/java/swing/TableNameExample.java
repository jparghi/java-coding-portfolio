package swing;

import javax.swing.*;
import javax.swing.table.*;

public class TableNameExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Table Name Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Sample data
    Object[][] data = {
      {"Row 1", "Data 1"},
      {"Row 2", "Data 2"}
    };
    String[] columnNames = {"Column 1", "Column 2"};

    JTable table = new JTable(data, columnNames);

    // Add an empty column
    TableColumnModel columnModel = table.getColumnModel();
    TableColumn emptyColumn = new TableColumn();
    emptyColumn.setPreferredWidth(150); // Adjust width as needed
    columnModel.addColumn(emptyColumn);
    columnModel.moveColumn(columnModel.getColumnCount() - 1, 0);

    JScrollPane scrollPane = new JScrollPane(table);
    frame.getContentPane().add(scrollPane);

    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}
