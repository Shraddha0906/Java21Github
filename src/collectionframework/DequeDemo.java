package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> queue= new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.addFirst(40);
        queue.addLast(40);
        queue.offer(50);    //if queue is full
        System.out.println(queue.remove());  //return exception  If queue is empty  =  for remove
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeLast());
        System.out.println(queue.poll());  //return null if queue is empty
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());

        System.out.println(queue.peek());    //return null If queue is empty         =  for retrive
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.element());  //return exception  If queue is empty

        System.out.println(queue.element());
        System.out.println(queue);
    }
}
