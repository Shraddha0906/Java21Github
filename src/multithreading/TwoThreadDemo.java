package multithreading;

public class TwoThreadDemo {


    public static void main(String[] args) throws InterruptedException {
        Thread obj= new Thread(() ->{      //one method
            for (int i=0;i<5;i++){
                System.out.println("hii");

            }

        });
        Thread obj1= new Thread(() ->{
            for (int i=0;i<5;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }

        });
        obj.start();
        obj1.start();

        obj.join();
     obj1.join();
        System.out.println("Exit");
    }

}
