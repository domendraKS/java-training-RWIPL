package Day4.AbstractInterface;

interface I1 {
    // int a = 0; // public static final --default

    void show(); // public abstract --default
}

interface I2 {
    void display();
}

public class Interface implements I1, I2 {
    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.show();
        i.display();
    }
}