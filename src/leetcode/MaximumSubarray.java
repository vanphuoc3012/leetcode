package leetcode;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int curSum = 0;

        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxsum = Integer.max(maxsum, curSum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1};

        System.out.println(maxSubArray(nums));
    }
}
