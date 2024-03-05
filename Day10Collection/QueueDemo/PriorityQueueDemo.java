import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        // System.out.println(pq.poll()); // retrieve and remove the head of queue which
        // is higher priority
        // System.out.println(pq.peek());

        // while (!pq.isEmpty()) {
        // System.out.println(pq.poll());
        // }
    }
}