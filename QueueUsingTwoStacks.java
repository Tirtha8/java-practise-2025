import java.util.Optional;
import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();
    
    void enqueue(int x){
        stk2.push(x);
    }

    int dequeue(){
        int res = 0;
        if(stk2.isEmpty())
            return -100;
        else {
            while(!stk2.isEmpty()){
                res = stk2.pop();
                // System.out.println("inside dequeue -> 1st while: popping: " + res);
                stk1.push(res);
            }
            // res = stk1.pop();
            while(!stk1.isEmpty()){
                int x = stk1.pop();
                if(x != res)
                    stk2.push(x);
            }
        }
        return res;
    }

    void traverse(){
        while(!stk2.isEmpty()){
            int res = stk2.pop();
            System.out.println(res);
            stk1.push(res);
        }
        while(!stk1.isEmpty()){
            stk1.push(stk1.pop());
        }
    }

    public static void main(String[] args) {
        
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        // queue.traverse();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
