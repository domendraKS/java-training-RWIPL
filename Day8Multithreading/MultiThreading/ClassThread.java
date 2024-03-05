public class ClassThread extends Thread {
    public void run() {
        System.out.println("Class Threading task");
    }

    public static void main(String[] args) {
        ClassThread ct = new ClassThread();
        ct.start();
    }
}
