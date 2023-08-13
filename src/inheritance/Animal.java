package inheritance;

import javax.swing.event.AncestorEvent;
/*
    run time polymorphism,late binding,dynamic
 */
public class Animal {
    public void sound(){
        System.out.println("Animal sound");
    }
}
class cat extends Animal{
    @Override
    public void sound() {//concreate
        System.out.println("in cat sound");

    }

    public static void main(String[] args) {
        cat obj= new cat();
        obj.sound();
    }
}


