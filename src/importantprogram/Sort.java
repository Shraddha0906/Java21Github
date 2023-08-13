package importantprogram;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Descending order");
     int arr[] ={2,82,98,17,23};
     int temp ;
     for (int i=0;i< arr.length;i++){
         for (int j=i; j< arr.length;j++){
            if (arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
         }
     }
     for (int a:arr){
         System.out.println(a);
     }

//     ascending order
        System.out.println("Ascending order");
        int []array= {2,82,98,17,23};
     int tempt;
     for (int i=0; i< array.length;i++)
     {
      for (int j=i; j< array.length;j++)
      {
         if (array[i]>array[j]){
             tempt=array[i];
             array[i]=array[j];
             array[j]=tempt;
         }
      }
     }
     for (int b: array){
         System.out.println(b);
     }
    }}
