package SearchAlgos.IntervalSearch;
/**
 * Time complexity O(log n base 3)
 *
 * Binary search Vs Ternary Search
 * The time complexity of the binary search is more than  the ternary search,
 * but it does not mean that ternary search is better. In reality,
 * the number of comparisons in ternary search much more which makes it slower than binary search.
 *
 * */
public class TertiarySearch {
    public static void main(String[] args) {
        if(doTertiarySearch(new int[]{1,2,3,4,5,6,7,8,9,10,23,34,46,57},23)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");

        }
    }

    private static boolean doTertiarySearch(int[] ints, int key) {
        int start = 0;
        int end = ints.length - 1;
        int count = 0;
        while (start <= end){
            System.out.println(count++);
            int mid1 = start +(end -start)/3;
            int mid2 = end - (end - start)/3;

            if(ints[mid1] == key){
                return true;
            } else if(ints[mid2] == key){
                return true;
            } else if(key < ints[mid1]   ){
                end = mid1 - 1;
            }
            else if( key > ints[mid2]  ){
                start = mid2 + 1;
            } //it's between the two
            else{
                start = mid1 + 1;
                end = mid2 -1;
            }
        }

        return false;
    }
}
