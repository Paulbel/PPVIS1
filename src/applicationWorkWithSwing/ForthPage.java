package applicationWorkWithSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sinelnikov on 28.02.2017.
 */
public class ForthPage {
    JPanel panelSelectCheckBox;
    JButton checkNameInBox;
    JTextField txtFieldCheckNameInBox;
    ForthPage(JPanel panel){
        panelSelectCheckBox = panel;
        panelSelectCheckBox.setLayout(new FlowLayout());
        panelSelectCheckBox.setSize(200, 300);
        txtFieldCheckNameInBox = new JTextField(10);
        checkNameInBox = new JButton("Check and add");
        JCheckBox firstCheck  = new JCheckBox("Coffee");
        JCheckBox secondCheck = new JCheckBox("Tea");
        JCheckBox thirdCheck = new JCheckBox("Nothing");
        panelSelectCheckBox.add(firstCheck);
        panelSelectCheckBox.add(secondCheck);
        panelSelectCheckBox.add(thirdCheck);
        panelSelectCheckBox.add(checkNameInBox);
        panelSelectCheckBox.add(txtFieldCheckNameInBox);
        panelSelectCheckBox.setVisible(true);
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
                    JOptionPane.showMessageDialog(panelSelectCheckBox,"There is no "+nameOfBox+" here");
                }
            }
        });
    }
    public JPanel getPanelSelectCheckBox(){
        return panelSelectCheckBox;
    }
}
