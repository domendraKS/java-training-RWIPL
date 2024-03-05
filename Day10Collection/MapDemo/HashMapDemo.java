import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();

        hm.put(101, "Shubham");
        hm.put(104, "Gevendra");
        hm.put(103, "Amit");
        hm.put(102, "Piyush");
        hm.put(105, "Domendra");

        System.out.println(hm);

        // Set hmSet = hm.entrySet();
        // System.out.println("Set Form : " + hmSet);

        // Iterator itr = hmSet.iterator();

        // while (itr.hasNext()) {
        // // System.out.println(itr.next());
        // Map.Entry entry = (Map.Entry) itr.next();
        // System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        // for (Map.Entry me : hm.entrySet()) {
        // System.out.println(me.getKey() + " => " + me.getValue());
        // }

        // hm.remove(102);
        // System.out.println(hm.containsKey(102));
        // System.out.println(hm.containsValue("Shubham"));

        System.out.println(hm);
    }
}
