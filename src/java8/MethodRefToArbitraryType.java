package java8;

import javax.xml.namespace.QName;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class MethodRefToArbitraryType {
    public static void main(String[] args) {

          //Method ref to Arbitrary
        List<Person>list=Arrays.asList(new Person( " shraddha"),new Person( " Amit"));
        list.forEach(Person::getName);

    }
        private static class Person {
            String name;

            public Person(String name) {
                this.name = name;
            }
            public  void getName(){
                System.out.println("Name"+this.name);
            }


        }
    }

