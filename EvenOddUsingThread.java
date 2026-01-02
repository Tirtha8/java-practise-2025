public class EvenOddUsingThread implements Runnable{

    private static Object object;

    EvenOddUsingThread(Object obj){
        this.object = obj;
    }

    public static void main(String[] args) {
        Object obj = new Object();
        Runnable th1 = new EvenOddUsingThread(obj);
        Runnable th2 = new EvenOddUsingThread(obj);
        new Thread(th1, "Odd").start();
        new Thread(th2, "Even").start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1; i<=100; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
