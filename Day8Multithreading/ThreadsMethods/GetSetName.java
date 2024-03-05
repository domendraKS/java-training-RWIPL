public class GetSetName extends Thread {
    public void run() {
        // System.out.println(Thread.currentThread().getName());
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        // this is for default thread
        /*
         * System.out.println(Thread.currentThread().getName()); // get thread name
         * Thread.currentThread().setName("RAM"); // set thread name
         * System.out.println("New Thread Name : " + Thread.currentThread().getName());
         */

        // user defined thread
        GetSetName gsn1 = new GetSetName();
        gsn1.start();
        System.out.println(gsn1.getName());
        System.out.println(gsn1.isAlive());

        GetSetName gsn2 = new GetSetName();
        gsn2.start();
        System.out.println(gsn2.getName());
        System.out.println(gsn2.isAlive());
    }
}
