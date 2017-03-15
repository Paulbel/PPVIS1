package applicationWorkWithSwing;

import javax.swing.*;

/**
 * Created by Sinelnikov on 15.03.2017.
 */
public class TableRunner extends Thread {
    private JTable tableToRun;
    @Override
    public void run(){

        do{
            if(!Thread.interrupted()) {

                int columnNumber = tableToRun.getColumnCount()-1;
                int rowNumber = tableToRun.getRowCount()-1;
                Object objectLastElem, objectFirstElem;
                objectLastElem = tableToRun.getValueAt(rowNumber, columnNumber);
                if(rowNumber%2==0){
                    objectFirstElem = tableToRun.getValueAt(rowNumber,columnNumber);
                }
                else{
                    objectFirstElem = tableToRun.getValueAt(rowNumber,0);
                }
                for(int rowCounter = 0; rowCounter <= rowNumber; rowCounter++){
                    if(rowCounter%2==0) {
                        objectLastElem = tableToRun.getValueAt(rowCounter, columnNumber);
                        for (int columnCounter = columnNumber; columnCounter >0; columnCounter--) {
                            tableToRun.setValueAt(tableToRun.getValueAt(rowCounter,columnCounter-1), rowCounter, columnCounter);
                        }
                        tableToRun.setValueAt(objectFirstElem, rowCounter, 0);
                    }
                    else{
                        objectFirstElem = tableToRun.getValueAt(rowCounter, 0);
                        for (int columnCounter = 0; columnCounter < columnNumber; columnCounter++) {
                            tableToRun.setValueAt(tableToRun.getValueAt(rowCounter,columnCounter+1), rowCounter, columnCounter);
                        }
                        tableToRun.setValueAt(objectLastElem, rowCounter, columnNumber);
                    }
                }
                try {
                    sleep(200);
                }
                catch (InterruptedException e) {
                    return;
                }
            }
            else return;


        }while (true);

    }
    public TableRunner(JTable panel){
        tableToRun = panel;
    }
}
