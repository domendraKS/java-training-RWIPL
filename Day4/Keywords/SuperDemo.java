package Day4.Keywords;

class Demo {
    int i = 10;

    Demo() {
        System.out.println("Class Demo Constructor");
    }

    void m1() {
        System.out.println("Class Demo method m1");
    }
}

public class SuperDemo extends Demo {
    int i = 20;

    SuperDemo() {
        super();
        System.out.println("Class SuperDemo Constructor");
    }

    void show(int i) {
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }

    void m1() {
        System.out.println("Class SuperDemo method m1");
    }

    void showSuper() {
        super.m1();
    }

    public static void main(String[] args) {
        // SuperDemo obj1 = new SuperDemo();
        // obj1.show(30);

        // SuperDemo obj2 = new SuperDemo();
        // obj2.showSuper();

        SuperDemo obj3 = new SuperDemo();
    }
}
