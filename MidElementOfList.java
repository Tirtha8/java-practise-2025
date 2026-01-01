import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MidElementOfList {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Iterator<Integer> fast = list.iterator();
        Iterator<Integer> slow = list.iterator(); 

        Integer mid = null;

        while(fast.hasNext()){
            mid = slow.next();
            fast.next();
            if(fast.hasNext())
                fast.next();
        }

        System.out.println("Mid element is " + mid);

    }
}
