package strings;

public class LeftAndRightRotationOfStrings {
    public static void main(String[] args) {

        doLeftRotation("Korir");
        doLeftRotationByDigits("Korir", 2);
        doRightRotation("Korir");

    }

    private static void doLeftRotationByDigits(String word, int k) {
        String ans = new StringBuilder(word.substring(k)) + word.substring(0, k);
        System.out.println("rotation by k digits");
        System.out.println(ans);
    }

    private static void doRightRotation(String word) {
        int length = word.length();
        char[] chars = new char[length];
        char temp = word.charAt(length - 1);
        for (int i = length - 1; i > 0; i--) {
            chars[i] = word.charAt(i - 1);
        }
        chars[0] = temp;
        System.out.println(String.valueOf(chars));
    }

    private static void doLeftRotation(String word) {
        int length = word.length();
        char[] chars = new char[length];
        char temp = word.charAt(0);
        for (int i = 0; i < length - 1; i++) {
            chars[i] = word.charAt(i + 1);
        }
        chars[length - 1] = temp;
        System.out.println(String.valueOf(chars));


    }
}
