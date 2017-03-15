package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstPage {
    private JPanel addLineToComboBoxPanel;

    public FirstPage() {
        addLineToComboBoxPanel = new JPanel();
        addLineToComboBoxPanel.setBorder(BorderFactory.createTitledBorder("Task 1"));
        addLineToComboBoxPanel.setPreferredSize(new Dimension(160, 200));
        Dimension defaultSizeForButtons = new Dimension(140,30);
        JComboBox comboBoxForEdit = new JComboBox();
        JButton buttonAddToCombo = new JButton("Add to Combo");
        comboBoxForEdit.setEditable(true);
        JTextField textField = new JTextField(13);
        buttonAddToCombo.setPreferredSize(defaultSizeForButtons);
        textField.setPreferredSize(defaultSizeForButtons);
        comboBoxForEdit.setPreferredSize(defaultSizeForButtons);
        addLineToComboBoxPanel.add(comboBoxForEdit);
        addLineToComboBoxPanel.add(textField);
        addLineToComboBoxPanel.add(buttonAddToCombo);
        addLineToComboBoxPanel.setVisible(true);
        buttonAddToCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                String item = textField.getText();
                for (i = 0; i < comboBoxForEdit.getItemCount(); i++) {
                    if (item.equals(comboBoxForEdit.getItemAt(i))) {
                        JOptionPane.showMessageDialog(addLineToComboBoxPanel, item + " is already here");
                        break;
                    }
                }
                if (i == comboBoxForEdit.getItemCount()) {
                    comboBoxForEdit.addItem(item);
                    comboBoxForEdit.setSelectedIndex(i);
                    textField.setText("");
                }
            }
        });
    }

    public JPanel getPanel() {
        return addLineToComboBoxPanel;
    }

}
