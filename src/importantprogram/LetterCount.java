package importantprogram;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterCount {

        public static void main(String[] args) {
//            String str = "aabbcccda";
//            int[] counts = new int[(int) Character.MAX_VALUE];
//            // If you are certain you will only have ASCII characters, I would use `new int[256]` instead
//
//            for (int i = 0; i < str.length(); i++) {
//                char charAt = str.charAt(i);
//                counts[(int) charAt]++;
//            }
//
//            for (int i = 0; i < counts.length; i++) {
//                if (counts[i] > 0)
//                    //System.out.println("Number of " + (char) i + ": " + counts[i]);
//                    System.out.print("" + (char) i + counts[i] +"");
//            }
//            ...........................................................................
            String str="aaabbccda";
            String result="";
            int count =1;
            for (int i=0;i< str.length()-1;i++){
                if (str.charAt(i)== str.charAt(i+1)){
                    count++;
                    continue;
                }else {
                    result=result+count+str.charAt(i);
                    count=1;
                }
            }
       result= result+count+str.charAt(str.length()-1);
            System.out.println(result);


            }}
