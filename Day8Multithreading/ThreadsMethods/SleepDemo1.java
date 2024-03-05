public class SleepDemo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                // Thread.sleep(1000, 522);
                System.out.println(i);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // main thread
        // for (int i = 1; i <= 5; i++) {
        // try {
        // Thread.sleep(1000);
        // System.out.println(i);
        // } catch (InterruptedException ie) {
        // System.out.println(ie);
        // }
        // }

        // user thread
        SleepDemo1 sd = new SleepDemo1();
        sd.start();
    }
}