package inheritance;

public class inheritance { //parent class, base class, super class
    int id;
    String name;



}

    class employee extends inheritance{//child class,derived class,sub class

        public static void main(String[] args) {
            employee obj = new employee();
            obj.id=1;
            obj.name= "shraddha";
            System.out.println("id="+obj.id + " name=" +obj.name);
        }
}
class customer extends inheritance{
    public static void main(String[] args) {
        customer obj = new customer();
        obj.id=1;
        obj.name= "shraddha";
        System.out.println("id="+obj.id + " name=" +obj.name);
    }
}
