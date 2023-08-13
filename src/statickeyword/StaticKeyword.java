package statickeyword;

/**
 * Static - if you declare static variable memory is allocated at once
 * we cannot override the static method
 * Static methods in Java are inherited
 * Static class in Java are not inherited
 * with the use of static method we do not need to create object
 * if the static method call in another class then we write classname.methodName
 */
public class StaticKeyword {

     int id;
    String name;
   static String collegeName="ABC";

   public  static void show(){
       System.out.println("This is in show");
   }

    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword();
        obj.id=1;
        obj.name= "shraddha";
        System.out.println(obj.id+" "+obj.name+" "+obj.collegeName);

        StaticKeyword obj1 = new StaticKeyword();
        obj1.id=2;
        obj1.name= "rahul";
        System.out.println(obj1.id+" "+obj1.name+" "+obj1.collegeName);


        StaticKeyword obj2 = new StaticKeyword();
        obj2.id=3 ;
        obj2.name="ram";
        System.out.println(obj2.id+" "+obj2.name+" "+obj2.collegeName);

        show();  //direct call show method without creating object if method is in same class
    }
}
