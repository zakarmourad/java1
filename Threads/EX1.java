package Threads;

import javax.swing.text.TableView;
//E1
public class EX1 extends Thread{

    public EX1(){}
    public void run(){
        int i;
        for (i=1;i<1000;i++) System.out.println(" "+i);
        for (i=1000;i>=1;i--) System.out.println(" "+i);

    }

    public static void main(String[] args) {
        Runnable r1 = () -> {
            int i;
            for (i=1;i<1000;i++) System.out.println(" "+i);
        };

        Runnable r2 = () -> {
            int i;
            for (i=1000;i>=1;i--) System.out.println(" "+i);
        };

        Thread TA = new Thread(r1);
        Thread TB = new Thread(r2);

        //TA.start();
        //TB.start();

        new EX1().start();


    }
}
