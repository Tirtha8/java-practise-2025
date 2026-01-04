import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReadWriteLock;

public class LearnMultiThread extends Thread {

    // // Create two threads that print numbers from 1 to 5 simultaneously.
    // public void run(){
    //     for (int i = 1; i <= 5; i++) {
    //             System.out.println(Thread.currentThread().getName() + " : " + i);
    //         }
    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th1 = new LearnMultiThread();
    //     LearnMultiThread th2 = new LearnMultiThread();
    //     th1.start();
    //     th2.start();
    // }

    // // Demonstrate how to set and get the name of a thread.
    // public void run(){
    //     System.out.println(Thread.currentThread().getName());
    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    //     th.setName("tirtha-thread");
    //     th.start();
    // }

    // // program to set different priorities for threads and observe execution order.
    // public void run(){
    //     int i=1;
    //     while(i<=20)
    //     System.out.println(Thread.currentThread().getName() + ":" + i++);
    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th1 = new LearnMultiThread();
    //     th1.setName("tirtha-thread - max");
    //     th1.setPriority(10);

    //     LearnMultiThread th2 = new LearnMultiThread();
    //     th2.setName("tirtha-thread - avg");
    //     th2.setPriority(5);

    //     LearnMultiThread th3 = new LearnMultiThread();
    //     th3.setName("tirtha-thread - min");
    //     th3.setPriority(1);

    //     th1.start();
    //     th2.start();
    //     th3.start();
    // }

    // //Create a thread that prints numbers with a 1-second delay using Thread.sleep()
    // public void run(){
    //     int x = 1;
    //     while (x < 10){
    //         try {
    //             Thread.sleep(1000);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //         System.out.println(x++);
    //     }
    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    //     th.start();
    // }

    // // - Show how one thread waits for another to finish using join()
    // public void run(){
    //     for(int i=0; i<10; i++){
    //         System.out.println(Thread.currentThread().getName() + ":" + i);
    //     }
    // }
    // public static void main(String[] args) throws InterruptedException {
    //     LearnMultiThread th1 = new LearnMultiThread();
    //     LearnMultiThread th2 = new LearnMultiThread();
    //     th2.start();
    //     th2.join();
    //     th1.start();
    // }

    // // Create a daemon thread that runs in the background while the main thread executes.
    // public static void main(String[] args) {
        
    //     Thread daemon = new Thread(() -> {
    //         while (true) System.out.println("Daemon running");
    //     });
    //     daemon.setDaemon(true);
    //     daemon.start();
    //     System.out.println("Main thread ends");
    // }

    // // - Write a program to print the state (NEW, RUNNABLE, TERMINATED) of a thread at different points
    // public static void main(String[] args) throws InterruptedException {
    //     LearnMultiThread th = new LearnMultiThread();
    //     System.out.println("inside 1st print statement -" + th.getState());
    //     th.start();
    //     System.out.println("inside 2nd print statement -" +th.getState());
    //     System.out.println("inside 3rd print statement -" +th.getState());
    // }


    // // - Write a program where two threads increment a shared counter. Use synchronized to avoid race conditions.
    // int counter = 0;
    // void synchronized incCounter(){
    //     counter++;
    // }
    // public static void main(String[] args) throws InterruptedException {
    //     LearnMultiThread obj = new LearnMultiThread();
    //     Runnable task = () -> {
    //         for(int i=0; i<1000; i++)
    //             obj.incCounter();
    //     };
    //     Thread th1 = new Thread(task);
    //     Thread th2 = new Thread(task);
    //     th1.start();
    //     th2.start();
    //     th1.join();
    //     th2.join();
    //     System.out.println("Counter: " + obj.counter);
    // }


    // // Demonstrate synchronization using a block instead of a method.
    // int counter = 0;
    // void  incCounter(){
    //     synchronized(this){
    //         counter++;
    //     }
    // }


    // // Create two threads that cause a deadlock by trying to lock two resources in opposite order.
    // public static void main(String[] args) {
    //     LearnMultiThread ob1 = new LearnMultiThread();
    //     LearnMultiThread ob2 = new LearnMultiThread();
    //     Thread th1 = new Thread(()->{
    //         synchronized(ob1){
    //             try {
    //                 Thread.sleep(100);
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //             synchronized(ob2){
    //                 System.out.println("Thread 1 completed");
    //             }
    //         }
    //     });
    //     Thread th2 = new Thread(()->{
    //         synchronized(ob2){
    //             try {
    //                 Thread.sleep(100);
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //             synchronized(ob1){
    //                 System.out.println("Thread 1 completed");
    //             }
    //         }
    //     });
    //     th1.start();
    //     th2.start();
    // }

    // // Modify the above program to avoid deadlock using proper lock ordering.
    // // Always lock in same order in a program
    // synchronized (lock1) {
    //      synchronized (lock2) {
    //          System.out.println("Safe execution");
    //      }
    // }
}


// - ReentrantLock
// Use ReentrantLock instead of synchronized to protect a shared resource.
// - ReadWriteLock
// Demonstrate ReadWriteLock where multiple readers can access but only one writer at a time.
// - Thread Pool (ExecutorService)
// Submit multiple tasks to an ExecutorService and process them concurrently.
// - Callable & Future
// Write a program using Callable that returns a result, and retrieve it using Future.
// - CountDownLatch / CyclicBarrier
// Demonstrate how multiple threads can wait for each other using CountDownLatch or CyclicBarrier.

    // Implement a producer-consumer problem using wait() and notify().
// public class ProducerConsumerDemo {
//     public static void main(String[] args) throws InterruptedException {
//         Shared shared = new Shared();
        
//         Thread producerThread = new Thread(new Producer(shared));
//         Thread consumerThread = new Thread(new Consumer(shared));
        
//         producerThread.start();
//         consumerThread.start();
        
//     }
// }

// class Shared{
//     private int data=0;
//     private boolean available = false;
    
//     public synchronized void produce(int value) throws InterruptedException{
//         while(available)
//             wait();
//         data = value;
//         available = true;
//         System.out.println("Produced: " + data);
//         notify();
//     }
//     public synchronized void consume() throws InterruptedException{
//         while(!available)
//             wait();
//         System.out.println("consumed: " + data);
//         available = false;
//         notify();
//     }
    
// }
// class Producer implements Runnable{
//     private Shared shared;
//     Producer(Shared shared){
//         this.shared = shared;
//     }
//     public void run(){
//         try{
//             for(int i=1; i<=5; i++){
//                 shared.produce(i);
//                 Thread.sleep(500);
//             }
//         }
//         catch(InterruptedException ex){
//              Thread.currentThread().interrupt();
//         }
//     }
// }
// class Consumer implements Runnable{
//     private Shared shared;
//     Consumer(Shared shared){
//         this.shared = shared;
//     }
//     public void run(){
//         try{
//             for(int i=1; i<=5; i++){
//                 shared.consume();
//                 Thread.sleep(500);
//             }
//         }
//         catch(InterruptedException ex){
//              Thread.currentThread().interrupt();
//         }
//     }
// }





    // public void run(){

    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    // }


    // public void run(){

    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    // }


    // public void run(){

    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    // }


    // public void run(){

    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    // }


    // public void run(){

    // }
    // public static void main(String[] args) {
    //     LearnMultiThread th = new LearnMultiThread();
    // }


    
}

