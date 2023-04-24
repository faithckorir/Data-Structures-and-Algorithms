package arrays;

import java.util.Arrays;

public class PrintThreeLargestElements {
    public static void main(String[] args) {
        //int[] largest = getThreeLargest(new int[]{12, 13, 1, 10, 34, 1});
        int[] largest = getLargestFromSorted(new int[]{12, 13, 1, 10, 34, 1});
        System.out.println(Arrays.toString(largest));

    }
    /**
     * First sort the arrays n log n as it uses quicksort
     * fetch the last three elements
     * */

    private static int[] getLargestFromSorted(int[] ints) {
        Arrays.sort(ints);
        int length = ints.length;

        return new int[]{ints[length - 1],ints[length - 2],ints[length - 3]};
    }
    /**
     * Loop through the array making comparison
     * 0(n)
     * */

    private static int[] getThreeLargest(int[] ints) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int item : ints) {
            if (item > first) {
                third = second;
                second = first;
                first = item;
            } else if (item > second) {
                third = second;
                second = item;
            } else if (item > third) {
                third = item;
            }
        }
        return new int[]{first, second, third};
    }
}
