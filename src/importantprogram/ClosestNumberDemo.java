package importantprogram;


public class ClosestNumberDemo {
    static int closestNumber(int n, int m)
    {
        // find the quotient
        int q = n / m;

        // 1st possible closest number
        int n1 = m * q;

        // 2nd possible closest number
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
        
        // if true, then n1 is the required Closest number
        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;

        // else n2 is the required C
        // closest number
        return n2;
    }

    // Driver program to test above
    public static void main(String args[])
    {
        int n = 17, m = 3;
        System.out.println(closestNumber(n, m));



    }
}






