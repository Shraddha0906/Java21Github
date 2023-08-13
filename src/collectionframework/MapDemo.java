package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer ,String> map =new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        Map<Integer ,String> map1 =new HashMap<>();
        map1.put(4,"Pune");
        map1.put(5,"Mumbai");

        Map<Integer ,String> map2 =new HashMap<>();
        map2.put(6,"Pune");
        map2.put(7,"Mumbai");

        List<Map<Integer ,String>> mapList = new ArrayList<>();

        mapList.add(map);
        mapList.add(map1);
        mapList.add(map2);

        mapList.forEach(s->{
            map.forEach((k,v)->{
                System.out.println("key=>"+k+" "+" values=>"+v );
            });
        });

        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
