package InputOutput;

import java.io.*;

public class gameclass {
    public static void main(String[] args) {
        ObjectInputStream ois;
        ObjectOutputStream oos;
        try {
            oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
            oos.writeObject(new GAME("Assassin Creed","Aventure",45.69));
            oos.writeObject(new GAME("Tomb Raider","Plateforme",23.45));
            oos.writeObject(new GAME("Tetris","Strategie",2.50));
            oos.close();
            ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));
            try {
                System.out.println(((GAME)ois.readObject()).toString());
                System.out.println(((GAME)ois.readObject()).toString());
                System.out.println(((GAME)ois.readObject()).toString());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
