package collection;

public class solo<T> {

    private T valeur;

    public solo() {
    }

    public solo(T valeur) {
        this.valeur = valeur;
    }

    public T getValeur() {
        return valeur;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }

    public void aff(){
        System.out.println(valeur);
    }

    public static void main(String[] args) {
        new solo<Integer>(333).aff();
        new solo<String>("gdfgdgfd").aff();
        new solo<Float>((float) 33.33).aff();

    }
}
