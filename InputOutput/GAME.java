package InputOutput;

import java.io.Serializable;

public class GAME implements Serializable {
    private String nom,style;
    private double prix;

    public GAME(String nom, String style, double prix) {
        this.nom = nom;
        this.style = style;
        this.prix = prix;
    }

    public String toString() {
        return "GAME{" +
                "nom='" + nom + '\'' +
                ", style='" + style + '\'' +
                ", prix=" + prix +
                '}';
    }
}
