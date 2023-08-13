package multithreading;

public class InterruptDemo {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                    for (int i=1; i<=40;i++){
                        System.out.println("In t1 Method");
                    }
                }catch (InterruptedException e){
               throw new RuntimeException(e);
                }

            }
        });
        t1.start();
        t1.interrupt();
        t1.isInterrupted();

        System.out.println("In main method");
    }
}
