import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        tm.put(105, "Amit");
        tm.put(102, "Bhuvan");
        tm.put(101, "Chaman");
        tm.put(106, "Domendra");
        tm.put(103, "Ener");

        // tm.put("Bhuvan", 102);
        // tm.put("Chaman", 101);
        // tm.put("Amit", 105);
        // tm.put("Domendra", 104);
        // tm.put("Ener", 103);

        System.out.println(tm);

        /* get value greater than or equal to key */
        // System.out.println(tm.ceilingEntry(104));
        // System.out.println(tm.floorEntry(104)); // get value smaller than or equal to
        // System.out.println(tm.higherEntry(105)); // get value greater thani i key
        // System.out.println(tm.floorEntry(105));
        // System.out.println(tm.firstEntry());
        // System.out.println(tm.get(101)); // get value according to key
        // System.out.println(tm.keySet()); // get all key in set form
        // System.out.println(tm.subMap(102, 106));
    }
}
