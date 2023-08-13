package exceptionhandling;
//we also use Exception keyword instead of name of exception
public class ExceptionHandling {

    public static void main(String[] args) {
        int i=10;
        int j=0;

        try{
            try{
                int c=i/j;
                System.out.println(c);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            String str=null;
            System.out.println(str.toUpperCase());
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("in finally");  //always run
        }
        System.out.println("hello");
    }
}
