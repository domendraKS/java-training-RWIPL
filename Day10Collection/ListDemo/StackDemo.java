import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("Piyush");
        s.push("Gevendra");
        s.push(200);
        s.push(100.10);

        System.out.println(s);
        // System.out.println(s.pop()); // remove from stack on top item
        // System.out.println(s.peek()); // get top most elements
        // System.out.println(s.search("Piyush"));
        System.out.println(s.empty()); // check stack is empty or not
        System.out.println(s);
    }
}
