class Solution {
    public int maxProfit(int[] prices) {

        int low = 100;
        int high = 0;

        int[] lefts = new int[prices.length];
        int[] rights = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            }
            lefts[i] = low;

            if (prices[prices.length - 1 - i] > high) {
                high = prices[prices.length - 1 - i];
            }
            rights[prices.length - 1- i] = high;
        }

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (rights[i] - lefts[i] > profit) {
                profit = rights[i] - lefts[i];
            }
        }

        return profit;
    }
}
