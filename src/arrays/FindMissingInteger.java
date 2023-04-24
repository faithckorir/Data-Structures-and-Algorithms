package arrays;

public class FindMissingInteger {
    public static void main(String[] args) {
        missingInteger(new int[]{1, 2, 4, 6, 3, 7, 8},8);
    }

    private static void missingInteger(int[] arr, int n) {
        int sum = n * (n + 1)/2;

        for (int i:arr
             ) {
            sum  -= i;
        }
        System.out.println(sum);
    }
}
