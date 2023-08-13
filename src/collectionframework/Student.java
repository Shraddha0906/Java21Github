package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public  int id ;
     public String Name= " ";
    public String Address =" ";
    public Student(int id1,  String Name1, String Address1){
        this.id=id1;
        this.Name =Name1;
        this.Address=Address1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter The Student Details");
        int numberOfInput= scanner.nextInt();
        ArrayList<Student>studentList=new ArrayList<Student>();

        for (int i=0; i<numberOfInput; i++){
           System.out.println("Please Enter  student Id");
           int id= scanner.nextInt();
            System.out.println("Enter The Name");
            String Name= scanner.next();
            System.out.println("Enter Address");           String Address= scanner.next();

            Student std= new Student(id,Name,Address);
            studentList.add(std);
        }
            for(Student std : studentList ){
                System.out.println(std.toString());


    }
}
     }

