package arrays;

public class FindMinAndMax {
    /**
     * Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.
     *
     * Examples:
     *
     * Input: arr[] = {3, 5, 4, 1, 9}
     * Output: Minimum element is: 1
     *               Maximum element is: 9
     *
     * Input: arr[] = {22, 14, 8, 17, 35, 3}
     * Output:  Minimum element is: 3
     *
     *  Maximum element is: 35*/
    public static void main(String[] args){

        Pair minMax = findMinMax(new int[]{});
        System.out.print("Min is " + minMax.min + " Max element is " + minMax.max);

    }

    private static Pair findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int length = arr.length;


        //edge cases
        //if array is of size 1.
        if(length < 1){
            return new Pair(0,0);
        }
        if(length == 1){
            return new Pair(arr[0],arr[0]);
        }


        int left = 0;
        int right = length - 1;

        while(left < right){

            if(arr[left] < min){
                min = arr[left];
            }
            if(arr[left] > max){
                max = arr[left];
            }

            if(arr[right] < min){
                min = arr[right];
            }
            if(arr[right] > max){
                max = arr[right];
            }
            left++;
            right--;
        }
        return new Pair(min,max);
    }
}
class Pair{
    int min;
    int max;
    Pair(int min,int max){
        this.min = min;
        this.max = max;


    }

}
