package thiskeyword;

/**this keyword is used to refer current class instance variable
 *  2. this is used to refer current class method
 *  * 3. this is used to call current class constructor
 *  * 4. this is used to pass argument as in method
 */
public class ThisKeywordDemo {
    int id;
    String name;
    String address;
      public ThisKeywordDemo(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
        //without using this keyword output will be the = 0 null null
      }
    ThisKeywordDemo(){
        this(1,"Om","Mumbai");
    }

    public void show(A a){
        System.out.println("In show");
    }

//    public void display(){
//        A a = new A();
//        this.show(a);
//    }
    public static void main(String[] args) {
        ThisKeywordDemo obj =new ThisKeywordDemo(1,"shraddha","pune");
        System.out.println(obj.id+obj.name+obj.address);
    }
}
class A{

    public void display(){
        ThisKeywordDemo obj1 = new ThisKeywordDemo();

        obj1.show(this);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }

}
