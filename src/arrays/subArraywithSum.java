package arrays;

import java.util.Arrays;

public class subArraywithSum {
    /**
     * Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
     *
     * Note: There may be more than one subarray with sum as the given sum, print first such subarray.
     *
     * Examples:
     *
     * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
     * Output: Sum found between indexes 2 and 4
     * Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33*/
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(longestSubArraywithsum(new int[]{1, 4, 20, 3, 10, 5},33))
        );
    }

    private static int[] longestSubArraywithsum(int[] arr, int sum) {
        int start = 0;
        int end = 0;
        int currentSum = arr[0];
        int length = arr.length;
        while(end < length){
            if(currentSum == sum){
                return new int[]{start,end};
            }
            else if (currentSum < sum){
                end++;
                if(end < length){
                    currentSum += arr[end];
                }
            }
            else{
                currentSum -= arr[start];
                start++;
            }
        }


        return new int[]{start,end};


    }


}
