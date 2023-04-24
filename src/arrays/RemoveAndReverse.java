package arrays;

import java.util.*;

public class RemoveAndReverse {
    public static void main(String[] args) {
        System.out.println("Please Input String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(removeThenReverse(s));
        scanner.close();
    }

    private static String removeThenReverse(String s) {

        Map hashMap = new HashMap<String,String>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i++){
            if(!hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),s.charAt(i));
                ans.append(s.charAt(i));
            }else{
                hashMap.clear();
            }
        }
        //TODO()

        return ans.toString();
    }





}
