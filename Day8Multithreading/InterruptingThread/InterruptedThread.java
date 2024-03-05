public class InterruptedThread extends Thread {
    public void run() {
        System.out.println("Line no. 3 " + Thread.interrupted()); // true -> false
        // System.out.println(Thread.currentThread().isInterrupted()); //true -> true
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("Line no. 9 " + Thread.interrupted());
                // System.out.println(Thread.currentThread().isInterrupted());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InterruptedThread iedt = new InterruptedThread();
        iedt.start();
        iedt.interrupt();
    }
}
