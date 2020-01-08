package Threads;
//E2
public class Compteur extends Thread{

    String nom;
    int maxValue;
    int i=1;

    public Compteur(String nom, int maxValue) {
        this.nom = nom;
        this.maxValue = maxValue;

    }


    public void run(){
        int r = (int) Math.random();
        try {
            sleep(r);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
