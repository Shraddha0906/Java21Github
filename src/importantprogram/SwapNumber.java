package importantprogram;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int x,y,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X and Y");
       x= sc.nextInt();
       y= sc.nextInt();
        System.out.println("Before swapping : "+x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping: "+x+" "+y);

    }
}
