package importantprogram;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num =3553;

        int rem,rev=0;
        int originalNum=num;
        while (num !=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }if (originalNum==rev){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }
}
