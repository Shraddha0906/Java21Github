package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    //method refer to instant method

    public static void main(String[] args) {
     MethodReference methodReference=new MethodReference();
     //refer method
        MyInterface myInterface= methodReference::display;
        //call method
        System.out.println(myInterface.msg());

        List<Integer>list= Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);
    }
    public String display(){
        return "hello";
    }
}
interface  MyInterface{
    String msg();
}

