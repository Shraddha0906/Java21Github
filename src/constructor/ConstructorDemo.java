package constructor;
/**
 * constructor - It is special type of function which execute when you create object of the class
 * rule=
 * 1.your function will be same class name
 * 2.there is no explicit return type
 * 3.final,static ,synchronized keyword are not allowed
 * <p>
 * type of constructor- parameter constructor
 * default constructor
 */
public class ConstructorDemo {
public ConstructorDemo(){
    System.out.println("In constructor");
}
    public ConstructorDemo(int i){
        System.out.println("In constructor"+i);
    }

    public static void main(String[] args) {
     ConstructorDemo obj=new ConstructorDemo(6);
    }
}
