package priorityQueue;
import java.util.*;
/**
 * maxPriorityObj
 */

class Student {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class maxPriorityObj {
public static void main(String[] args) {
                                      // descending order
        PriorityQueue<Student> pq = new PriorityQueue<>( (a, b) -> Integer.compare(b.marks, a.marks) );

        pq.offer(new Student(99, "Aditya"));
        pq.offer(new Student(60, "Rahul"));
        pq.offer(new Student(90, "Aman"));

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + " " + s.marks);
        }
    }
    
}