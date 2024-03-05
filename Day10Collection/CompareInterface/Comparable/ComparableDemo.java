import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Students> std = new ArrayList<>();

        std.add(new Students(103, "Piyush", 74));
        std.add(new Students(101, "Shubham", 81));
        std.add(new Students(102, "Gevendra", 69));

        // System.out.println(std);

        Collections.sort(std);

        // System.out.println(std);
        // for (Students students : std) {
        // System.out.println(students.rollNo + "--" + students.name + "--" +
        // students.percent);
        // }
    }
}
