import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3) return result;

        Set<Integer> hashset = new HashSet<>();
        for(int i : nums) hashset.add(i);

        for(int i = 0; i < nums.length - 2; i++) {

            int twoSum = 0 - nums[i];
            for (int j = i+1; j < nums.length - 1; j++) {
                int last = twoSum - nums[j];
                if(hashset.contains(last)) {
                    for(int k = j+1; k < nums.length; k++) {
                        if(nums[k] == last) {
                            List<Integer> num = List.of(nums[i], nums[j], nums[k]);
                            boolean duplicatedList = false;
                            for(List<Integer> l : result) {
                                if(l.containsAll(num) && num.containsAll(l)) {
                                    duplicatedList = true;
                                    break;
                                }
                            }
                            if(!duplicatedList) result.add(num);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        int[] arr1 = new int[]{0,0,0};
        int[] arr2 = new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};

        List<List<Integer>> lists = threeSum(arr2);
        System.out.println(lists);
    }
}


