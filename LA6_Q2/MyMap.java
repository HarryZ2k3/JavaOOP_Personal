//Huynh_Phuong_Dai_ITITWE21039
package LA6_Q2;

import java.util.HashMap;
import java.util.Map;

public abstract class MyMap<T, U> implements Map {

    public static void main(String[] args) {
        Map<Object,Object> m = new HashMap<>();

        m.put(1,"Dai");
        m.put(2,"Nam");
        m.put(2.3, 4);
        m.put("UwU", true);
        for (Map.Entry<Object,Object> e : m.entrySet()) {
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }

    }
}