package applicationWorkWithSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sinelnikov on 28.02.2017.
 */
public class ForthPage {
    JButton checkNameInBox;
    JTextField txtFieldCheckNameInBox;
    ForthPage(){
        JFrame selectCheckBoxFrame = new JFrame("Forth task");
        selectCheckBoxFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        selectCheckBoxFrame.setLayout(new FlowLayout());
        selectCheckBoxFrame.setSize(200, 300);
        txtFieldCheckNameInBox = new JTextField(10);
        checkNameInBox = new JButton("Check and add");
        JCheckBox firstCheck  = new JCheckBox("Coffee");
        JCheckBox secondCheck = new JCheckBox("Tea");
        JCheckBox thirdCheck = new JCheckBox("Nothing");
        selectCheckBoxFrame.add(firstCheck);
        selectCheckBoxFrame.add(secondCheck);
        selectCheckBoxFrame.add(thirdCheck);
        selectCheckBoxFrame.add(checkNameInBox);
        selectCheckBoxFrame.add(txtFieldCheckNameInBox);
        selectCheckBoxFrame.setVisible(true);
        checkNameInBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameOfBox = txtFieldCheckNameInBox.getText();
                if(nameOfBox.equals(firstCheck.getText())){
                    firstCheck.setSelected(true);
                }
                else if(nameOfBox.equals(secondCheck.getText())){
                    secondCheck.setSelected(true);
                }
                else if(nameOfBox.equals(thirdCheck.getText())){
                    thirdCheck.setSelected(true);
                }
                else{
                    JOptionPane.showMessageDialog(selectCheckBoxFrame,"There is no "+nameOfBox+" here");
                }
            }
        });
    }
}
