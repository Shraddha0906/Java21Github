package inheritance;

public class Teacher {  //member variable
    int id;
    String name;
    String address;

public void show(){
    System.out.println("it is teacher");
}
  }
 class MathsTeachers extends Teacher{
     public static void main(String[] args) {
       MathsTeachers obj = new MathsTeachers();
       obj.id=1;
       obj.name="shraddha";
       obj.address= "pune";
       obj.show();
         System.out.println("id=> "+obj.id+ " name="+obj.name+ " address"+obj.address);

     }
 }
 class PhysicsTeacher extends MathsTeachers{

     public static void main(String[] args) {
         PhysicsTeacher obj=new PhysicsTeacher();
         obj.id=1;
         obj.name="asmita";
         obj.address= "mumbai";
         System.out.println("id=>"+obj.id+ "name="+obj.name+ "address"+obj.address);
     }
 }
 class chemistryTeacher extends MathsTeachers{
     public static void main(String[] args) {
         chemistryTeacher obj = new chemistryTeacher();
         obj.id=1;
         obj.name="riya";
         obj.address= "mumbai";

         System.out.println("id=> "+obj.id+ " name="+obj.name+ " address="+obj.address);
     }
 }
