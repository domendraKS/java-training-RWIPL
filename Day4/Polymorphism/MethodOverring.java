package Day4.Polymorphism;

class Override {
    void show() {
        System.out.println("Override show");
    }
}

public class MethodOverring extends Override {
    void show() {
        super.show();
        System.out.println("Method Overring Show");
    }

    public static void main(String[] args) {
        // Override o = new Override();
        // o.show();

        MethodOverring mo = new MethodOverring();
        mo.show();
    }
}
