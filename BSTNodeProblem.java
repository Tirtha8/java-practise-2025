import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSTNodeProblem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        BSTNode root1 = null;
        while(true){
            int num = sc.nextInt();
            if(num == -1)
                break;
            else if(root1 == null){
                root1 = new BSTNode(num);
            }
            else 
                root1.insert(num);
        }

        BSTNode root2 = null;
        while(true){
            int num = sc.nextInt();
            if(num == -1)
                break;
            else if(root2 == null){
                root2 = new BSTNode(num);
            }
            else 
                root2.insert(num);
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        root1.inOrder(list1);
        root2.inOrder(list2);

        sc.close();

        
    }
}

class BSTNode{
    int value;
    BSTNode left, right;

    BSTNode(int value){
        this.value = value;
        left = null;
        right = null;
    }

    void insert(int num){
        if(num<value){
            if(left == null) 
                left = new BSTNode(num);
            else 
                left.insert(num);
        }
        else{
            if(right == null) 
                right = new BSTNode(num);
            else 
                right.insert(num);
        }
    }

    void inOrder(List<Integer> list){
        if(left!= null)
            left.inOrder(list);
        list.add(value);
        if(right!=null)
            right.inOrder(list);
        System.out.println(list);
    }
}