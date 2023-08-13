package statickeyword;

public class Outer {
    int i =10;
    class inner{
        static int i=20;
    }

        public static void main(String[] args) {
            Outer obj= new Outer();
            System.out.println(obj.i);

            // inner obj1= new Outer().new inner();  //static variable
            //inner obj1 = obj.new inner();
            System.out.println(inner.i);

        }

}
