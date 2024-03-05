public class JoinMethodDemo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Child Thread : " + i);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    public static void main(String[] args) {
        JoinMethodDemo1 jm1 = new JoinMethodDemo1();
        jm1.start();
        try {
            jm1.join(); // wait for child thread
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
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
