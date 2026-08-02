package priorityQueue;
import java.util.*;
public class minPriorityQueue {
        //// default minHeap
      public static void main(String[] args) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
