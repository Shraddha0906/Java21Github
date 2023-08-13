package inheritance;
//e.g- method overloading - a class have same method name with different number of argument

/*
rule- 1. changing number of argument
      2.changing type of argument
       compile time polymorphism,easy binding,static
 */
public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
      obj.add(3,7);
      obj.add(3,7,5);
    }
    public void add(int i,int j){
        System.out.println(i+j);

    }
    public  void add(int i,int j ,int z){
        System.out.println(i+j+z);
    }
}

