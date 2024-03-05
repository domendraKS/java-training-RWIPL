public class ThreadInterrupt extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadInterrupt ti = new ThreadInterrupt();
        ti.start();
        ti.interrupt();
    }
}