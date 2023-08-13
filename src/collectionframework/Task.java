package collectionframework;

import java.util.HashMap;

public class Task {
    public static void main(String[] args) {
        String str = " i am indian".trim();
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split("\\s");

        for (String word : words) {

            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }
        System.out.println(map);
        }

    }

