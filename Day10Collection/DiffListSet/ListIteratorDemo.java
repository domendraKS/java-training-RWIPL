import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add("Shubham");
        l.add('M');

        // System.out.println(l);

        ListIterator litr = l.listIterator();

        // while (litr.hasNext()) {
        // System.out.println(litr.next());
        // }

        System.out.println("--------------");

        // while (litr.hasPrevious()) {
        // System.out.println(litr.previous());
        // }

        litr.add(200);
        // litr.set(100);

        System.out.println(l);
    }
}
