package practice;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2= scanner.nextInt();
        int div=(num1 /num2);
        System.out.println("division "+div);
    }
}
