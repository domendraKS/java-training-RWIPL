import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(50);

        // ts.add("Shubham");
        // ts.add("Piyush");
        // ts.add("Gevendra");
        // ts.add("Sakshi");

        // ts.add(null); //cannot add null value
        // ts.remove(20);
        // ts.clear();

        System.out.println(ts);
    }
}
