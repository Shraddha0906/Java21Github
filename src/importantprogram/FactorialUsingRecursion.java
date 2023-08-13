
package importantprogram;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public  static  int  calculateFact(int n){
        if (n==1||n==0){
       return 1;
        }
        int Fact_num =calculateFact(n-1);
        int Fact_n=n*Fact_num;
        return Fact_n;

    }
    public static void main(String[] args) {
       int n;
//      int ans= calculateFact(n);
//        System.out.println(ans);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number ");
        n= sc.nextInt();
        int ans= calculateFact(n);
        System.out.println("The factorial of "+n+"! "+ "is "+ ans);

    }
}
