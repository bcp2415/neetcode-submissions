class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int low = 100;

        for (int i = 0; i < prices.length; i++) {
            int maybeProfit = prices[i] - low;
            if (maybeProfit > profit) {
                profit = maybeProfit;
            }

            if (prices[i] < low) {
                low = prices[i];
            }
        }

        return profit;
    }
}
