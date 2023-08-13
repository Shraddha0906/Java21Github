package multithreading;

public class StaticSynchronized {
    static int num;                       //Class Level Lock
    public  void counter() {
        synchronized (this) {
            num++;                 //lock the block  using synchronized
        }
    }
    public static void main(String[] args) throws InterruptedException {
          StaticSynchronized obj = new StaticSynchronized();
           StaticSynchronized obj1= new StaticSynchronized();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=2000;i++){
                    obj.counter();
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=2000;i++){
                    obj1.counter();
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();


        System.out.println(num);



    }
}
