package importantprogram;

import java.util.HashSet;

public class Duplicate {
   public static void main(String[] args) {
       int [] arr={2,0,0,1,3,9,2,5,2};

        System.out.println("Duplicate element in array");
        for (int i=0;i<arr.length;i++)
        {
           for (int j=i+1;j< arr.length;j++){
               if (arr[i]==arr[j]&& i!=j){
                   System.out.println(arr[j]+" ");
               }
             }
           }
//        int[] arr = {2,0,0,1,3,9,2,5,2 };
//
//        boolean[] b = new boolean[arr.length];
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            if(b[i]) continue;
//
//            boolean duplicate = false;
//            for (int j = i + 1; j < arr.length; j++)
//            {
//                if (arr[i] == arr[j])
//                {
//                    duplicate = b[j] = true;
//                }
//            }
//            if(duplicate)
//                System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//        .......................................

//        int [] a={63,14,22,15,47,63,22};
//        for (int s=0;s<a.length;s++){
//           for (int k=s+1;k<a.length;k++){
//               if (a[s]==a[k]){
//                   System.out.print(a[k]+" ");
//               }
//           }
//        }



    //find duplicate value from two array

//    int arr[]={1,3,4,6,8,4};
//    int arr1[]={2,7,4,6,0};
//       HashSet<Integer> hashSet=new HashSet<>();
//    for (int i=0;i<arr.length;i++)
//       {
//           for (int j=0;j<arr1.length;j++){
//               if (arr[i]==arr1[j]){
//                   hashSet.add(arr[i]);
//               }
//           }

      // }
//       for (int n:hashSet){
//           System.out.println(n);
//       }
//
   }
}
