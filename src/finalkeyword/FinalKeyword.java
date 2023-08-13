package finalkeyword;
/**
final variable - if you declare the final variable then you can not reassign the value to variable
final method- if you declare final method then you cannot override that method
 final class- if you declare final class then you cannot inherit the class
 */
public class FinalKeyword {
   final int i =10;
//     public  void show(){
//         int i=20;
//     }

    public  final void show(){
        System.out.println("in a show method");   //final method
    }


    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.show();
        System.out.println(obj.i);

    }
    class C extends FinalKeyword{
//public void show();   // cannot override

    }

}
