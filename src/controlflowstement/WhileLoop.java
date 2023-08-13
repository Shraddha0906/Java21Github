package controlflowstement;

public class WhileLoop {
    public static void main(String[] args) {
int i=0;

        int Counter=1;
        while( i<=4)
        {
            int j=1;
            while( j<=i)
            {
                System.out.print(" " +Counter++);
                j++;
            }
            System.out.println();
            i++;
        }

        do {                         //
            System.out.println(i);
        }while(i<=10);
    }
}
