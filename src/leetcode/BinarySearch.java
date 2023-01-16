package leetcode;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
