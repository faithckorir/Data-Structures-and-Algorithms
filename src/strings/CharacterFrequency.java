package strings;
import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args){
        countFrequency("geeksforgeeks");
    }

    private static void countFrequency(String word) {
        char[] chars = word.toCharArray();
        Map<Character,Integer> countMap = new HashMap();
        for(char i: chars){
            if(countMap.containsKey(i)){
               int count =  countMap.get(i) + 1;
               countMap.put(i,count);
            }else{
                countMap.put(i,1);
            }
        }
        System.out.println(countMap);
    }
}
