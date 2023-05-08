package strings;

public class PalindromCheck {
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(usingTwoPointer(word));
        System.out.println(usingReverseMethod(word));
    }
/**
 * First, we create a StringBuilder object and call the reverse() method on it, which takes O(n) time.
 * Then, we call the toString() method on the StringBuilder object,
 * which takes O(n) time.
 * Finally, we call the equals() method on the original String object and the reversed String object,
 * which takes O(n) time since it compares
 * each character in the two strings.
 * Therefore, the overall time complexity of the method is O(n) + O(n) + O(n) = O(3n),
 * which simplifies to O(n).
 * */
    private static boolean usingReverseMethod(String word) {
        //create a new string using string builder
        String reversedWord = new StringBuilder(word).reverse().toString();
        if(reversedWord.equals(word)){
            return true;
        }

        return false;
    }

    /**
     * the method has a
     * */
    private static boolean usingTwoPointer(String word) {
        int length = word.length();
        int start = 0;
        int end = length - 1;

        while (start <= end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }


        return true;
    }
}
