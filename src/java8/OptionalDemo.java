package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Student obj= new Student(1,"rahul");

        if(obj.getName()!=null){
            System.out.println(obj.getName().toUpperCase());
        }else {
            System.out.println("Name is null");
        }
//        Optional<String>optional=Optional.of(obj.getName());
//        System.out.println(optional.get());

        Optional<String>optional= Optional.empty();
        System.out.println(optional);

//        Optional<String>optional1=Optional.ofNullable(obj.getName());
//        if (optional1.isPresent()){
//            System.out.println(optional.get());
 //      }
        Optional <String>optional2=Optional.ofNullable(obj.getName());
        System.out.println(optional2.orElseGet(()->"shraddha"));
    }
}
class Student{

    int id;
    String name;

    public Student(int id,String name){
        this.id=id;
        this.name= name;
    }

    public String getName() {
        return name;
    }
}