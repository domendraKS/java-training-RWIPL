public class Employee {
    private int emp_id;

    public void setEmpId(int id) {
        emp_id = id;
    }

    public int getEmpId() {
        return emp_id;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(10);
        System.out.println("Employee Id : " + e.getEmpId());
    }
}