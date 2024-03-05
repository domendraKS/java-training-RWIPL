// package Day6.ExceptionHandling;

public class PrintException {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException ae) {
            // ae.printStackTrace(); //e.name, e.description and e.stackTrace(line_number)
            // System.out.println(ae.toString()); // e.name and e.description
            System.out.println(ae); // e.name and e.description
            // System.out.println(ae.getMessage()); // e.description
        }
    }
}
