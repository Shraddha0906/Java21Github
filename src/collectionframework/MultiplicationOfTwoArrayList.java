package collectionframework;

import java.util.*;

public class MultiplicationOfTwoArrayList {
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        List<Integer>list1= Arrays.asList(1,2,3,6,4);
        List<Integer>list2=Arrays.asList(1,2,3,6,4);
       // Collections.reverse(list2);
        //int size=list1.size();
      //  System.out.println(list2);
//        for (int i=0; i< list1.size();i++){
//            System.out.print(list1.get(i) * list2.get(i) +",");

        for (int i=0,j=list2.size()-1;i< list1.size();i++,j--){
            System.out.print(list1.get(i) * list2.get(j) +",");

        }
        
    }
}
