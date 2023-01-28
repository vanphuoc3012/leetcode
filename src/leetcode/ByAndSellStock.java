package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByAndSellStock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int sellDay = prices.length - 1;
        int min = prices[0];
        int buyDay = 0;
        for(int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if(price < min && i < sellDay) {
                min = price;
                buyDay = i;
            } else if(price >= max && i > buyDay) {
                max = price;
                sellDay = i;
            }
        }
        int profit = max - min;
        if (profit < 0) return 0;
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
    }
}
