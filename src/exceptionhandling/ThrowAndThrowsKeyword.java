package exceptionhandling;


/**
 *                Throw                                  Throws
 * 1. To throw Exception Explicitly             1. declare Exception
 * 2.you can throw only one Exception           2.you can declare multiple Exception
 * 3.throw is used in method body               3.throws is used with method signature
 * 4.throw is used with object of  class        4.throws is used with instance of class
 */
public class ThrowAndThrowsKeyword {
    public static void main(String[] args) {



    }
    public  void  show() throws Exception{
        System.out.println("in show");
        try {
            throw new Exception("throwing exception");
        }catch (Exception e){                          //you also write empty catch box
            System.out.println(e);
        }
        throw new Exception("Throwing exception");
    }
}
