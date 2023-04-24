package arrays;

import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    /**
     * Count number of occurrences (or frequency) in a sorted array

     *
     * Given a sorted array arr[] and a number x,
     * write a function that counts the occurrences of x in arr[].
     * Expected time complexity is O(Logn)
     *
     * Examples:
     *
     *   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
     *   Output: 4 // x (or 2) occurs 4 times in arr[]
     *
     *   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
     *   Output: 1
     *
     *   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
     *   Output: 2
     *
     *   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
     *   Output: -1 // 4 doesn't occur in arr[] */
    public static void main(String[] args) {
        int n = findFrequencyMap(new int[]{1, 1, 2, 2, 2, 2, 3,},2);
        int count = findFrequencyByCount(new int[]{1, 1, 2, 2, 2, 2, 3,},2);
        System.out.println(count);
    }

    private static int findFrequencyByCount(int[] arr, int i) {
    int count = 0;
    int left = 0;
    int length = arr.length;
    int right = length - 1 ;

    while(left <= right){
        if(arr[left] == i){
            count ++;
        }
        if (left != right && arr[right] == i) { // skip double counting the middle element
            count++;
        }
        right--;
        left++;

    }

        return count;
    }

    private static int findFrequencyMap(int[] arr, int i) {

        Map hashMap = new  HashMap<Integer,Integer>();

        for (int item: arr) {

            if (hashMap.containsKey(item)) {
                Integer count = (Integer) hashMap.get(item);
                hashMap.put(item, count + 1);
            } else {
                hashMap.put(item,1);
            }

        }

        return (int) hashMap.get(i);

    }
}
