import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(10);
        hs.add(true);
        hs.add("Shubham");
        hs.add(100.55);
        hs.add(10); // duplicate not allowed in hashSet
        hs.add(null);
        hs.add(40);
        hs.add(30);
        hs.add(20);

        System.out.println(hs);

        hs.remove(null);
        System.out.println(hs);

        // Iterator itr = hs.iterator();

        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }
    }
}
