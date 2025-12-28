
import java.util.*;

// find the maximum product that can be achieved from any contiguous subarray.

class LongestSubstringWithoutRepeating{

    // static int maxProdFromContSubArray(int[] array){

    //     int maxSoFar = array[0];
    //     int maxEndingHere = array[0];
    //     int minEndingHere = array[0];

    //     for(int i=1; i<array.length; i++){
    //         int current =  array[i];

    //         if(current<0){
    //             int temp = maxEndingHere;
    //             maxEndingHere = minEndingHere;
    //             minEndingHere = temp;
    //         }

    //         maxEndingHere = Math.max(maxEndingHere, maxEndingHere*current);
    //         minEndingHere = Math.min(minEndingHere, minEndingHere*current);
    //         maxSoFar = Math.max(maxEndingHere, maxSoFar);
    //     }

    //     return maxSoFar;
    // }


    static String longestSubstringWithoutRepeating(String str){

        // char[] charr = str.toLowerCase().toCharArray();
        // String newStr = "";
        // int maxSize = 0;
        // HashMap<Character, Integer> map = new HashMap<>(); 

        // for(int i=0; i<str.length(); i++){
        //     newStr = newStr + str.charAt(i);
        //     for(int j=i+1; j<str.length(); j++){
        //         if(map.get(str.charAt(j)) != j){
        //             map.put(str.charAt(j), j);
        //             break;
        //         }

        //         newStr
        //     }
        // }

        for(int i=0; i<str.length(); i++){
            String sub = "";
            for(int j=i; j<str.length(); j++){
                sub = sub + str.charAt(j);
                System.out.println(sub);
            }
        }

        return "newStr";
    }


    public static void main(String[] args) {

        // int[] array = new int[]{1, -3, 2, 4, 3};
        // int res = maxProdFromContSubArray(array);

        String str = "abcabcdeab";
        String res = longestSubstringWithoutRepeating(str);


        System.out.println("result : " + res);
    }
}