package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
//        List<Integer>list1= new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        list1.add(40);
//
//       List<Integer>list2= new ArrayList<>();
//        list2.add(10);
//        list2.add(20);
//        list2.add(30);
//        list2.add(40);
//
//        list1.addAll(list2);       //add all element in list1
//        list1.removeAll(list2);
//        list1.retainAll(list2);
//        System.out.println(list1);

//        System.out.println(list1.containsAll(list2));   //all elements present in the list
//    }


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(2,25);
        System.out.println(list1.contains(90));  // 90 is present in list or not
        System.out.println(list1.get(1));        //display the no which is index is 2
        System.out.println(list1.isEmpty());
        list1.remove(0);
        System.out.println(Integer.valueOf(30));
        System.out.println(list1.indexOf(20));   //display the index number
        System.out.println(list1.set(2,25));     //replace the 30 and get 25  ...after 2 index
        System.out.println(list1.subList(1,3));   //display index 1 and 2 only index 3 is not display
        
        int []arr={1,2,3,4,5};

    }
}
