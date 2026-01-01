import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedListts {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(11,13,15, 17, 19));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(12,14,16, 18, 20));

        List<Integer> mergedList = new ArrayList<>();

        int i =0, j =0;

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) < list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }
            else {
                // if(list2.get(j) < list1.get(j)){
                mergedList.add(list2.get(j));
                j++;
            }
        }
        while (i<list1.size()) {
            mergedList.add(list1.get(i++));
        }
        while (j<list2.size()) {
            mergedList.add(list2.get(j++));
        }

        System.out.println(mergedList);

    }
}
