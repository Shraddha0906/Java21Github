package java8;
/*
Lambda expression -> anonymous function
Syntax-()->{}
advantage-> to implement functional interface
and it take less code
 */
public class LambdaExpression {
    public static void main(String[] args) {
    MyInterface1 myInterface1=(i)->{
        System.out.println("In show");
    };
        myInterface1.show(6);
        MyInterface2 myInterface2=(a,b)->a*b;
        System.out.println(myInterface2.multi(7,8));

    }
    interface MyInterface1{
   void show(int i);
    }
     interface MyInterface2{
           int multi(int i, int j);
     }
}
