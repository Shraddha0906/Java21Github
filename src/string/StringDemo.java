package string;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

//string are immutable =they cannot modify or change
//string is sequence of character
public class StringDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter= null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bufferedWriter.write("i am indian"+"\n"+"cxtrxdvxwg"+"vfvg"+"vgccc");
        bufferedWriter.close();

//        String str="pune";     //0 or 1 object are created
//        // String str1= new String("Pune");  //atleast one object are created
//        String str1="Pune";
//        System.out.println(str==str1);//check references
//        System.out.println(str.equals(str1)); //check chracter
//        System.out.println(str.equalsIgnoreCase(str1)); //ignore case -ex capital letter or small letter


//        str= str.concat("Kolhapur");
//        System.out.println(str);
//        System.out.println(str.charAt(2));
//        System.out.println(str.indexOf(2));
//        System.out.println(str.isBlank());//space are consider
//        System.out.println(str.isEmpty());//space are not consider
//
//
//
//        String obj1="obj1";
//        String obj2="obj1";
//        String obj3="obj1";
//        String obj4="obj1";
//      char[] arr={'w','e','l'};
//        String str1= new String(arr);
//        System.out.println(str1);
//
    }
}
