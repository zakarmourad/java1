package Threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//E3 UML
public class EX4 extends Thread {
    private int ID;
    public List list = new ArrayList();
    public int N;


    public EX4(int i){
        this.ID=i;
    }

    public void run(){
        if (enter()){
            list.add(this.ID);
            System.out.println("La Voiture "+this.ID+" Entre");
        }
        try {
            sleep(2000);
            quitter();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean enter(){
        if ((N=list.size())<100){ N++; return true;}
        return false;
    }
    public void quitter(){
        Iterator it = list.iterator();
        while(it.hasNext()){
            int i = (int) it.next();
            if(i==this.ID)it.remove();
            N--;
            System.out.println("La Voiture "+this.ID+ " Sort");
        }
    }

    public static void main(String[] args) {

        new EX4(2).start();
        new EX4(5646).start();
        new EX4(664).start();
        new EX4(331).start();
        new EX4(31302).start();
        new EX4(334).start();
        new EX4(332).start();
        new EX4(558).start();
        new EX4(558).start();
    }

}
