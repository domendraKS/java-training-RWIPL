package Day4.Keywords;

class Demo {
    static int b = 30;
}

public class StaticVariable {
    static int a = 10;

    void m1() {
        int a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        // StaticVariable obj = new StaticVariable();
        // obj.m1();
        System.out.println(Demo.b);
    }
}