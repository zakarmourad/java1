package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class itera  {

    public static void main(String[] args) {
        String[] t = {"","","",""};
        ArrayList<String> ar = new ArrayList<String>();

        ar.add("1");
        ar.add("2");
        ar.add("3");
        ar.add("4");

        Iterator it = ar.iterator();
        while (!ar.isEmpty() && it.hasNext() ){
            it.next();
            System.out.println(ar);
            it.remove();
        }
    }
}
