package java8;
//if we implements two interface with same method = override the method and call
public class DefaultAndStatic implements MyInterface5{
    public static void main(String[] args) {
         DefaultAndStatic obj = new DefaultAndStatic();
         obj.msg();
        // obj.display();
    }
    public  String msg() {
        return MyInterface5.super.msg();
    }
//    public  void display(){
//        return MyInterface6.super.msg();
//    }
}
interface MyInterface5 {
    default String msg() {     //default keyword
        return "Pune";
    };
    static String test(){       //static keyword
        return "Pune";
    }
}
//interface MyInterface6{
//    default String msg() {
//        return "Pune";
//    };
//}

