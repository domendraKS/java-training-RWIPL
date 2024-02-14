// package Day4.Keywords;

// directly call static method or ClassName.MethodName

class Xyz {
    static void show() {
        System.out.println("Show");
    }
}

public class StaticMethod {
    static int a = 10;
    int b = 20;

    static void m1() {
        // static method access only static data
        System.out.println(a);
        // System.out.println(b); //error
        // m2(); //error
    }

    void m2() {
        // static method can call onlyn other static method and
        // method cannot call non-static
        System.out.println(a);
    }

    static void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        display();
        Xyz.show();
    }
}
