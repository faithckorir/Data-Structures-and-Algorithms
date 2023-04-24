package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionAndIntersection {
    /**
     * Given two sorted arrays, find their union and intersection.
     * Example:
     * Input: arr1[] = {1, 3, 4, 5, 7}
     *         arr2[] = {2, 3, 5, 6}
     * Output: Union : {1, 2, 3, 4, 5, 6, 7}
     *          Intersection : {3, 5}
     * Input: arr1[] = {2, 5, 6}
     *         arr2[] = {4, 6, 8, 10}
     * Output: Union : {2, 4, 5, 6, 8, 10}
     *          Intersection : {6}
     * */
    public static void main(String[] args) {

        unionNIntersectionUsingArrayList(new int[]{1, 3, 4, 5, 7},new int[]{2, 3, 5, 6});
        unionUsingSet(new int[]{1, 3, 4, 5, 7},new int[]{2, 3, 5, 6});

    }

    private static void unionUsingSet(int[] arA, int[] arB) {
        //using Treeset to maintain natural ordering.
        Set<Integer> union = new TreeSet<>();
        for (int item:arA) {
            union.add(item);
        }
        for (int item:arB) {
            union.add(item);
        }

        for (Integer integer : union) {
            System.out.print(integer + " ");
        }


    }

    private static void unionNIntersectionUsingArrayList(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;

        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                union.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                union.add(arr2[j]);
                j++;
            } else{
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                j++;
                i++;
            }
        }

        while(i < m){
            union.add(arr1[i]);
            i++;
        }
        while(j < n){
            union.add(arr1[j]);
            j++;
        }
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

    }
}
