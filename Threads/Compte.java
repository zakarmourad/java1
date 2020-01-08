package Threads;

import java.util.concurrent.ExecutionException;

public class Compte extends Thread {
    int valeur;
    String tr;
    Compte(int val,String t){
        valeur=val;
        tr=t;
    }
    public void run(){
        try {
            for(;;){
                valeur++;
                System.out.println(tr+" "+valeur+" ");
                sleep(100);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Compte(1,"TH1").start();
        new Compte(1,"TH2").start();
    }

}
