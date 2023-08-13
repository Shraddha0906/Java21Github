package encapsulation;

public class EncapsulationDemo {
    int id ;
    String name;

    String address;
    void SetId(int id)
    { if(id>0){
        id =id;

    }else{
        System.out.println("id is is 0");
    }
    }
    public void setName(String str){
        name=str;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    public static void main(String[] args) {
        EncapsulationDemo obj= new EncapsulationDemo();
        obj.id= 1;
        obj.name="shraddha";
        obj.address="pune";

        System.out.println(obj.getId() + obj.getName());
    }
}




