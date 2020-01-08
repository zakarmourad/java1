package Threads;

import static java.lang.Math.pow;
//E3
public class Ajob  implements Runnable{

    public Valeur v;
    int i;

    public Ajob(Valeur v, int i) {
        this.v = v;
        this.i = i;
    }

    @Override
    public void run() {
        for (int j =1;j<=pow(10,6);j++) {this.v.add(this.i);
            System.out.println(v.getValeur());}
    }
}
