package arrays;

import java.util.Arrays;

public class MinimumWaitingTime {
    public static void main(String[] args){
        miniMumWaitingTime(new int[]{3,2,1,2,6});
    }

    private static void miniMumWaitingTime(int[] ints) {
        Arrays.sort(ints);
        int ans = 0;
        int currentSum = 0;
        for(int i = 1; i < ints.length; i++){
            //System.out.println(sum);

            currentSum =  currentSum + ints[i - 1];
            ans += currentSum;
        }
        System.out.println(ans);
    }
}
