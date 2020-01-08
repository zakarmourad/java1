package Threads;

//E3
public class Valeur {
    private int valeur;

    public Valeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public String toString() {
        return  "valeur=" + valeur ;
    }
    public synchronized void add(int i){
        this.valeur+=i;
    }


}
