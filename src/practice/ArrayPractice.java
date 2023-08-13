package practice;

public class ArrayPractice {


    public static void main(String[] args) {
//        float [] Marks= {4.3f,5.2f,3.4f,1,2};
//        float Sum=0;
//         for (float element: Marks){
//         Sum = Sum + element;
//        }
//        System.out.println("the sum is "+Sum);

        float [] Marks= {4.3f,5.2f,3.4f,1,2};
       float num= 5.4f;
        boolean IsAnArray= false;
        for (float i: Marks){
           if (num==i){
            IsAnArray=true;
            break;
        }
        }
           if (IsAnArray){
               System.out.println("The value is present in array");
           }
             else {
               System.out.println("The value is not present in the array");
            }

             int [] number={3,6,34,67,45};
              int sum1=0;
             for (int Avg :number){
                sum1= sum1+ Avg;
             }
        System.out.println("the average is " + sum1/number.length);




    }
//

}
