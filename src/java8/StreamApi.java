package java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * String Api= It is sequence of object and have many methods.
 *              that method we are combining and producing desire result
 *
 * Types- sequential and parallel(multithreading)
 *
 * Operation- terminal and intermediate
 *
 * terminal -> forEach(consumer),reduce(),collect()
 * intermediate ->  map(Function),filter(predicate),sorted()
 */
public class StreamApi {
    public static void main(String[] args) {
        Function<String,Integer> function =(str)->str.length();  //<String,Integer> =input type and return type
        System.out.println(function.apply("Welcome"));

        Function<Integer,Integer> add=(num)->num+3;
        System.out.println(add.apply(5));

        Function<Integer,Integer>multi=(num)-> num*2;
        System.out.println(multi.apply(4));

        Function<Integer,Integer>res=add.andThen(multi);  //first add then multi
        System.out.println(res.apply(2));

        Function<Integer,Integer> com= add.compose(multi);   //first multi then add
        System.out.println(com.apply(3));

        Function<Integer,Integer> ind= Function.identity();
        System.out.println(ind.apply(2));

        //Map(function)

        List<Integer>list = Arrays.asList(1,2,3,4,5,6);
        Function<Integer,Integer> m =(n)->n+2;
        list.stream().map(m).forEach(System.out::println);

//        List<Integer>list = Arrays.asList(1,2,3,4,5,6);
//        list.stream().map((n)->n+2).forEach(System.out::println);
      Function<Integer,String> evenOdd=(number)-> number%2==0?"Even":"Odd";
        System.out.println(evenOdd.apply(5));
        System.out.println();

         List<String>list1=Arrays.asList("home","pune","mumbai");
         list1.stream().map((str)->str.toUpperCase()).forEach(System.out::println);


      System.out.println( list.stream().sorted(Comparator.reverseOrder()));
        System.out.println();

        Predicate<Integer>predicate=(number)->number%2==0;
        list.stream().filter(predicate).forEach(System.out::println);




    }


}
