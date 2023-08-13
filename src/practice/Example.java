package practice;

public class Example {
    public static void main(String[] args) {
        try{
            badmethod();
            System.out.println("A");     //not print
        }catch (RuntimeException ex){
            System.out.println("b");
        }catch (Exception ex1){
            System.out.println("c");   //not print
        } finally {
            System.out.println("d");
        }
        System.out.println("e");
    }
    public static void badmethod(){
        throw new RuntimeException();


    }
}
