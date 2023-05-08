package strings;

import java.util.*;

/**
 * Given a string of lowercase characters from ‘a’ – ‘z’.
 * We need to write a program to print the characters of this string in sorted order.
 * */
public class SortCharacters {
    public static void main(String[] args){
        String chars = "bbccdefbbaa";
        sortChars(chars);
    }

    private static void sortChars(String chars) {
        char[] newChar = chars.toCharArray();
        //or you can use the sorting algorithms like quick sort and their couzins.
        Arrays.sort(newChar);
        System.out.println(newChar);
    }
}
