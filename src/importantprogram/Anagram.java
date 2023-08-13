package importantprogram;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {


    //Scanner sc = new Scanner(System.in);
    String str="earth";
    String str1="heart";
    char c[]=str.toCharArray();
     char ch[]=str1.toCharArray();
    Arrays.sort(c);
    Arrays.sort(ch);
    boolean result=Arrays.equals(c,ch);
    if (result==true){
        System.out.println(" string is anagram");
    }else {
        System.out.println("string is not anagram");
    }
}
}
