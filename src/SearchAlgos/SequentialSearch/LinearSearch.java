package SearchAlgos.SequentialSearch;


/**
 * The elements are traversed and each element is compared with the  key.
 * the data need not be sorted.
 * Time complexity O(n).
 * Space Complexity O(1).
 * it is well suited for small data sets
 *
 * */
public class LinearSearch {
    public static void main(String[] args) {
        if (doLinearSearch(new int[]{1, 2, 3, 4, 6},8)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

    private static boolean doLinearSearch(int[] ints,int key) {
        if (ints.length == 0){
            return false;
        }
        for (int item:ints
             ) {
            if(item == key){
                return true;
            }
        }
        return false;
    }
}
