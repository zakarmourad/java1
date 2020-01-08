package collection;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CD implements Comparable<CD> {
    private String auteur, titre;
    private double prix;

    public CD() {
    }

    public CD(String auteur, String titre, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        this.prix = prix;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "CD [auteur =" + auteur + " , titre = " + titre + " , prix = " + prix + "]";
    }

    @Override
    public int compareTo(CD o) {
        return this.auteur.compareTo(o.auteur);
    }


    public static void main(String[] args) {

        Set<CD> tree = new TreeSet<CD>();
        tree.add(new CD("larbi","trtrt",2));
        tree.add(new CD("nazih","dfg",22));
        tree.add(new CD("moha","cvb",23));
        tree.add(new CD("youb","hjk",-2));
        tree.add(new CD("bot","yui",-552));

        Iterator it = tree.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
