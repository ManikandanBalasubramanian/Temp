package com.leetcode.medium;

public class BestTimeToBuySellStockWithTransaction {

    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1)
            return 0;
        int[] buy = new int[prices.length];
        int[] hold = new int[prices.length];
        int[] skip = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0] = 0 - prices[0];
        hold[0] = 0 - prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy[i] = Math.max(skip[i - 1], sell[i - 1]) - prices[i];
            hold[i] = Math.max(buy[i - 1], hold[i - 1]);
            skip[i] = Math.max(skip[i - 1], sell[i - 1]);
            sell[i] = Math.max(buy[i - 1], hold[i - 1]) + prices[i] - fee;
        }
        int max = Math.max(buy[prices.length - 1], hold[prices.length - 1]);
        max = Math.max(skip[prices.length - 1], max);
        max = Math.max(sell[prices.length - 1], max);
        return Math.max(max, 0);
    }
}