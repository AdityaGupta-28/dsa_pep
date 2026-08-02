package priorityQueue;

import java.util.*;
// import java.util.priorityQueue;

// PriorityQueue<Integer> pq = new PriorityQueue<>();
// pq.offer(10);      // Insert
// pq.add(20);        // Same as offer
// pq.peek();         // Smallest element
// pq.poll();         // Remove smallest
// pq.remove(10);     // Remove a specific element
// pq.contains(20);   // Check existence
// pq.size();         // Number of elements
// pq.isEmpty();      // true/false
// pq.clear();        // Remove all elements

public class maxPriorityQueue {
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
