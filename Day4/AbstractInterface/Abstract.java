package Day4.AbstractInterface;

abstract class Bike {
    abstract void run();

    void fun() {
        System.out.println("Hello");
    }
}

public class Abstract extends Bike {
    void run() {
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Bike obj = new Abstract();
        obj.run();
        obj.fun();
    }
}
