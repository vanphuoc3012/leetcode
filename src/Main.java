import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if(hashmap.containsKey(second)) {
                result[0] = i;
                result[1] = hashmap.get(second);
            }
            hashmap.put(nums[i], i);
        }
        return result;
    }
}