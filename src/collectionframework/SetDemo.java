package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//set does not store duplicate values
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);

        Set<Integer>set1=new LinkedHashSet<>();
        set1.add(10);
        set1.add(10);
        set1.add(30);
        set1.add(40);
        System.out.println(set1);

    }
}
