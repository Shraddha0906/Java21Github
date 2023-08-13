package multithreading;
//create thread class object
public class RunnableDemo implements Runnable{
    public  void run(){
        System.out.println("in Run");
    }
    public static void main(String[] args) {
       RunnableDemo obj= new RunnableDemo();
       Thread thread= new Thread(obj);         //thread object
       thread.start();
    }
}


/**
 * Life cycle-
 *           1.New-before the invocation Thread.Start()
 *           2.Runnable - After the invocation of thread.Start method
 *                          and thread  scheduler is not selected in running thread
 *           3.Running - thread scheduler is selected and running thread
 *           4.Blocking - thread wait and sleep state
 *           5.Terminated -thread execution or stop()
 *
 *
 */