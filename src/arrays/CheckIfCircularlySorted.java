package arrays;

public class CheckIfCircularlySorted {
    /**
     * Similarly, we can do the above operation for descending circularly sorted array.
     * In this case we need to consider the count of the case where, arr [i-1] < arr[i].
     * */
    public static void main(String[] args) {

        System.out.print(isCircularlyRotated(new int[]{23, 34, 45, 12, 17, 19 }));
    }

    private static boolean isCircularlyRotated(int[] arr) {

        int count = 0;
        int length = arr.length;

        for(int i = 1 ; i < length; i++){
            if(arr[i - 1] > arr[i]){
                count++;
            }
        }

        return count == 1;

    }
}
