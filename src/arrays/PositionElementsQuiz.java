package arrays;

import java.util.Arrays;

/**
 * Rem we are considering whether the position is even or odd
 * A[i] >= A[i-1]                     ,
 * if i is even,  ∀ 1 <= i < n
 * A[i] <= A[i-1]                     , if i is odd ,  ∀ 1 <= i < n
 * Print the resultant array.
 *
 * Examples :
 *
 * Input : A[] = {1, 2, 2, 1}
 * Output :  1 2 1 2
 * Explanation :
 * For 1st element, 1  1, i = 2 is even.
 * 3rd element, 1  1, i = 4 is even.
 *
 * Input : A[] = {1, 3, 2}
 * Output : 1 3 2
 * Explanation :
 * Here, the array is also sorted as per the conditions.
 * 1  1 and 2 < 3.**/
public class PositionElementsQuiz {
    public static void main(String[] args) {
        positionTheArray(new int[]{1, 2, 2, 1});
        //positionTheArray(new int[]{1, 3, 2});
    }

    private static void positionTheArray(int[] arr) {
        int length = arr.length;

        for (int i = 1; i <length; i++){

            // if index is even
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1]) {

                    // swap two elements
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

            // if index is odd
            else {
                if (arr[i] < arr[i - 1]) {

                    // swap two elements
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
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
