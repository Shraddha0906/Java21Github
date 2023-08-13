package abstraction;
/*
abstraction- hiding details and show fuctiona
lity
 */
public class Football implements Sports,Sports2{
    @Override
    public void play() {
        System.out.println("example of abstraction");
    }


    public static void main(String[] args) {
        Football obj= new Football();
        obj.play();
        obj.exercise();
    }

    @Override
    public void exercise() {
        System.out.println("method of sport2");
    }
}
