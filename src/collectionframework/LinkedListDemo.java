package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// fast for insertion and deletion
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(6);
        System.out.println(list);
        System.out.println(list.offer(40));  //for add = it is queue behaviour

        System.out.println(list.element()); //array is empty -display null
        System.out.println(list.peek());    //array is empty -display exception

//        For remove
        System.out.println(list.poll());
        System.out.println(list.remove());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        System.out.println(list);
        Iterator<Integer> integerIterator = list.descendingIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());

        }
    }
}
