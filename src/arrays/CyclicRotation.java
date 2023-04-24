package arrays;

import java.util.Arrays;

public class CyclicRotation {
    /**
     * Given an array, cyclically rotate the array clockwise by one.
     *
     * Examples:
     *
     * Input:  arr[] = {1, 2, 3, 4, 5}
     * Output: arr[] = {5, 1, 2, 3, 4}*/
    public static void main(String[] args) {
        rotationByOne(new int[] {1, 2, 3, 4, 5});
    }

    private static void rotationByOne(int[] arr) {
        int length = arr.length;
        int temp = arr[length - 1];
        for(int i = length - 1 ; i > 0 ; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));


    }
}
