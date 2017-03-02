package applicationWorkWithSwing;

import javax.swing.*;
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
        JButton buttonChangeColumnsSecondFirst = new JButton();
        JTable tableToBeChanged = new JTable(4, 2);
        panelTableChangeWithButtons = panel;
        JLabel lol = new JLabel("LOL");
        panelTableChangeWithButtons.add(txtToBeAdded);
        panelTableChangeWithButtons.add(lol);
        panelTableChangeWithButtons.add(buttonAddToFirstColumn);
        panelTableChangeWithButtons.add(buttonChangeColumnsFirstSecond);
        panelTableChangeWithButtons.add(tableToBeChanged);
        panelTableChangeWithButtons.setVisible(true);
        buttonAddToFirstColumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = txtToBeAdded.getText();
                tableToBeChanged.setValueAt(txt, 0, 0);
            }
        });
        buttonChangeColumnsFirstSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int rowNumber = 0; rowNumber < tableToBeChanged.getRowCount(); rowNumber++) {
                    if (tableToBeChanged.isRowSelected(rowNumber)) {
                        tableToBeChanged.setValueAt(tableToBeChanged.getValueAt(rowNumber, 0), rowNumber, 1);
                        tableToBeChanged.setValueAt("", rowNumber, 0);
                    }
                }
            }
        });
    }
    public JPanel getPanelTableChangeWithButtons(){
        return panelTableChangeWithButtons;
    }
}
