package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ForthPage {
    private JPanel selectCheckBoxPane;

    public ForthPage() {
        JTextField txtFieldCheckNameInBox;
        selectCheckBoxPane = new JPanel();
        selectCheckBoxPane.setBorder(BorderFactory.createTitledBorder("Task 4"));
        selectCheckBoxPane.setPreferredSize(new Dimension(160, 200));
        Dimension defaultSizeForButtons = new Dimension(140, 30);
        selectCheckBoxPane.setLayout(new FlowLayout());
        selectCheckBoxPane.setSize(200, 300);
        txtFieldCheckNameInBox = new JTextField(10);
        JButton checkNameInBox = new JButton("Check and use");
        JCheckBox firstCheck = new JCheckBox("Coffee");
        firstCheck.setPreferredSize(defaultSizeForButtons);
        firstCheck.setEnabled(false);
        JCheckBox secondCheck = new JCheckBox("Tea");
        secondCheck.setPreferredSize(defaultSizeForButtons);
        secondCheck.setEnabled(false);
        JCheckBox thirdCheck = new JCheckBox("Nothing");
        thirdCheck.setPreferredSize(defaultSizeForButtons);
        thirdCheck.setEnabled(false);
        selectCheckBoxPane.add(firstCheck);
        selectCheckBoxPane.add(secondCheck);
        selectCheckBoxPane.add(thirdCheck);
        selectCheckBoxPane.add(txtFieldCheckNameInBox);
        selectCheckBoxPane.add(checkNameInBox);
        selectCheckBoxPane.setVisible(true);
        checkNameInBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameOfBox = txtFieldCheckNameInBox.getText();
                if (nameOfBox.equals(firstCheck.getText())) {
                    if (firstCheck.isSelected()) {
                        firstCheck.setSelected(false);
                    } else firstCheck.setSelected(true);
                } else if (nameOfBox.equals(secondCheck.getText())) {
                    if (secondCheck.isSelected()) {
                        secondCheck.setSelected(false);
                    } else secondCheck.setSelected(true);
                } else if (nameOfBox.equals(thirdCheck.getText())) {
                    if (thirdCheck.isSelected()) {
                        thirdCheck.setSelected(false);
                    } else thirdCheck.setSelected(true);
                } else {
                    JOptionPane.showMessageDialog(selectCheckBoxPane, "There is no " + nameOfBox + " here");
                }
                txtFieldCheckNameInBox.setText("");
            }
        });
    }

    public JPanel getSelectCheckBoxPane() {
        return selectCheckBoxPane;
    }
}
