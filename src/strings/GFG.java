package strings;// Java program to count all distinct
// binary strings with two consecutive 1's
import java.util.*;

public class GFG {

	// Gives count of n length binary
	// strings with consecutive 1's
	public static void countStrings(int n, int ind,
									String str, int[] ans)
	{
		if (ind == n) {
			int count = 0;
			int temp = 0;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == '1') {
					temp++;
				}
				else {
					temp = 0;
				}
				count = Math.max(count, temp);
			}
			if (count >= 2) {
				ans[0]++;
			}
			return;
		}

		countStrings(n, ind + 1, str + "0", ans);
		countStrings(n, ind + 1, str + "1", ans);
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] ans = { 0 };
		countStrings(5, 0, "", ans);
		System.out.println(ans[0]);
	}
}
// This code is contributed by Susobhan Akhuli
