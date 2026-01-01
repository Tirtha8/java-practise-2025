public class DetectLoopInLL {

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println("Result: " + hasLoop(a));        
    }

    static boolean hasLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        next = null;
    }
}