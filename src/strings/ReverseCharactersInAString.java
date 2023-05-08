package strings;
import java.util.*;

public class ReverseCharactersInAString {
    public static void main(String[] args){
        reverseCharactersMethod1("Faith");
        reverseCharactersMethod2("Faith");
        usingStack("Faith");

    }



    private static void usingStack(String word) {
        Stack charStack = new Stack<Character>();
        int length = word.length();
        for(int i = 0; i < length ; i++){
            charStack.push(word.charAt(i));
        }
        StringBuilder str = new StringBuilder();

        while(!charStack.isEmpty()){
            str.append(charStack.pop());
        }
        System.out.print(str);
        /**
         * time complexity o(n)
         * Space complexity o(n)
         * */
    }

    private static void reverseCharactersMethod2(String word) {
        //String builder has a reverse method.
        StringBuilder str = new StringBuilder(word);
        System.out.println(str.reverse());
        /**
         * time complexity o(n)
         * Space complexity o(n)
         * */

    }

    private static void reverseCharactersMethod1(String word) {
        int length = word.length();
        StringBuilder reversed = new StringBuilder();
        for(int i = length -1 ; i >= 0 ; i-- ){
            reversed.append(word.charAt(i));
        }

        System.out.println(reversed);
        /**
         * time complexity o(n)
         * Space complexity o(n)
         * */
    }
}
