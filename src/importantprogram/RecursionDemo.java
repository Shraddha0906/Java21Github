package importantprogram;

import java.awt.print.Pageable;

//print 1 to 5 numbers using recursion
public class RecursionDemo {
//    public static void main(String[] args) {
//        int n=1;
//      PrintNum(n);
//    }
//    public  static  void PrintNum(int n){
//        if (n<=5){
//            System.out.println(n);
//            PrintNum(n+1);
//        }
//        else {
//            return;
//        }
//
//    }

public  static void PrintNum1(int n){

    if (n==0) {
        return;
    }
    System.out.println(n);
    PrintNum1(n-1);
}
      public static void main(String[] args) {
          int n=5;
          PrintNum1(n);
      }
}
