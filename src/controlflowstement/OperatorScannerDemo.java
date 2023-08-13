package controlflowstement;
 import java.util.Scanner;
public class OperatorScannerDemo {
    public static void main(String[] args) {
        int x,y;
       char Operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        x=sc.nextInt();
        System.out.println("Enter Second  number: ");
        y=sc.nextInt();
        System.out.println("Enter the operator (+ ,-, *, / )");
        Operator=sc.next().charAt(0);
        double add=x+y;
        double sub=x-y;
        double mul=x*y;
        double div=x/y;
        switch (Operator){
            case '+':
            {
                System.out.println("addition is:"+add);
                break;
            }
            case '-':
            {
                System.out.println("Subtraction is:"+sub);
                break;
            }
            case '*':
            {
                System.out.println("Multiplication is:"+mul);
                break;
            }
            case '/':
            {
                System.out.println("division is:"+div);
                break;
            }
            default:
            {
                System.out.println("Wrong Choice:");
             return;
            }
        }



    }}
