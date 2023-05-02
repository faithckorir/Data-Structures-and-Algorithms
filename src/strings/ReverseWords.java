package strings;

public class ReverseWords {
    public static String reverse(String s) {
        String[] words = s.split(" "); // Split the input string by space
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" "); // Append each word in reverse order
        }
        return reversed.toString().trim(); // Trim the trailing space and return the result
    }
    
    public static void main(String[] args) {
        String s = "Great is tim";
        String reversed = reverse(s);
        System.out.println(reversed); // Output: "world hello"
    }
}
