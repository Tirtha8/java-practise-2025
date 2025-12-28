import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseStringWithStream {
    
    public static void main(String[] args) {
        
        String str = "tirtha ghosh";
        String reverse = IntStream.range(0, str.length())
                                    .mapToObj(i -> str.charAt(str.length() - i -1))
                                    .map(String::valueOf)
                                    .collect((Collectors.joining()));

        String reverse2 = str.chars()
                                .mapToObj(c -> String.valueOf((char)c))
                                .reduce("", (s1, s2) -> s2+s1);

        System.out.println(reverse + " " + reverse2);                                    

    }
}
