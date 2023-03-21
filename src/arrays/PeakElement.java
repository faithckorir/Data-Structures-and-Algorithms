package arrays;

public class PeakElement {
    /**
     * Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.
     * <p>
     * Note: For corner elements, we need to consider only one neighbor.
     * <p>
     * Example:
     * <p>
     * Input: array[]= {5, 10, 20, 15},
     * Output: 20
     * Input: array[]= {10, 20, 30, 40, 50},
     * Output: 20
     * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
     */
    public static void main(String[] args) {
        findPickElement(new int[]{10, 20, 30, 40, 50});
    }

    private static void findPickElement(int[] arr) {
        if(arr.length == 1){
            System.out.println(arr[0]);
            return;
        }
        if(arr[0] > arr[1]){
            System.out.println(arr[0]);
            return;
        }
        if(arr[arr.length - 1] > arr[arr.length - 2]){
            System.out.println(arr[arr.length - 1]);
            return;
        }
        int length = arr.length - 1;
        int max = arr[arr.length - 1];
        for (int i = 1; i < length; i++) {
            int left = arr[i - 1];
            int right = arr[i + 1];
            if (arr[i] > left && arr[i] > right) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
