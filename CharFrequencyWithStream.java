import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharFrequencyWithStream {
    public static void main(String[] args) {
        
        String input = "Tirtha Ghosh";

        Map<Character, Long> map = input.toLowerCase().chars()
                            .mapToObj(c -> (char)c)
                            .filter(c -> !Character.isWhitespace(c))
                            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}
