package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SecondPage {
    private JPanel panelChangeButtonText;

    public SecondPage() {
        panelChangeButtonText = new JPanel();
        panelChangeButtonText.setBorder(BorderFactory.createTitledBorder("Task 2"));
        panelChangeButtonText.setPreferredSize(new Dimension(160, 200));
        Dimension defaultSizeForButtons = new Dimension(140,30);
        JTextField mainTextField = new JTextField(13);
        JButton buttonTextToSecondButton = new JButton("Rename second btn");
        JButton buttonChangeBtnText = new JButton("Swap names");
        mainTextField.setPreferredSize(defaultSizeForButtons);
        buttonTextToSecondButton.setPreferredSize(defaultSizeForButtons);
        buttonChangeBtnText.setPreferredSize(defaultSizeForButtons);
        panelChangeButtonText.add(buttonChangeBtnText);
        panelChangeButtonText.add(buttonTextToSecondButton);
        panelChangeButtonText.add(mainTextField);
        panelChangeButtonText.setVisible(true);
        buttonTextToSecondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = mainTextField.getText();
                buttonChangeBtnText.setText(name);
                mainTextField.setText("");
            }
        });
        buttonChangeBtnText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String saveTempName = buttonTextToSecondButton.getText();
                buttonTextToSecondButton.setText(buttonChangeBtnText.getText());
                buttonChangeBtnText.setText(saveTempName);
            }
        });
    }

    public JPanel getPanel() {
        return panelChangeButtonText;
    }
}
