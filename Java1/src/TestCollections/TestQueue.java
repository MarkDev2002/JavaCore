package TestCollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("India");
        queue.add("Germany");
        queue.add("America");

        System.out.println("Original queue : " + queue);

        String remove = queue.remove();
        System.out.println("Queue after remove first element - " + remove + " : " +queue);

        String head = queue.peek();
        System.out.println("Head of the queue : " + head);

        head = queue.poll();
        System.out.println("Remove head : " + head);

        System.out.println("Queue now looks like this : " + queue);
    }
}
