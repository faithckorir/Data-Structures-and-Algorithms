package arrays;

public class TrappingWaters {
    /**
     * Given an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
     *
     * Examples:
     *
     * Input: arr[] = {2, 0, 2}
     * Output: 2
     * Explanation: The structure is like below.
     * We can trap 2 units of water in the middle gap.
     *
     * Input: arr[]   = {3, 0, 2, 0, 4}
     * Output: 7
     * */
    public static void main(String[] args) {
        //findWaterVolumeUsingTwoArrays(new int[]{3, 0, 2, 0, 4});
        usingTwoPointer(new int[]{3, 0, 2, 0, 4});
    }

    private static void usingTwoPointer(int[] arr) {
        int trappedWater = 0;
        int left =  0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while(left <= right){
            if (arr[left] <= arr[right]) {
                if(arr[left] >= leftMax){
                    leftMax = arr[left];
                }else{
                    trappedWater += leftMax - arr[left];
                }
                left++;

            }else{
                if(arr[right] >= rightMax){
                    rightMax = arr[right];
                }else{
                    trappedWater += rightMax - arr[right];
                }
                right--;

            }
        }


        System.out.println(trappedWater);
    }

    private static void findWaterVolumeUsingTwoArrays(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        int[] rightMax = new int[n];
        rightMax[n -1] = arr[n -1];
        int[] waterVolume = new int[n];
        int result = 0;

        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(arr[i],leftMax[i - 1]);
        }

        for(int i = n -2 ; i >=0 ; i--){
            rightMax[i] = Math.max(arr[i],rightMax[i + 1]);
        }


        for(int i = 0 ; i < n ; i++){
            waterVolume[i] = Math.max(0,Math.min(leftMax[i],rightMax[i]) - arr[i]);
            result += waterVolume[i];
        }

        System.out.print(result);

    }
    }



