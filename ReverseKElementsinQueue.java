import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsinQueue {
    
    public static void reverseKElements(Queue<Integer> queue, int k ){
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<k; i++){
            stk.push(queue.poll()); // queue  = [40, 50]
        }
        while(!stk.isEmpty()){
            queue.add(stk.pop());   //queue = [40, 50, 30, 20, 10]
        }
        for(int i=0; i<queue.size()-k; i++){
            queue.add(queue.poll());
        }
    }
    
    public static void main(String[] args) {
    
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        reverseKElements(q, 4);
        q.forEach(System.out::println);

    }
}
