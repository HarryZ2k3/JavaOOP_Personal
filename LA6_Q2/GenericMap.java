//Huynnh_Phuong_Dai_ITITWE21039
package LA6_Q2;


import java.util.HashMap;
import java.util.Map;

public abstract class GenericMap<T,U> implements Map {


    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>(); //parameterized generic type
        m.put(1,"Dai");
        m.put(2,"Nam");
        m.put(3, "UwU");
        System.out.println("THIS IS A PARAMETERIZED GENERIC TYPE");
        for (Map.Entry<Integer,String> e : m.entrySet()) {
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }

        //raw genetic type
        Map m1 = new HashMap();
        m1.put(1,"T");
        m1.put("Felix","Justin");
        m1.put(true, 1);

        System.out.println("THIS IS A RAW GENERIC TYPE");
        for (Object e: m1.entrySet()){
            System.out.println(e);
        }
    }
}
