package applicationWorkWithSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sinelnikov on 28.02.2017.
 */
public class ThirdPage {
    JPanel panelAddRadioSelected;
    JRadioButton radioButtonFirst;
    JRadioButton radioButtonSecond;
    JRadioButton radioButtonThird;
    ThirdPage(JPanel panel){
        panelAddRadioSelected = new JPanel();
        panelAddRadioSelected = panel;
        JTextField txtField;
        txtField = new JTextField(10);
        JButton buttonCheckRadioButton;
        buttonCheckRadioButton = new JButton("Use radioButton");
        GridLayout gridLayout = new GridLayout(3,2);
        panelAddRadioSelected.setLayout(gridLayout);
        radioButtonFirst = new JRadioButton("First");
        radioButtonSecond = new JRadioButton("Second");
        radioButtonThird = new JRadioButton("Third");
        panelAddRadioSelected.add(radioButtonFirst);
        panelAddRadioSelected.add(txtField);
        panelAddRadioSelected.add(radioButtonSecond);
        panelAddRadioSelected.add(buttonCheckRadioButton);
        panelAddRadioSelected.add(radioButtonThird);


        panelAddRadioSelected.setVisible(true);
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
    public JPanel getPanelAddRadioSelected(){
        return panelAddRadioSelected;
    }
}
