import java.util.Arrays;

public class RotateArrayByKPos {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        rotateArrayByKPositions(arr, k);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotateArrayByKPositions(int[] arr, int k){
        rotateArray(arr, 0, arr.length-1);
        rotateArray(arr, 0, k-1);
        rotateArray(arr, k, arr.length-1);
    }
    public static void rotateArray(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i++]= arr[j];
            arr[j--] = temp;
        }
    }
}
