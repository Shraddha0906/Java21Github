package practice;

public class SumOfArray {

    public static void main(String[] args) {
       int a[]={ 1,2,3,4,5,6 } ;
       int sum=0;
       //Enhanced for loop
       for (int i : a)
           sum += i;
           System.out.println(sum);


    }
}


