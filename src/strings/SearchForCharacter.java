package strings;

public class SearchForCharacter {
    public static void main(String[] args) {
        String myString = "Hello, world!";
        //search using IndexOf,it returns only the first occurrence of the substring/character
        //time complexity is O(n*m) m being the length of the character
        searchUsingIndexOf('o',myString);
    }

    private static void searchUsingIndexOf(char pattern,String text) {
        int index1 = text.indexOf(pattern);
        System.out.println(index1);

    }
}
