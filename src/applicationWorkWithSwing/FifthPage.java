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
    public FifthPage(JPanel panel) {
        JTextField txtToBeAdded = new JTextField(10);
        JButton buttonAddToFirstColumn = new JButton("Add text");
        JButton buttonChangeColumnsFirstSecond = new JButton("1->2");
        JButton buttonChangeColumnsSecondFirst = new JButton("2->1");
        String [] columnNames = {"First","Second"};
        JTable tableToBeChanged = new JTable(new DefaultTableModel(0,2));
        JScrollPane scrollPaneWithTable = new JScrollPane(tableToBeChanged);
        scrollPaneWithTable.setPreferredSize(new Dimension(200,100));
        panelTableChangeWithButtons = panel;
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
                DefaultTableModel model = (DefaultTableModel)  tableToBeChanged.getModel();
                model.addRow(new Object[]{txt,""});
            }
        });
        buttonChangeColumnsFirstSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtToBeAdded.getText();
                int selectedColumn = tableToBeChanged.getSelectedColumn();
                int selectedRow = tableToBeChanged.getSelectedRow();

                if(selectedColumn !=0 || tableToBeChanged.getValueAt(selectedRow,selectedColumn).equals("")){
                    JOptionPane.showMessageDialog(panelTableChangeWithButtons,"Zaebal tykat' gandon");
                }
                else {
                    tableToBeChanged.setValueAt("",selectedRow,selectedColumn);
                    tableToBeChanged.setValueAt(text,selectedRow,selectedColumn+1);
                }


            }
        });
        buttonChangeColumnsSecondFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtToBeAdded.getText();
                int selectedColumn = tableToBeChanged.getSelectedColumn();
                int selectedRow = tableToBeChanged.getSelectedRow();

                if(selectedColumn !=1 || tableToBeChanged.getValueAt(selectedRow,selectedColumn).equals("")){
                    System.out.println("gandon");
                }
                else {
                    tableToBeChanged.setValueAt("",selectedRow,selectedColumn);
                    tableToBeChanged.setValueAt(text,selectedRow,selectedColumn-1);
                }
            }
        });
    }
    public JPanel getPanelTableChangeWithButtons(){
        return panelTableChangeWithButtons;
    }
}
