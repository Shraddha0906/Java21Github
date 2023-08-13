package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run");
               // System.out.println(Thread.currentThread().getName());   //find the thread name in run  method
            }
        });
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
        t1.setName("Th-0");         //set thread name
        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run 2");
            }
        });
        t2.start();
        t2.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.isAlive());

    }
}
