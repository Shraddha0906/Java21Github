package practice;

import java.util.Arrays;

public class ArraySort {


    public static void main(String[] args) {
        int[]arr1={1234,563,78,90,45};
        String[]arr2={"Java","C","python","C++"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
