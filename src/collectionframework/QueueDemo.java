package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>queue= new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.offer(50);    //if queue is full
        System.out.println(queue.remove());  //return exception  If queue is empty  =  for remove
        System.out.println(queue.poll());  //return null if queue is empty

        System.out.println(queue.peek());    //return null If queue is empty         =  for retrive
        System.out.println(queue.element());  //return exception  If queue is empty

        System.out.println(queue.element());
        System.out.println(queue);

    }
}
