package arrays;

import java.util.Arrays;

public class PrintSecondLargest {
    public static void main(String[] args) {

       // int secondLargest = getSecondLargest(new int[]{12, 13, 1, 10, 34, 1});
        int secondLargest = getSecondLargestViaSorting(new int[]{12, 13, 1, 10, 34, 1});
        System.out.print(secondLargest);

    }

    private static int getSecondLargestViaSorting(int[] ints) {
        //implemented using quicksort so nlogn
        Arrays.sort(ints);
        return ints[ints.length - 2];
    }

    private static int getSecondLargest(int[] ints) {
        int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
        for (int item : ints) {
            if (item > first){
                second = first;
                first = item;
            } else if(item > second){
                second = item;
            }
        }

        return  second;
    }
}
