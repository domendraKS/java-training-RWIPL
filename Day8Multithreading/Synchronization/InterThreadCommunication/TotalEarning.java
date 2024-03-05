class CalculateEarning extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class TotalEarning {
    public static void main(String[] args) {
        CalculateEarning ce = new CalculateEarning();
        ce.start();

        synchronized (ce) {
            try {
                ce.wait();
                System.out.println("Total Earning : " + ce.total + "₹");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
