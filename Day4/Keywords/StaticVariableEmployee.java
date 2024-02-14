// package Day4.Keywords;

public class StaticVariableEmployee {
    int emp_id;
    String emp_name;
    static String emp_company = "RWI";

    StaticVariableEmployee(int empid, String empname) {
        this.emp_id = empid;
        this.emp_name = empname;
    }

    void display() {
        System.out.println(emp_id + " " + emp_name + " " + emp_company);
    }

    public static void main(String[] args) {
        StaticVariableEmployee e1 = new StaticVariableEmployee(101, "Shubham");
        e1.display();

        StaticVariableEmployee e2 = new StaticVariableEmployee(102, "Piyush");
        e2.display();
    }
}
