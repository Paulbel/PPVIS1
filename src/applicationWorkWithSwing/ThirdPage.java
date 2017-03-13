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
    ThirdPage(){
        panelAddRadioSelected = new JPanel();
        panelAddRadioSelected.setBorder(BorderFactory.createTitledBorder("Task 3"));
        panelAddRadioSelected.setPreferredSize(new Dimension(160,200));
        Dimension defaultSizeForButtons = new Dimension(140,30);
        JTextField txtField = new JTextField(10);
        JButton buttonCheckRadioButton = new JButton("Use radioButton");
        radioButtonFirst = new JRadioButton("First");
        radioButtonFirst.setEnabled(false);
        radioButtonFirst.setPreferredSize(defaultSizeForButtons);
        radioButtonSecond = new JRadioButton("Second");
        radioButtonSecond.setEnabled(false);
        radioButtonSecond.setPreferredSize(defaultSizeForButtons);
        radioButtonThird = new JRadioButton("Third");
        radioButtonThird.setEnabled(false);
        radioButtonThird.setPreferredSize(defaultSizeForButtons);
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
                    JOptionPane.showMessageDialog(panelAddRadioSelected, "There is no any radio with name "+text);
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
