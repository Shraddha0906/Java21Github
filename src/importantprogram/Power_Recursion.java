package importantprogram;

public class Power_Recursion {
    public  static int XPower(int x, int n){
        if (n == 0) {

            return 1;
        }
        if (x==0){
            return 0;
        }
        int X_Power= XPower(x,n-1);
        int xPower=x*X_Power;
        return xPower;
    }
    public static void main(String[] args) {
     int x=2, n=5;
     int ans=XPower(x,n);
        System.out.println(ans);
    }
}
