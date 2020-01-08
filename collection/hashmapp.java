package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapp {

    public static void main(String[] args) {
        //parrcour map  using entry


        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"tree");
        map.put(4,"foor");

        Set<Map.Entry<Integer,String>> st = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = st.iterator();

        while (it.hasNext()){
            Map.Entry<Integer,String> key = it.next();
            System.out.println(" key :"+key.getKey()+" val : "+key.getValue());
            it.remove();
        }
    }
}
