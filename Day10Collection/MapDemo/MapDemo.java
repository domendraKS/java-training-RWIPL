import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(101, "Shubham");
        map.put(102, 1002);
        map.put(103, "Piyush");

        // map.clear(); //remove all elements

        /* check this key elements available or not */
        // System.out.println(map.containsKey(105));

        /* check this value elements available or not */
        // System.out.println(map.containsValue(10022));

        // System.out.println(map.get(101)); // get data according to key

        // System.out.println(map.remove(101)); // remove data according to key

        // map.replace(102, "Gevendra"); // replace the value in this key

        System.out.println(map);
    }
}
