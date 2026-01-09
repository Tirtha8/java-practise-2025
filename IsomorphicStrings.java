import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char cs = s.charAt(i), ct = t.charAt(i);
            if(map.containsKey(cs)){
                if(map.get(cs) != ct){
                    return false;
                }
            }
            else{
                if(set.contains(ct))
                    return false;
                else{
                    map.put(cs, ct);
                    set.add(ct);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        String s = "paper";
        String t = "tiger";
        System.out.println(isIsomorphic(s,t));
    }
}
