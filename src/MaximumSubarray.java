
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            maxsum = Integer.max(maxsum, curSum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1};

        System.out.println(maxSubArray(nums));
    }
}
