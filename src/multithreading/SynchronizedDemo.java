package multithreading;
//use of synchronized= lock the method or block

public class SynchronizedDemo {
    int num;
    public  void counter() {
        synchronized (this) {
            num++;                 //lock the block  using synchronized
        }
    }
    public static void main(String[] args) throws InterruptedException {
    SynchronizedDemo obj = new SynchronizedDemo();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i=1; i<=2000;i++){
                obj.counter();
            }
        }
    });
    t1.start();
    // t1.join();
        System.out.println(obj.num);


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=2000;i++){
                    obj.counter();
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();


        System.out.println(obj.num);



    }

}
