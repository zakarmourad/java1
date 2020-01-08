package TD.gestioneleve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eleve implements Comparable<Eleve>{
    private String nom;
    private double moyenne=0;
    public List<Integer> list = new ArrayList<>();

    public Eleve() {
    }

    public Eleve(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setMoyenne(double moyenne) {
        if (moyenne== 0 )return;
        this.moyenne += moyenne;
    }

    public void ajouternote(int note){
        this.list.add(note);
        setMoyenne(note);
    }

    @Override
    public String toString() {
        return "Nom : "+ this.nom + " Moyenne : "+ this.moyenne/this.list.size();
    }

    public ArrayList<Integer> getListNotes(){
       return (ArrayList<Integer>) this.list;
    }

    public static void main(String[] args) {
        Eleve b = new Eleve("bari");
        b.ajouternote(18);b.ajouternote(10);b.ajouternote(12);
        System.out.println(b.toString());
        System.out.println(b.getListNotes());
    }

    @Override
    public int compareTo(Eleve o) {
        if (this.moyenne > o.moyenne){
            return 1;
        }else if (this.moyenne < o.moyenne){
            return -1;
        }
        else return 0;
    }
}

