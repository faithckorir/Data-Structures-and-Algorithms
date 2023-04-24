package arrays;

import java.util.Arrays;

public class SegregateOddAndEven {
    public static void main(String[] args) {
        segregate(new int[]{1, 3, 2, 4, 7, 6, 9, 10});
        usingLomutoPartition(new int[]{1, 3, 2, 4, 7, 6, 9, 10});
    }

    private static void usingLomutoPartition(int[] arr) {
        //learn Lomuto Partition.
        int i = -1;
        int n = arr.length;

        for(int j = 0; j < n ; j++ ){
            if(arr[j] % 2 == 0){
                i++;
                doSwap(arr,i,j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * use this when order is not a must
     */

    private static void segregate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] % 2 == 0) {
                start++;
            } else if (arr[end] % 2 != 0) {
                end--;
            } else {
                doSwap(arr, start, end);
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
