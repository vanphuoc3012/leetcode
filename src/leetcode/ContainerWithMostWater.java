package leetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;

        int h1 = height[p1];
        int h2 = height[p2];
        int h = Math.min(h1, h2);
        int maxWater = (p2 - p1) * h;
        while (p1 < p2) {
            h1 = height[p1];
            h2 = height[p2];
            h = Math.min(h1, h2);
            if(maxWater < (p2 - p1) * h) maxWater = (p2 - p1) * h;
            if(h1 <= h2) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] height = new int[]{1,1};
        System.out.println(container.maxArea(height));
    }

}
