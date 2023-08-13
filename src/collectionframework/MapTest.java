package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

       public static void main(String[] args){
           HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         String str="i am indian".replaceAll(" ","").toLowerCase();
         char[] arr= str.toCharArray();


         for (char c : arr){

               if (map.containsKey(c)){
                   map.put(c, map.get(c) + 1);
               }else{
                   map.put(c, 1);
               }
           }

           System.out.println(map.entrySet());
      }
    }

