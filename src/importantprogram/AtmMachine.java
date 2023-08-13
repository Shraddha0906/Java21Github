package importantprogram;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        int balance=10000,withdraw,deposit;
        Scanner sc= new Scanner(System.in);
       while (true){
           System.out.println("ATM Machine");
           System.out.println("Select 1 for the cash Withdraw");
           System.out.println("select 2 for the Deposit");
           System.out.println("select 3 for the Check balance");
           System.out.println("select 4 for the exit");
           System.out.println("Choose the Operation you want to perform");

           //get choice from the user
           int choice=sc.nextInt();
           switch (choice){
               case 1 :
                   System.out.println("Enter Money to withdraw");
                   withdraw= sc.nextInt();
               if (balance>=withdraw){
                   balance= balance-withdraw;
                   System.out.println("Please Collect your money");
               }else {
                   System.out.println("Insufficient Balance");
               }
                   System.out.println(" ");
               break;

               case 2:
                   System.out.println("Enter Money To deposit");
                   deposit=sc.nextInt();
                   balance=balance+deposit;
                   System.out.println("your Money has been successfully Deposit");
                   System.out.println(" ");
                   break;

               case 3:
                   System.out.println("your balance is "+balance);
                   System.out.println(" ");
                   break;

               case 4:
                 System.exit(0);
                 break;
           }
       }
    }
}

