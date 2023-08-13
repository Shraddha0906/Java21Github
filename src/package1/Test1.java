package package1;

public class Test1 {
  //public int i=10;  //..global variable //instance variable
  //  private int i=10;
 protected int i=10;
    public static void main(String[] args) {
       //int a= 5;  //..local variable
        Test1 obj=new Test1();
        System.out.println(obj.i);


    }
}
