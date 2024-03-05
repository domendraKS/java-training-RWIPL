public class PriorityThread extends Thread {
    public void run() {
        System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread Default Priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(4);
        System.out.println("Main New Thread Priority : " + Thread.currentThread().getPriority());

        PriorityThread pt = new PriorityThread();
        pt.setPriority(3);
        pt.start();
    }
}
