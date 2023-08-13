package practice;

public class ArrayDemo {
    public  static boolean contains(int [] arr,int item){
        for (int i:arr)
            if (item==i){
                return true;
            }
        return false;
    }
    public static void main(String[] args) {

//        int arr[]={20, 30, 25, 35, -16, 60, -100};
//        int sum=0;
//        for (int i:arr)
//            sum += i;
//        int average =sum/ arr.length;
//        System.out.println("Average is "+average);

        int []arr={ 1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, };
        System.out.println(contains(arr,2013));
        System.out.println(contains(arr,2015));


    }
}
