package applicationWorkWithSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by Sinelnikov on 25.02.2017.
 */
public class FirstPage
{
    private JPanel panelAddLineToComboBox;
    FirstPage(JPanel panel)
    {
        JTextField jtf;
        JComboBox comboBoxForEdit;
        JButton buttonAddToCombo;
        panelAddLineToComboBox = panel;
    //    JPanel panelAddLineToComboBox = new JPanel();
    //    panelAddLineToComboBox.getContentPane().setLayout(new FlowLayout());
      //  panelAddLineToComboBox.setSize(300,400);
    //    panelAddLineToComboBox.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        comboBoxForEdit = new JComboBox();
        buttonAddToCombo = new JButton("Add to Combo");
        comboBoxForEdit.setEditable(true);
        jtf= new JTextField(10);
        panelAddLineToComboBox.add(jtf);
        panelAddLineToComboBox.add(comboBoxForEdit);
        panelAddLineToComboBox.add(buttonAddToCombo);
        panelAddLineToComboBox.setVisible(true);
        buttonAddToCombo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i=0;
                String item = jtf.getText();
                for(i = 0; i < comboBoxForEdit.getItemCount();i++)
                {
                    if(item.equals(comboBoxForEdit.getItemAt(i))) {
                        JOptionPane.showMessageDialog(panelAddLineToComboBox, item+" is already here");
                        break;
                    }
                }
                if(i==comboBoxForEdit.getItemCount())
                {
                    comboBoxForEdit.addItem(item);
                    comboBoxForEdit.setSelectedIndex(i);
                }
            }
        });
    }
    public JPanel getPanel(){
        return panelAddLineToComboBox;
    }

}
