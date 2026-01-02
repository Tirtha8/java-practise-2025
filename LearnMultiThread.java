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


    public void run(){

    }
    public static void main(String[] args) {
        LearnMultiThread th = new LearnMultiThread();

        Thread daemon = new Thread(() -> {
            while (true) System.out.println("Daemon running");
        });
        daemon.setDaemon(true);
        daemon.start();
        System.out.println("Main thread ends");
    }


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

