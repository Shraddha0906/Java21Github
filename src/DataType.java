import java.util.ArrayList;
import java.util.List;


public class DataType {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        DataType obj = new DataType();
        System.out.println(obj.b);
        System.out.println(obj.show());
    }

    //Primitive datatype

    byte b = 125;
    short s= 32767;
    int i= 2245656;
    long l= 3456787638487494979L;
    float f=237256666666666666666675845434345645657.0f;
    double d=475345333333333333333333333333434555345545435345345454555333333333333333333333333333333.0;
    boolean aBoolean = true;
    char ch='h';

// non-primitive
    String str ="pune";
    String str1 = new String("mumbai");
Byte aByte;
Short aShort;
Integer integer;
Long aLong;
Float aFloat;
Double aDouble;
Boolean boolen;
Character character;

//object creation

    String show(){
        return "pune";
    }



}