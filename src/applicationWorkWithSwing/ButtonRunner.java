package applicationWorkWithSwing;

import javax.swing.*;

/**
 * Created by Sinelnikov on 15.03.2017.
 */
public class ButtonRunner extends Thread {
    private JButton buttonForRunner;
    String firstPart;
    String secondPart;
    private volatile boolean threadFinish = false;
    public void finish()		//Инициирует завершение потока
    {
        threadFinish = true;
    }
    @Override
    public void run(){

        do{
            if(!threadFinish) {
                String strTempFirst = new String(firstPart.substring(firstPart.length()-1));
                String strTempSecond = new String(secondPart.substring(secondPart.length()-1));
            }
            else return;
            try {
                sleep(200);
            }
            catch (InterruptedException e) {}

        }while (true);

    }
    public ButtonRunner(JButton button){
        buttonForRunner = button;
        firstPart = buttonForRunner.getText();
        secondPart = new String("     ");

    }
}
