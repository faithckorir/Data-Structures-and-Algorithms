package strings;

public class SearchForCharacter {
    public static void main(String[] args) {
        String myString = "Hello, world!";
        //search using IndexOf,it returns only the first occurrence of the substring/character
        //time complexity is O(n*m) m being the length of the character
        searchUsingIndexOf('o',myString);
        UsinglastIndexOf('o',myString);
        usingContainsMethod('o',myString);

    }

    private static void usingContainsMethod(char o, String myString) {
        System.out.println(myString.contains(String.valueOf(o)));
    }

    private static void UsinglastIndexOf(char pattern, String myString) {
        int index1 = myString.indexOf(pattern);
        System.out.println(index1);
    }

    private static void searchUsingIndexOf(char pattern,String text) {
        int index1 = text.indexOf('0');
        //it returns -1 if not found
        System.out.println(index1);


    }
}
