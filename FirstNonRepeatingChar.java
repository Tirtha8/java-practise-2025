import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    
    public static void main(String[] args) {
        
        String str = "tttiiirttthhhaaa";

        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toLowerCase().toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() == 1)
               System.out.println(e.getKey());
        }
        // System.out.println("_");
    }
}
