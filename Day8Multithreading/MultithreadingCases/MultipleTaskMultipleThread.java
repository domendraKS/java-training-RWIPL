class MyThread1 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Task 2");
    }
}

class MultipleTaskMultipleThread {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start();
        MyThread2 mt2 = new MyThread2();
        mt2.start();
    }
}
