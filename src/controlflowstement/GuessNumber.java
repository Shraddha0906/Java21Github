package controlflowstement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num;
         int guessNumber;
         int counter=1;
        num= (int)(Math.random()*100)+1;
        System.out.println(num);
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter the Number");
          guessNumber= scanner.nextInt();
          counter++;
          if(num > guessNumber){
              System.out.println("Number is Greater");
          }else  if (num < guessNumber){
              System.out.println("Number is Smaller");
          }else {
              System.out.println("your guess is correct"+counter);
          }
        }while (num!= guessNumber);



    }}
