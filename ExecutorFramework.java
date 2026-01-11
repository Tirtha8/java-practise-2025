import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new MyTask());
        executor.submit(new MyTask());
        executor.submit(new MyTask());
        executor.shutdown();
    }
}
class MyTask implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Running a thread : " + Thread.currentThread().getName());
    }
}
