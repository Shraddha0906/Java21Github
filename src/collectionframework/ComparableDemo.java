package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//single sorting sequence
public class ComparableDemo  implements Comparable<ComparableDemo>{  //compareTo method
    int id;
    String name;
    String address;



    public  ComparableDemo(int id,String name,String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    public static void main(String[] args) {
        ComparableDemo obj1= new ComparableDemo(1,"Rahul","Pune");
        ComparableDemo obj2= new ComparableDemo(2,"Ram","Sangli");
        ComparableDemo obj3= new ComparableDemo(3,"Radha","Mumbai");

        List<ComparableDemo>list=new ArrayList<>();
        Collections.sort(list);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Collections.sort(list,Collections.reverseOrder());

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+""+s.address);
        });
     List<Integer>list1=new ArrayList<>();
     list1.add(234);
     list1.add(456);
     list1.add(213);
    }


    @Override
    public int compareTo(ComparableDemo o) {
//        if (o.id==this.id){
//            return 0;
//        } else if (o.id < this.id) {
//            return 1;
//
//        }else {
//            return -1;
//
//        }
        return compare(o.id,this.id);
       //  return o.name.compareTo(this.name);
    }
    public static int compare(int X,int Y){
       return (X>Y)? -1:((X==Y)?0:1);
    }
}
