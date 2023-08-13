package controlflowstement;

public class NumberPattern {
    public static void main(String[] args) {
        for (int i=1; i<=4;i++)
        {
          for (int j=1;j<=i;j++) {
              System.out.print(j);
          }
            System.out.println();

        }

        System.out.println("................................. ");

        for (int i=1;i<=4;i++){
            for (int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
        System.out.println("..........................");

        for (int i=1;i<=5;i++)
        {
            for (int j=1; j<=i; j++)
            {
              if (i>=2 && j<=i-1){
                  System.out.print(" ");
              }else
              {
                  System.out.print(" *");
              }
            }
            System.out.println();
        }
        System.out.println("........................");

        int Counter=10;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" " +Counter--);
            }
            System.out.println();
        }
//
//      int count=1;
//        for (int i=1; i<=4; i++){
//            for (int j=i; j<=i; j++){
//                if (i==1 ||j==1 ||i==4||j==4){
//                    System.out.print(" "+count++);
//                }
//
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }
//
//


    }}
