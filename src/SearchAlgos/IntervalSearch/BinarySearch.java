package SearchAlgos.IntervalSearch;
/**
 * The idea is  subdiving the array into two each time based on how the mid-array compares to the search term.
 * if the Mid-Array is less than search the new Array will be from mid + 1 to the end and vice versa is true.
 * space complexity - O(1)
 * time complexity - O(log n)
 * Binary Search assumes that the data is sorted.
 * Data does not have a complex structure or relationship
 * The data is stored in contigous memory
 *Large sorted data set.

 * Here to calculate “mid” we are doing the following:
 *
 * int mid = low + (high – low)/2;
 *
 * Maybe, you wonder why we are calculating the middle index this way, we can simply add the lower and higher index and divide it by 2 like
 *
 * int mid = (low + high)/2;
 *
 * But if we calculate the middle index like this, it fails for larger values of int variables.
 * Specifically, it fails if the sum of low and high is greater than
 * the maximum positive int value(231 – 1 ). The sum overflows to a
 * negative value and the value stays negative when divided by 2.
 *
 * So it’s better to calculate “mid” in the way it is done in the above code.
 * */
public class BinarySearch {

    public static void main(String[] args) {
        if(doBinarySearch(new int[]{1,2,3,4,5,6,7,8,9,10,23,34,46,57},23)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");

        }
    }

    private static boolean doBinarySearch(int[] ints, int key) {
        int start = 0;
        int end = ints.length -1;
        int count = 0;

        while(start <= end){
            System.out.println(count++);

            int mid = start + (end - start)/2;
            if(ints[mid] == key){
                return true;
            }
            else if(ints[mid] < key){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
