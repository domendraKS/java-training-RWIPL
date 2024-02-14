package Day4.Keywords;

class Test {
    Test(ThisDemo td) {
        System.out.println("Test class constructor");
    }
}

public class ThisDemo {
    int i;

    // ThisDemo() {
    // System.out.println("Default Contructor no args");
    // }

    // ThisDemo(int i) {
    // this(); // this called Default constructor
    // System.out.println("Parameteries Contructor");
    // }

    void setValue(int i) {
        this.i = i;
    }

    void showValue() {
        System.out.println(this.i);
    }

    void display() {
        System.out.println("Display Called");
    }

    void show() {
        this.display(); // display();
    }

    void m1(ThisDemo td) {
        System.out.println("m1 method");
    }

    void m2() {
        m1(this);
    }

    void mTest() {
        Test t = new Test(this);
    }

    ThisDemo instatanceReturn() {
        return this;
    }

    public static void main(String[] args) {
        // ThisDemo obj1 = new ThisDemo();
        // obj1.setValue(20);
        // obj1.showValue();
        // obj1.show();

        // ThisDemo obj2 = new ThisDemo(20);

        // ThisDemo obj3 = new ThisDemo();
        // obj3.m2();

        // ThisDemo obj4 = new ThisDemo();
        // obj4.mTest();

        ThisDemo obj5 = new ThisDemo();
        obj5.instatanceReturn();
    }
}
