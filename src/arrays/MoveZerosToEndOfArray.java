package arrays;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        moveZeros(new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0});
    }

    private static void moveZeros(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            if (arr[start] != 0){
                start++;
            }else if (arr[end]== 0){
                end--;
            }else{
                doSwap(arr,start,end);
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void doSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
