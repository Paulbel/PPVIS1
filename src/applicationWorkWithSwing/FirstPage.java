package applicationWorkWithSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstPage {
    private JPanel panelAddLineToComboBox;

    FirstPage() {
        panelAddLineToComboBox = new JPanel();
        panelAddLineToComboBox.setBorder(BorderFactory.createTitledBorder("Task 1"));
        panelAddLineToComboBox.setPreferredSize(new Dimension(160, 200));
        Dimension defaultSizeForButtons = new Dimension(140,30);
        JComboBox comboBoxForEdit = new JComboBox();
        JButton buttonAddToCombo = new JButton("Add to Combo");
        comboBoxForEdit.setEditable(true);
        JTextField textField = new JTextField(13);
        buttonAddToCombo.setPreferredSize(defaultSizeForButtons);
        textField.setPreferredSize(defaultSizeForButtons);
        comboBoxForEdit.setPreferredSize(defaultSizeForButtons);
        panelAddLineToComboBox.add(comboBoxForEdit);
        panelAddLineToComboBox.add(textField);


        panelAddLineToComboBox.add(buttonAddToCombo);
        panelAddLineToComboBox.setVisible(true);
        buttonAddToCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                String item = textField.getText();
                for (i = 0; i < comboBoxForEdit.getItemCount(); i++) {
                    if (item.equals(comboBoxForEdit.getItemAt(i))) {
                        JOptionPane.showMessageDialog(panelAddLineToComboBox, item + " is already here");
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
        return panelAddLineToComboBox;
    }

}
