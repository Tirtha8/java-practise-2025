import java.util.Arrays;
import java.util.Map;

import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<String, Long> frequencyMap = Arrays.stream(str.toLowerCase().split(""))
                .filter( s -> !s.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequencyMap.entrySet().forEach(System.out::println);
    }
}
    
