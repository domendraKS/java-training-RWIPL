public class YieldMethod extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);
        }
    }

    public static void main(String[] args) {
        YieldMethod y = new YieldMethod();
        y.start();

        // if you want main method to stop and provide chance to other thread for
        // execution
        // Thread.yield();
        for (int i = 6; i <= 10; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}
