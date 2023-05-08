package strings;

public class CountStringWithConsecutive1s {
    public static void main(String[] args){
        System.out.println(countStrings(5));
    }

    public static int countStrings(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
