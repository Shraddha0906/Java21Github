package java8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiFunctionDemo {
    public static void main(String[] args) {
//        List<Integer>list= Arrays.asList(1,2,3,4,5,6);
//        Predicate<Integer>predicate= (number)-> number%2==0;

        BiFunction<List<Integer>,Predicate<Integer>,List<Integer>>biFunction=(list1,predicate1)->{
            List<Integer>arr= new ArrayList<>();
            for (Integer i:list1){
                if (predicate1.test(i)){
                    arr.add(i);
                }
            }
            return arr;
        };
        System.out.println(biFunction.apply(Arrays.asList(1,2,3,4,5,6),(number)->number%2==0));

        //sum
        List<Integer>list1=Arrays.asList(1,2,3,4,5,6);
       int  sum=0;
        for (Integer i:list1){
            sum= sum+i;
        }
        System.out.println(sum);

        Optional<Integer>res1=list1.stream().reduce(((integer,integer2)->
                integer+integer2 )).get().describeConstable();
        System.out.println(res1);

        System.out.println(IntStream.of(1,2,3,4,5,6).reduce(Integer::sum).getAsInt());  //reduce=it takes binary operator and return optional value


       List<String>list=Arrays.asList("Pune","Nashik","kolhapur");
        Optional<String> string  = list.stream().reduce((name1,name2)->name1.length() >= name2.length() ? name1 : name2);
        System.out.println(string);

        List<String> list2=Arrays.asList("java","javScript","C","c++");
        Set <String> startWithJ=list2.stream().filter((s)->s.startsWith("j") ).collect(Collectors.toSet());
        System.out.println(startWithJ);


    }
  }
