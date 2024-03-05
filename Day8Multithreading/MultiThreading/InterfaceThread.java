public class InterfaceThread implements Runnable {
    public void run() {
        System.out.println("Interface Threading task");
    }

    public void run(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        InterfaceThread it = new InterfaceThread();
        Thread th = new Thread(it);
        th.start();
    }
}
