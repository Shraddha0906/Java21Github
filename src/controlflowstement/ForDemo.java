package controlflowstement;

public class ForDemo {
    public static void main(String[] args) {
//        for (int i =0; i<=10;i++){
//            System.out.print(" "+i);
//           // System.out.println(i);
//        }
//
//        int[]arr= new int[6];
//        arr[0]=20;
//        arr[1]=30;
//        arr[2]=50;
//        arr[3]=40;
//
//        for (int i: arr){
//            System.out.println(i);
//        }
//
//        int[]number ={20,31,2,56};
//
//        for (int index=0; index<=number.length; index ++){
//          if ( number[index]%2==0){
//              System.out.println("number is even "+number[index]);
//
//          }
//          else {
//              System.out.println("number is Odd "+number[index]);
//
//          }

         // }
//        int a[]={1,2,5,6,3,2};
//        System.out.println("Odd Numbers:");
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2!=0){
//                System.out.println(a[i]);
//            }
//        }
//        System.out.println("Even Numbers:");
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            }
//        }


//        for(int i=0; i<=3; i++)
//        {
//            for(int j=0; j<=3; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//
//        }
//        for(int i=0; i<=4; i++)
//        {
//            for(int j=0; j<=i; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
    //}
//        for(int i=0; i<=4; i++)
//        {
//            for(int j=i; j<=4; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        System.out.println();
//        for(int i=0; i<=4; i++)
//        {
//            for(int j=i; j<=4; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//            System.out.print("*");
//        }
//        System.out.println();
//        }




//        int Counter=1;
//        for(int i=1; i<=4; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print(" " +Counter++);
//            }
//            System.out.println();
//        }

        /*
        square pattern

         */
        for (int i=0; i<=4; i++){
            for (int j=0; j<=4; j++){
                if (i==0 ||j==0 ||i==4 ||j==4){
                    System.out.print("* ");
                }

                 else{
                     System.out.print("  ");
            }
            }
                System.out.println();

        }



    }}
