package strings;

import java.util.ArrayList;
import java.util.List;

public class KMP {

    public static int[] computeLPSArray(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    /**
     * Certainly! Here's an explanation of the code:
     *
     * The kmpMatch function takes two arguments:
     * a string text and a string pattern.
     * It returns a list of indices where the pattern is found within the text.
     *
     * The function first creates a failure array of the same length as the pattern.
     * This array is used to store the length of the longest proper prefix of the pattern
     * that is also a suffix of the pattern.
     * For example, if the pattern is "abab",
     * the failure array would be [0, 0, 1, 2],
     * because "a" and "ab" are both prefixes and suffixes of "abab",
     * but "aba" is not a proper prefix of the pattern.
     *
     * Next, the function initializes two pointers:
     * i for the text and j for the pattern.
     * It then enters a loop where it compares characters of text and pattern. If the characters match, it increments both pointers. If j reaches the end of the pattern, a match has been found and the index of the match is added to the result list. If the characters don't match and j is not 0, the function sets j to the value of failure[j - 1] and continues the loop. This is where the KMP algorithm is more efficient than brute force, because it avoids rechecking characters that have already been matched.
     *
     * Once the loop is complete, the function returns the result list containing the indices where the pattern was found in the text.
     * */

    public static List<Integer> KMPMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLPSArray(pattern);
        List<Integer> matchIndices = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                matchIndices.add(i - j);
                j = lps[j - 1];
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return matchIndices;
    }

    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "ababd";
        List<Integer> matchIndices = KMPMatch(text, pattern);
        System.out.println("Pattern found at indices: " + matchIndices);
    }
}
