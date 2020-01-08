package animal;

import org.w3c.dom.ls.LSOutput;

public class animal {

    private static int nbranimal = 0;
    private String nom;
    private int age;
    private int poid;
    private double speed;
    private int id;

    public animal() {
        nbranimal++;
    }

    public animal(String nom, int age, int poid, double speed, int id) {
        nbranimal++;
        this.nom = nom;
        this.age = age;
        this.poid = poid;
        this.speed = speed;
        this.id = id;
    }

    public static int getNbranimal() {
        return nbranimal;
    }

    public static void setNbranimal(int nbranimal) {
        animal.nbranimal = nbranimal;
    }

    public void parler() {
        System.out.println("parlerrrrrrrrrrrrr");
    }

    public void afficher() {
        System.out.println("id : " + getId() + " |nom : " + getNom() + " |age : " + getAge() + " |poid : " + getPoid() + " | speed :" + getSpeed() + "| nombre de hmar : " + nbranimal);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
