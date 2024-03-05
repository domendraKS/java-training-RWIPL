import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("Shubham"); // this is method of Collection interface
        v.add(1, 'M'); // this is method of List interface
        v.addElement(5); // this is method of Vector class

        /* remove elements */
        // System.out.println(v.removeElement(5)); // return boolean parameter is object
        // v.removeElementAt(0); // parameter pass as index number
        // v.removeAllElements(); // remove all elements

        // System.out.println(v.capacity()); // check capacity it can hold

        // v.setElementAt("Sahu", 1);

        System.out.println(v);
    }
}
