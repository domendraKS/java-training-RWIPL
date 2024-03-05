import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Piyush");
        ll.add(101);
        ll.add('S');
        ll.add(124.3);

        System.out.println(ll);

        /* Add in first position */
        // ll.addFirst("First");
        // System.out.println("After add first : " + ll);

        /* Add in last position */
        // ll.addLast("Last");
        // System.out.println("After add last : " + ll);

        // System.out.println(ll.getFirst()); // get first element
        // System.out.println(ll.getLast()); // get last element

        /* Remove first elements */
        // ll.removeFirst();
        // System.out.println("After remove first : " + ll);

        /* Remove last elements */
        // ll.removeLast();
        // System.out.println("After remove last : " + ll);
    }
}
