package multithreading;

public class YieldDemo  {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();                         //Stop
                for (int i =1; i<=5; i++){
                    System.out.println("In t1 Method");
                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=5;i++){
                    System.out.println(" In t2 Method");
                }
            }
        });
        t1.start();
        t2.start();
    }

}
