package strings;

public class PalindromCheck {
    public static void main(String[] args) {
        String word = "racecar";
        //System.out.println(usingTwoPointer(word));
       // System.out.println(usingReverseMethod(word));
       // System.out.println(usingManachers(word));
        System.out.println(usingRabinKarpMethod(word));
    }

    private static boolean usingRabinKarpMethod(String word) {

        //We first check if the length of the input string is less than 2,
        // and if it is, we return true, because any string of length less than 2 is a palindrome.
        int length = word.length();
        if(length < 2){
            return true;
        }
        //We then initialize our variables for the Rabin-Karp algorithm.
        // We use a prime number as the base for our hash function,
        // and we initialize our hash values for the left and right sides of the string to 0.
        // We also initialize our powers of the prime number to 1.

        int prime = 31;
        int leftHash = 0;
        int rightHash = 0;
        int powOfPrimeLeft = 1;
        int powOfPrimeRight = 1;

        //We then initialize our left and right pointers to the start and end of the string, respectively.

        int left = 0;
        int right = length - 1;

        //We then start looping from both ends of the string,
        // moving inward and updating our hash values and powers of the prime number at each step.
        // We check if the hash values for the left and right sides are equal,
        // and if they are, we check if the substrings on both sides are equal
        // using StringBuilder to reverse the substring on the right side and
        // compare it with the substring on the left side.
        while(left <= right){
            char leftChar = word.charAt(left);
            char rightChar = word.charAt(right);
            leftHash = leftHash * prime + leftChar;
            rightHash = rightHash + rightChar * powOfPrimeRight;
            powOfPrimeLeft *= prime;
            powOfPrimeRight *= prime;
            if (leftHash == rightHash && word.substring(0, left + 1).equals(new StringBuilder(word.substring(right)).reverse().toString())) {
                return true;
            }
            left++;
            right--;
        }


        return false;
    }

    private static boolean usingManachers(String s) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                sb.append("#");
            }
            String t = sb.toString();
            int n = t.length();
            int[] p = new int[n];
            int center = 0, right = 0;
            for (int i = 1; i < n - 1; i++) {
                int mirror = 2 * center - i;
                if (right > i) {
                    p[i] = Math.min(right - i, p[mirror]);
                }
                while (t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
                    p[i]++;
                }
                if (i + p[i] > right) {
                    center = i;
                    right = i + p[i];
                }
            }
            for (int i = 1; i < n - 1; i++) {
                if (p[i] == i) {
                    return true;
                }
            }
            return false;
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
     * 
     * the method has a time complexity of o(n)
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


    /**
     * The Rabin-Karp algorithm and the two-pointer approach are both used to check if a string is a palindrome,
     * but they have different approaches and time complexities.
     *
     * The two-pointer approach starts by comparing the first and last characters of the string,
     * then moves inwards by incrementing the left pointer and decrementing the right pointer
     * until they meet in the middle. This approach has a time complexity of O(n), where n is the length of the string.
     *
     * On the other hand,
     * the Rabin-Karp algorithm uses hashing to check if a string is a palindrome.
     * It computes the hash value of the entire string and also the hash values of all possible substrings of the string.
     * It then checks if any two substrings have the same hash value.
     * If they do, it checks if they are actually equal strings.
     * This algorithm has an average-case time complexity of O(n),
     * where n is the length of the string.
     *
     * In general, the Rabin-Karp algorithm is more efficient than the two-pointer approach for very long strings,
     * because it only needs to compare hash values instead of individual characters.
     * However, for shorter strings,
     * the two-pointer approach may be faster because it doesn't involve the overhead of computing and comparing hash values.
     *
     * */
}
