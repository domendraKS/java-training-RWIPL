import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee(104, "Revendra"));
        emp.add(new Employee(101, "Shubham"));
        emp.add(new Employee(103, "Jitendra"));
        emp.add(new Employee(102, "Ashish"));

        Collections.sort(emp, new NameComparator());

        for (Employee e : emp) {
            System.out.println(e.empId + "==" + e.name);
        }
    }
}
