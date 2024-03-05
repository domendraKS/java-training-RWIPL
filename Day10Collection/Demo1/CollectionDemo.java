import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        // System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("deepak");
        al2.add("sarwa");
        al2.add("Bhilai");
        // System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(300);
        al3.add(400);
        al3.add(500);
        // System.out.println(al3);

        // add all elements of al2 in al1
        // al1.addAll(al2);
        // System.out.println(al1);

        // check element is contain or not
        // System.out.println(al1.contains(101));

        // check ArrayList is empty or not
        // System.out.println(al2.isEmpty());

        // check how many elements or objects in ArrayList
        // System.out.println(al1.size());

        // remove elements using the index number
        // System.out.println("Before remove " + al1);
        // al1.remove(2);
        // System.out.println("After remove " + al1);

        // remove elements using the object as string
        // System.out.println("Before remove " + al2);
        // al2.remove("deepak");
        // System.out.println("After remove " + al2);

        // removeAll => remove all elements from al1 which is common in both al1 & al3
        // al1.removeAll(al3);
        // System.out.println(al1 + "--" + al3);

        // clear => remove all
        // System.out.println("Before clear "+al1);
        // al1.clear();
        // System.out.println("After clear " + al1);
    }
}
