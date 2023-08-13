package importantprogram;

import java.util.Scanner;

public class SumOfNaturalNumUsingRecursion {
    public  static   void PrintSum(int i,int n,int sum){
      if (i==n){
          sum+=i;
          System.out.println(sum);
          return;
      }
        sum+=i;
        PrintSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
        System.out.println("the sum is ");
        PrintSum(0,n,0);

    }
}
