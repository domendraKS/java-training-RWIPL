public class JoinMethodDemo2 extends Thread {
    static Thread mainMethodThread;

    public void run() {
        try {
            mainMethodThread.join();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("Child Thread : " + i);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public static void main(String[] args) {
        mainMethodThread = Thread.currentThread();

        JoinMethodDemo2 jm2 = new JoinMethodDemo2();
        jm2.start();

        for (int i = 6; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Main Thread : " + i);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}
