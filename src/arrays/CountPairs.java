package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    /**
     * Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.
     *
     * Examples:
     *
     * Input:  arr[] = {1, 5, 7, -1}, sum = 6
     * Output:  2
     * Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
     *
     * Input:  arr[] = {1, 5, 7, -1, 5}, sum = 6
     * Output:  3
     * Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5). */
    public static void main(String[] args) {
        findCount(new int[]{1, 5, 7, -1, 5},6);
    }

    private static void findCount(int[] arr, int sum) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int item :arr) {
            if (map.containsKey(sum  - item)){
                int x = map.get(item);
                map.put(item,x + 1);
            }else{
                map.put(item,1);
            }

        }
    }
}
