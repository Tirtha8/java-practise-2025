import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        CompletableFuture<Integer> future = CompletableFuture
                                .supplyAsync(() -> {return 10;})
                                .thenApply(result -> result * 10);

        System.out.println(future.get());



    }
}
