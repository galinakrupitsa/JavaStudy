public class MaxProfitDays {
    public int[] maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int minPrice = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minIndex = i;
            }
            else
            {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = minIndex;
                    sellDay = i;
                }
            }
        }
        return new int[] {maxProfit, buyDay, sellDay};
    }
}
