import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        for(int i = 1; i <= nums.length; i++) {
            if(!hashmap.containsKey(i)) return i;
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int[] arr = new int[]{7,8,9,11,12};
        System.out.println(firstMissingPositive.firstMissingPositive(arr));
    }
}
