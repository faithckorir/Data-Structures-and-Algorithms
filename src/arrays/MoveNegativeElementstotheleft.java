package arrays;

import java.util.Arrays;

public class MoveNegativeElementstotheleft {
    public static void main(String[] args) {
        shiftElements(new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9});
    }

    private static void shiftElements(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] > 0 && arr[right] < 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else{
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));


    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
