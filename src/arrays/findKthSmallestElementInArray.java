package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class findKthSmallestElementInArray {
    /**
     * Given an array and a number K where K is smaller than the size of the array.
     * Find the K’th the smallest element
     * in the given array. Given that all array elements are distinct.
     *
     * Examples:
     *
     * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
     * Output: 7
     *
     * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4
     * Output: 10
     * */
    public static void main(String[] args) {

        //my way
        //sort the array first find item and index 2
        int sortingWay = myPrintKthSmallest(new int[]{7, 10, 4, 3, 20, 15},3);
        int setWay = kthSmallestUsingSet(new int[]{7, 10, 4, 3, 20, 15},3);
        int minHeapWay = kthSmallestUsingMinHeap(new int[]{7, 10, 4, 3, 20, 15},3);
        System.out.println(minHeapWay);
    }

    private static int kthSmallestUsingMinHeap(int[] ints, int i) {
        return 0;
    }

    private static int kthSmallestUsingSet(int[] arr, int k){
        Set<Integer> set =  new TreeSet<>();
        for (int item:arr
             ) {
            set.add(item);
        }



        int currentIndex = 0;
        int currentElement = 0;
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext() && currentIndex <= k - 1){
            System.out.println("Current Index " + currentIndex);

            currentElement = iterator.next();
            System.out.println("Current Element " + currentElement);

            currentIndex++;

        }

        return currentElement;
        //complexity nlogn


    }

    private static int myPrintKthSmallest(int[] arr, int i) {
        /**
         * The time complexity of Arrays.sort() method in Java is O(n log n)
         * for primitive types and O(n log n) or O(n log n) * log(n) for objects,
         * where n is the length of the array being sorted.
         * The algorithm used by the Arrays.sort() method is a tuned quicksort,
         * which is a sorting algorithm that has an average time complexity of O(n log n).
         * However, the worst-case time complexity of quicksort is O(n^2),
         * which occurs when the input array is already sorted or nearly sorted.
         * To avoid this worst-case scenario,
         * the Arrays.sort() method uses a dual-pivot quicksort algorithm,
         * which reduces the likelihood of the worst-case scenario occurring.
         * */
        Arrays.sort(arr);
        return arr[i - 1];
        //complexity nlogn

    }


    /**
     * In Java, a Set is a data structure that stores a collection of unique elements.
     * This means that each element can occur only once in the set.
     * The Set interface is part of the java.util package and provides several methods for adding,
     * removing, and querying elements in the set.
     *
     * Some commonly used methods of the Set interface include:
     *
     * add(element) : Adds the specified element to the set if it is not already present.
     * remove(element) : Removes the specified element from the set if it is present.
     * contains(element) : Returns true if the set contains the specified element, otherwise returns false.
     * size() : Returns the number of elements in the set.
     * isEmpty() : Returns true if the set is empty, otherwise returns false.
     * clear() : Removes all elements from the set.
     * There are several implementations of the Set interface in Java, including:
     *
     * HashSet: This implementation uses a hash table to store elements and provides
     * constant-time performance for basic operations like add,
     * remove, and contains, assuming a good hash function is used.
     *
     * TreeSet: This implementation uses a red-black tree to store elements in sorted order,
     * according to their natural ordering or a custom Comparator.
     * The basic operations (add, remove, contains, etc.) have time complexity of O(log n).
     * LinkedHashSet:
     * This implementation is similar to HashSet, but it maintains a doubly-linked list of elements in
     * the order they were inserted, allowing for iteration in insertion order.
     *
     *
     * It's worth noting that Set does not allow duplicate elements,
     * but it doesn't guarantee the order of elements. If you need to maintain the order of elements,
     * you might consider using a List or a LinkedHashSet.*/
}
