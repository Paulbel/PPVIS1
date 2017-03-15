package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdPage {
    JPanel panelAddRadioSelected;

    public ThirdPage() {
        panelAddRadioSelected = new JPanel();
        panelAddRadioSelected.setBorder(BorderFactory.createTitledBorder("Task 3"));
        panelAddRadioSelected.setPreferredSize(new Dimension(160, 200));
        Dimension defaultSizeForButtons = new Dimension(140, 30);
        JTextField txtField = new JTextField(10);
        JButton buttonCheckRadioButton = new JButton("Use radioButton");

        JRadioButton radioButtonFirst = new JRadioButton("First");
        radioButtonFirst.setEnabled(false);
        radioButtonFirst.setPreferredSize(defaultSizeForButtons);
        JRadioButton radioButtonSecond = new JRadioButton("Second");
        radioButtonSecond.setEnabled(false);
        radioButtonSecond.setPreferredSize(defaultSizeForButtons);
        JRadioButton radioButtonThird = new JRadioButton("Third");
        radioButtonThird.setEnabled(false);
        radioButtonThird.setPreferredSize(defaultSizeForButtons);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonFirst);
        buttonGroup.add(radioButtonSecond);
        buttonGroup.add(radioButtonThird);
        panelAddRadioSelected.add(radioButtonFirst);
        panelAddRadioSelected.add(radioButtonSecond);
        panelAddRadioSelected.add(radioButtonThird);
        panelAddRadioSelected.add(txtField);
        panelAddRadioSelected.add(buttonCheckRadioButton);
        panelAddRadioSelected.setVisible(true);
        buttonCheckRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtField.getText();
                if (radioButtonFirst.getText().equals(text)) {
                   // setRadioUnselected(radioButtonFirst);
                    radioButtonFirst.setSelected(true);
                } else if (radioButtonSecond.getText().equals(text)) {
                   // setRadioUnselected(radioButtonSecond);
                    radioButtonSecond.setSelected(true);
                } else if (radioButtonThird.getText().equals(text)) {
                   // setRadioUnselected(radioButtonThird);
                    radioButtonThird.setSelected(true);
                } else {
                    JOptionPane.showMessageDialog(panelAddRadioSelected, "There is no any radio with name " + text);
                }
            }
        });
    }


    public JPanel getPanelAddRadioSelected() {
        return panelAddRadioSelected;
    }
}
