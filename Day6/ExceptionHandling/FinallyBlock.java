// package Day6.ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            // risky code
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            // exception handling code
            System.out.println(e);
        } finally {
            // cleanup code or closing connection or file
            System.out.println("Finally Block Executed");
        }
    }
}
