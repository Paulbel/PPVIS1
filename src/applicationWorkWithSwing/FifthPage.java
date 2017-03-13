package applicationWorkWithSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sinelnikov on 01.03.2017.
 */
public class FifthPage {
    private JPanel panelTableChangeWithButtons;

    public FifthPage() {
        panelTableChangeWithButtons = new JPanel();
        panelTableChangeWithButtons.setBorder(BorderFactory.createTitledBorder("Task 5"));
        panelTableChangeWithButtons.setPreferredSize(new Dimension(160, 200));
        JTextField txtToBeAdded = new JTextField(10);
        JButton buttonAddToFirstColumn = new JButton("Add text");
        buttonAddToFirstColumn.setPreferredSize(new Dimension(140, 30));
        JButton buttonChangeColumnsFirstSecond = new JButton("1->2");
        JButton buttonChangeColumnsSecondFirst = new JButton("2->1");
        String[] columnNames = {"First", "Second"};
        JTable tableToBeChanged = new JTable(new DefaultTableModel(0, 2));
        JScrollPane scrollPaneWithTable = new JScrollPane(tableToBeChanged);
        scrollPaneWithTable.setPreferredSize(new Dimension(140, 80));

        panelTableChangeWithButtons.setLayout(new FlowLayout());
        panelTableChangeWithButtons.add(txtToBeAdded);
        panelTableChangeWithButtons.add(buttonAddToFirstColumn);
        panelTableChangeWithButtons.add(buttonChangeColumnsSecondFirst);
        panelTableChangeWithButtons.add(buttonChangeColumnsFirstSecond);
        panelTableChangeWithButtons.add(scrollPaneWithTable);
        panelTableChangeWithButtons.setVisible(true);
        buttonAddToFirstColumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = txtToBeAdded.getText();
                DefaultTableModel model = (DefaultTableModel) tableToBeChanged.getModel();
                model.addRow(new Object[]{txt, ""});
                txtToBeAdded.setText("");
            }
        });
        buttonChangeColumnsFirstSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedColumn = tableToBeChanged.getSelectedColumn();
                int selectedRow = tableToBeChanged.getSelectedRow();

                if (selectedColumn != 0 || tableToBeChanged.getValueAt(selectedRow, selectedColumn).equals("")) {
                    JOptionPane.showMessageDialog(panelTableChangeWithButtons, "This column isn't the first or it's empty!");
                } else {
                    Object text = tableToBeChanged.getValueAt(selectedRow,selectedColumn);
                    tableToBeChanged.setValueAt("", selectedRow, selectedColumn);
                    tableToBeChanged.setValueAt(text, selectedRow, selectedColumn + 1);
                }


            }
        });
        buttonChangeColumnsSecondFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedColumn = tableToBeChanged.getSelectedColumn();
                int selectedRow = tableToBeChanged.getSelectedRow();

                if (selectedColumn != 1 || tableToBeChanged.getValueAt(selectedRow, selectedColumn).equals("")) {
                    JOptionPane.showMessageDialog(panelTableChangeWithButtons, "This column isn't the second or it's empty!");
                } else {
                    Object text = tableToBeChanged.getValueAt(selectedRow,selectedColumn);
                    tableToBeChanged.setValueAt("", selectedRow, selectedColumn);
                    tableToBeChanged.setValueAt(text, selectedRow, selectedColumn - 1);
                }
            }
        });
    }

    public JPanel getPanelTableChangeWithButtons() {
        return panelTableChangeWithButtons;
    }
}
