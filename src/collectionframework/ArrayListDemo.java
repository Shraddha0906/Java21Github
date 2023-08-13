package collectionframework;
/**
 * Arraylist Maintain insertion order
 * arraylist stores duplicate values
 * arraylist uses dynamic array
 *   fast for searching
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
//          int arr[]=new int [2];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=57;
//        System.out.println(arr[1]);

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);


        List<Integer>list1=new ArrayList<>();
        List<Integer>list2= Arrays.asList(1,2,3,4,5,6);
        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer>list4=new ArrayList<>(List.of(1,2,3,4));
//        List<Integer>list5=new ArrayList<>(){{add(10),add(20);}};
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

    }
}

