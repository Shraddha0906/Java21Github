package abstraction;

public class Cricket extends AbstractSports{
    @Override
    public void absPlay() {
        System.out.println("in abs play");
    }

    @Override
    public void exercise() {
        System.out.println("in exercise");
    }

    public static void main(String[] args) {
        Cricket obj=new Cricket();
        obj.exercise();
        obj.absPlay();
    }
    public void play(){
        System.out.println("In play");
    }
}
