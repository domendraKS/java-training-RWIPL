import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(20);
        lhs.add(10);
        lhs.add("Shubham");
        // lhs.add("Shubham"); // cannot store duplicate value
        lhs.add(10.21);

        System.out.println(lhs);
    }
}
