package strings;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsInAstring {
    //without using split.


    public static void main(String[] args) {
        System.out.println(reverseWords("Tim is Great"));
    }

    private static String reverseWords(String word) {
        ArrayList<String> words = new ArrayList<String>();
        int startOfWord = 0;
        for (int i = 0 ; i < word.length();i++){
            char currentChar = word.charAt(i);
            if(currentChar == ' '){
                words.add(word.substring(startOfWord,i));
                startOfWord = i;
            } else if(word.charAt(startOfWord) == ' '){
                words.add(" ");
                startOfWord = i;

            }
        }
        words.add(word.substring(startOfWord));
        Collections.reverse(words);

        return String.join(" ",words);
    }
}
