package controlflowstement;
 import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
    int num;
    int Sum=0;
    Scanner obj=new Scanner(System.in);

    char choice;

    num=(int)(Math.random());


    do{
        System.out.println("Enter the number");
        num= obj.nextInt();
         Sum=Sum+num;
        System.out.println("do you want continue y or n");
        choice=obj.next().charAt(0);

    }while (choice=='y'|| choice=='y');
        System.out.println("addition is ="+Sum);



    }
}
