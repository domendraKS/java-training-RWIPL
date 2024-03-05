import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add(10);
        al1.add("Piyush");
        al1.add('S');
        al1.add(null);

        // System.out.println(al1);
        // System.out.println(al1.size()); // contain total elements

        ArrayList al2 = new ArrayList();

        al2.add(20);
        al2.addAll(al1);

        // System.out.println(al2);

        al1.remove(null);
    }
}
