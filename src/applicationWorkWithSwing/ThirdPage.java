package applicationWorkWithSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sinelnikov on 28.02.2017.
 */
public class ThirdPage {

    JRadioButton radioButtonFirst;
    JRadioButton radioButtonSecond;
    JRadioButton radioButtonThird;
    ThirdPage(JPanel panel){
        JTextField txtField;
        txtField = new JTextField(10);
        JButton buttonCheckRadioButton;
        buttonCheckRadioButton = new JButton("Use radioButton");
        panel.setSize(200,300);
        panel.setLayout(new FlowLayout());
        radioButtonFirst = new JRadioButton("First");
        radioButtonSecond = new JRadioButton("Second");
        radioButtonThird = new JRadioButton("Third");
        panel.add(radioButtonFirst);
        panel.add(radioButtonSecond);
        panel.add(radioButtonThird);
        panel.add(buttonCheckRadioButton);
        panel.add(txtField);
        panel.setVisible(true);
        buttonCheckRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtField.getText();
                if(radioButtonFirst.getText().equals(text)){
                    setRadioUnselected(radioButtonFirst);
                    radioButtonFirst.setText(text);
                }
                else if(radioButtonSecond.getText().equals(text)){
                    setRadioUnselected(radioButtonSecond);
                    radioButtonSecond.setText(text);
                }
                else if(radioButtonThird.getText().equals(text)){
                    setRadioUnselected(radioButtonThird);
                    radioButtonThird.setText(text);
                }
                else {
                    JOptionPane.showMessageDialog(panel, "There is no any radio with name "+text);
                }
            }
        });
    }
    private void setRadioUnselected(JRadioButton selectedButton){
        radioButtonFirst.setSelected(false);
        radioButtonSecond.setSelected(false);
        radioButtonThird.setSelected(false);
        selectedButton.setSelected(true);
    }
}
