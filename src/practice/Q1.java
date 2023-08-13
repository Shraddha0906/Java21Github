package practice;

public class Q1 {
    public static void main(String[] args) {
        int i=0;
        while (i++<=10)
            i++;
            System.out.println(i);


        int a=1;
        int b=a++ + ++a;
        System.out.println(a);
        System.out.println(b);

    }

}
