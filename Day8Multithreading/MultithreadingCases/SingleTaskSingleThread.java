public class SingleTaskSingleThread extends Thread {
    public void run() {
        System.out.println("Single Task Single Thread");
    }

    public static void main(String[] args) {
        SingleTaskSingleThread stst = new SingleTaskSingleThread();
        stst.start();
    }
}
