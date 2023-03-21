package arrays;

import java.util.Scanner;

public class ReverseArray {
    /**
     * Given an array (or string), the task is to reverse the array/string.
     * Examples :
     *
     *
     * Input  : arr[] = {1, 2, 3}
     * Output : arr[] = {3, 2, 1}
     *
     * Input :  arr[] = {4, 5, 1, 2}
     * Output : arr[] = {2, 1, 5, 4}
     * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //size of the array
        System.out.println("Enter size of the array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter " + i + " element of the array");

            arr[i] = scanner.nextInt();
        }
        scanner.close();

        reverseArray(arr);


    }
    private static void reverseArray(int[] arr){
        //if asked to print the items
        //printReverse(arr);

        //if swapping the array in is required
        reverseBySwapping(arr);

    }

    private static void reverseBySwapping(int[] arr) {
        int length = arr.length;
        int right = length - 1;
        int left = 0;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        printArray(arr);
    }

    private static void printReverse(int[] arr){
       int right = arr.length - 1;
       while(right >= 0){
           System.out.print(arr[right]);
           right --;
       }

    }
    private static void printArray(int[] arr){
       int left = 0;
       int length = arr.length;
       while(left < length){
           System.out.print(arr[left]);
           left ++;
       }

    }
}
