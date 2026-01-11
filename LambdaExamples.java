import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExamples {
    public static void main(String[] args) {
        
        // String[] names = {"Tirtha", "Akash", "Arnab", "Siddhant"};

        // // sort the list
        // List<String> names = Arrays.asList("Banana", "Apple", "Mango");
        // names.sort((s1, s2) -> s1.compareTo(s2));
        // System.out.println(names);

        // //flatten the list of list -> list
        List<List<Integer>> lists = Arrays.asList(
            Arrays.asList(1,2),
            Arrays.asList(3,4),
            Arrays.asList(5,6),
            Arrays.asList(7,8),
            Arrays.asList(9,10)
        );
        // List<Integer> newList = lists.stream()
        //     // .flatMap(list -> list.stream())
        //     .flatMap(List::stream)
        //     .collect(Collectors.toList());

        // without stream()
        List<Integer> newList = new ArrayList<>();
        // lists.forEach(subList -> newList.addAll(subList));
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext())
            newList.addAll(iterator.next());
        System.out.println(newList);


        

    }
}
