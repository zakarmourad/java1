package Threads;
//E3
public class Test {
    public static void main(String[] args) {

        Valeur v=new Valeur(3);
        new Ajob(v,1).run();
       new Ajob(v,-1).run();
        System.out.println(v.toString());

        //Q4 : la premiere valeur 3
        //Q5 :
        //Q6 : la premeiere valeur doit etre 0
    }
}

