package applicationWorkWithSwing;

/**
 * Created by Sinelnikov on 15.03.2017.
 */
public class TableRunner extends Thread {
    private volatile boolean threadFinish = false;
    public void finish()		//Инициирует завершение потока
    {
        threadFinish = true;
    }
    @Override
    public void run(){

        do{
            if(!threadFinish) {
                System.out.println("lol");//Приостанавливает поток на 1 секунду
            }
            else return;
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
        }while (true);

    }
}
