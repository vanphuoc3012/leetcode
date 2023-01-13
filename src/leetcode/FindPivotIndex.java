package leetcode;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return 0;
        }

        int[] sumLeft= new int[nums.length];
        for(int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }

        int[] sumRight = new int[nums.length];

        for(int i = length - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }

        System.out.println(Arrays.toString(sumLeft));
        System.out.println(Arrays.toString(sumRight));

        int pivot = 0;
        while (pivot < length) {
            if(sumLeft[pivot] == sumRight[pivot]) return pivot;
            pivot++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(pivotIndex(arr));
    }
}
