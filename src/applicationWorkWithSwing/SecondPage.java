package applicationWorkWithSwing;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by Sinelnikov on 27.02.2017.
 */
public class SecondPage{
    private JPanel panelChangeButtonText;
    
    public SecondPage(JPanel panel){
        panelChangeButtonText = panel;
        JTextField mainTextField = new JTextField(10);
        JButton buttonTextToSecondButton = new JButton("Rename second btn");
        JButton buttonChangeBtnText = new JButton("Swap names");
        panelChangeButtonText.add(buttonChangeBtnText);
        panelChangeButtonText.add(buttonTextToSecondButton);
        panelChangeButtonText.add(mainTextField);
        panelChangeButtonText.setVisible(true);

        buttonTextToSecondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = mainTextField.getText();
                buttonChangeBtnText.setText(name);
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
    public JPanel getPanel(){
        return panelChangeButtonText;
    }
}
