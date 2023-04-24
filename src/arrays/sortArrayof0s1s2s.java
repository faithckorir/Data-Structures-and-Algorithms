package arrays;

import java.util.Arrays;

public class sortArrayof0s1s2s {
    /**
     * Given an array A[] consisting of only 0s, 1s, and 2s.
     * The task is to write a function that sorts the given array.
     * The functions should put all 0s first, then all 1s and all 2s in last.
     *
     * This problem is also the same as the famous “Dutch National Flag problem”.
     * The problem was proposed by Edsger Dijkstra. The problem is as follows:
     *
     * Given N balls of colour red, white or blue arranged in a line in random order.
     * You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls,
     * with the order of the colours being red,
     * white and blue (i.e., all red coloured balls come first then the white coloured balls and
     * then the blue coloured balls).
     *
     * Input: {0, 1, 2, 0, 1, 2}
     * Output: {0, 0, 1, 1, 2, 2}
     *
     * Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
     * Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
     * */
    public static void main(String[] args) {

       // method1(new int[] {1, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
        method2(new int[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});

    }

    private static void method2(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                mid++;
                low++;
            } else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    private static void method1(int[] arr) {
       int count0 = 0,count1 = 0,count2 = 0;

        for (int item:arr
             ) {
            if (item == 0){
                count0++;
            }
            if (item == 1){
                count1++;
            }
            if (item == 2){
                count2++;
            }

        }

        int i = 0;

        while (count0 > 0){
            arr[i++] = 0;
            count0--;
        }
        while (count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        while (count2 > 0){
            arr[i++] = 2;
            count2--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
