package importantprogram;

public class MultipleMissingNumber {

     static  void MissingElement(int[]arr,int n){
         int diff=arr[0]-0;
         for (int i=0;i< n;i++){
             if (arr[i]-i != diff){
          while (diff<arr[i]-i){
              System.out.println((i+diff)+" ");
              diff++;
          }
             }
         }
     }

    public static void main(String[] args) {
        int arr[]={1,3,6,7,8};
        int n= arr.length;
        MissingElement(arr,n);
    }
}
