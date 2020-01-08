package animal;

public class testAnimal extends animal {
    public testAnimal() {
        super();
    }

    public static void main(String[] args) {
        new animal("homar", 20, 150, 60, 3).afficher();
    }
}
