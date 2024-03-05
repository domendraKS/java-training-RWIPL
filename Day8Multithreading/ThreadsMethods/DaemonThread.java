public class DaemonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");

        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();
    }
}
