import java.util.*;

public class practise {
    public static void main(String[] args) {
        
        //remove duplicates from sorted array and return length
        // int[] nums = {1,1,2,2,3};
        // int len = removeDuplicates(nums);
        // System.out.println(len);

        //move zeroes to end preserving the order
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroesToEnd(nums);



    }

    public static void moveZeroesToEnd(int[] arr){
        int index =0;
        for(int i: arr){
            if(i !=0){
                arr[index++] = i;
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    // public static int removeDuplicates(int[] arr){
    //     int index =1;
    //     for(int i=1; i<arr.length; i++){
    //         if(arr[i] != arr[i-1]){
    //             arr[index++] = arr[i];
    //         }
    //     }
    //     return index;
    // }
}
