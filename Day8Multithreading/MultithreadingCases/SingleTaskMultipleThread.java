public class SingleTaskMultipleThread extends Thread {
    public void run() {
        System.out.println("Single Task Multiple Thread");
    }

    public static void main(String[] args) {
        SingleTaskMultipleThread stmt1 = new SingleTaskMultipleThread();
        stmt1.start();
        SingleTaskMultipleThread stmt2 = new SingleTaskMultipleThread();
        stmt2.start();
    }
}
