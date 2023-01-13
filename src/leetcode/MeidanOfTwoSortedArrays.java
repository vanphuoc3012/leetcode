package leetcode;

import java.util.Arrays;

public class MeidanOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        for(int k = 0; k < arr.length; k++) {
            if (i >= nums1.length) arr[k] = nums2[j++];
            else if (j >= nums2.length) arr[k] = nums1[i++];
            else if (nums1[i] < nums2[j]) arr[k] = nums1[i++];
            else arr[k] = nums2[j++];
        }
        System.out.println(Arrays.toString(arr));
        if(arr.length % 2 == 0) {
            int midIndex = arr.length / 2;
            return (double) (arr[midIndex - 1] + arr[midIndex]) / 2;
        } else {
            return arr[arr.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double x = findMedianSortedArrays(nums1, nums2);
        System.out.println(x);
    }
}
