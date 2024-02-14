public class Constructor1 {
    int emp_id;
    String emp_name;

    public Constructor1(String name, int id){
        emp_id = id;
        emp_name = name;
    }

    void getNameId(){
        System.out.println(emp_id+" --- "+emp_name);
    }

    public static void main(String[] args) {
        Constructor1 C1 = new Constructor1("Shubham", 174);
        Constructor1 C2 = new Constructor1("Piyush", 124);

        C1.getNameId();
        C2.getNameId();
    }
}
