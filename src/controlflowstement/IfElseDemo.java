package controlflowstement;

public class IfElseDemo {
    public static void main(String[] args) {

       // Nested if
        int i=19;
         String nationality= "Indian";
        if (i>=18){
            if (nationality.equals("Indian") )               //nationality =="Indian"
            System.out.println("you Can Vote");
        }
        else {
            System.out.println("you can not vote");
        }

        //ladder if else
         int a=10 ,b= 20,c=30;
        if (a>b && a>c){
            System.out.println("a is the greater ");
        }
        else if (b>c){
            System.out.println("b is the greater ");
        }
        else {
            System.out.println("C is greater");
        }

        int age1=19;
        String str= age1>=18?"you can vote":"you cannot vote";
        System.out.println(str);
    }
}
