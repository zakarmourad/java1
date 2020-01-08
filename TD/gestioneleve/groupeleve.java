package TD.gestioneleve;

import java.util.*;

public class groupeleve extends  Eleve {
    private List<Eleve> listeleve = new ArrayList<>();
    public groupeleve() {
    }
    public int nombre(){
        return this.listeleve.size();
    }
    public ArrayList<Eleve> getListeleve(){
        return (ArrayList<Eleve>) this.listeleve;
    }
    public void ajoutereleve(Eleve eleve){
        this.listeleve.add(eleve);
    }
    public Eleve chercher(String nom){
        Iterator it = this.listeleve.iterator();
        while ( it.hasNext() ){
            Eleve e = (Eleve) it.next();
            if (e.getNom().equals(nom)){
                return  e;
            }
        }
        return null;
    }
    public void lister(){
        for (Eleve e : listeleve){
            System.out.println(e.toString());
        }
    }
    public void trierEleve(){
       Collections.sort(listeleve);
    }
    public void meilleurEleve(){
        System.out.println( Collections.max(listeleve));
    }

    public static void main(String[] args) {
        groupeleve groupeleve = new groupeleve();
        Eleve e1 = new Eleve("karim");e1.ajouternote(18);
        Eleve e2 = new Eleve("larbi");e2.ajouternote(15);
        Eleve e3 = new Eleve("hmad");e3.ajouternote(12);
        groupeleve.ajoutereleve(e1);
        groupeleve.ajoutereleve(e2);
        groupeleve.ajoutereleve(e3);

        System.out.println(groupeleve.getListeleve());
        System.out.println(groupeleve.nombre());
        System.out.println("cherche : "+ groupeleve.chercher("hmad"));
        groupeleve.lister();
        System.out.println(e1.compareTo(e2));
        groupeleve.trierEleve();
        groupeleve.lister();

        System.out.println("best one :");
        groupeleve.meilleurEleve();
    }
}
