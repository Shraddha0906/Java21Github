package multithreading;

public class MultiThreadingDemo extends Thread{

    public void run(){
        System.out.println("In run Method");
       // System.out.println(Thread.currentThread().getName());   //thread-0
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());   //main thread
        MultiThreadingDemo obj = new MultiThreadingDemo();
        obj.start();
    }
}

