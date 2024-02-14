package Day4.Polymorphism;

public class MethodOverloading {
    void show() {
        System.out.println("Show");
    }

    void show(int a) {
        System.out.println("Show with one arguments");
    }

    // if change return type of same method with the same args is not allowed
    // int show(int a) {
    // System.out.println("Show with one arguments");
    // }

    void show(String a) {
        System.out.println("Show with one arguments but diff. type");
    }

    void show(int... va) {
        System.out.println("Show with varargs");
    }

    void show(int a, int b) {
        System.out.println("Show with two arguments");
    }

    void show(int a, String b) {
        System.out.println("Show with first int and one String means sequence of args");
    }

    void show(String a, int b) {
        System.out.println("Show with one int and one String means sequence of args");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        // mo.show();
        mo.show(34, 45, 56);
        // mo.show('a'); // if method have no char args then it will call int args
    }

    // we can overload java main() method
    public static void main(int a) {
        System.out.println("Main method overloaded " + a);
    }
}
