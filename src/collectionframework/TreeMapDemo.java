package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String>map= new TreeMap<>();
        map.put(20,"pune");
        map.put(24,"Mumbai");
        map.put(30,"Nashik");
        map.put(3,"Nashik");
        map.put(6,"Nashik");
        map.put(8,"Nashik");

        System.out.println(map.descendingMap());
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map.ceilingEntry(20));
        System.out.println(map.floorEntry(5));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsKey(10));
        System.out.println(map.subMap(6,9));
        System.out.println(map.subMap(6,true,8,true));
        System.out.println(map);




    }
}
