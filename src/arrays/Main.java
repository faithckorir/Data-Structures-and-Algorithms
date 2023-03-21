package arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,13,4,5,6};
        System.out.println(getMaxNumber(arr));
    }

    private static int getMaxNumber(int[] arr){
        int size = arr.length;
        int left = 0;
        int right = size -1;
        int max = Integer.MIN_VALUE;

        while(left < right){
            if(arr[left] > max){
                max = arr[left];
            }
            if(arr[right] > max){
                max = arr[right];
            }
            left++;
            right--;

        }
        return max;

    }
}
