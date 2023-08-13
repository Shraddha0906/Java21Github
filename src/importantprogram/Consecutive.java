package importantprogram;

import java.util.Arrays;

public class Consecutive {
//        static int arr[] = { 17,24,29,8,7,3 };
//
//        // method for sum of elements in an array
//        static int sum()
//        {
//            int sum = 0; // initialize sum
//            int i;
//
//            // Iterate through all elements and add them to sum
//            for (i = 0; i < arr.length; i++)
//                sum += arr[i];
//
//            return sum;
//        }
//
//        // Driver method
//        public static void main(String[] args)
//        {
//            System.out.println("Sum of given array is "
//                    + sum());
//        }
//    }

//    static void sum(int arr[],int n){
//        int sum=0;
//        for (int i=0;i+1<n;i++){
//            //adding the alternate numbers
//            sum=arr[i]+arr[i+1];
//            System.out.println(sum+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={17,24,29,8,7,3};
//        int n= arr.length;
//        sum(arr,n);
 //  }


    public static boolean findTriplet(int arr[],int sum){
        if (arr.length<3){
            return false;
        }
        Arrays.sort(arr);
        int len= arr.length;
        for (int i=0; i<len;i++){


        int a=i+1;
        int b = len-1;
       while (a<b){
           if (arr[i]+arr[a]+arr[b]>sum){
               return true;
           } else if (arr[i]+arr[a]+arr[b]<sum) {
               a++;
           } else if (arr[i]+arr[a]+arr[b]==sum) {
               a++;

           }else {
               b--;
           }
       }
        }
        return false;
    }
    public static void main(String[] args) {
           int arr[]={17,24,29,8,7,3 } ;
           int sum=18;
//        boolean result=findTriplet(arr,sum);
//           if (result){
//               System.out.println("exists");
//               System.out.println();
//
//           }else{
//               System.out.println("not exist");
//           }
        
        }
        }
