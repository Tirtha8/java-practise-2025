import java.util.LinkedList;
import java.util.Queue;

public class BinaryNums {
    public static void generateBinary(int n) throws InterruptedException{
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 1; i <= n; i++) {
            String s = q.poll();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        generateBinary(10); // 1 10 11 100 101
    }
}
