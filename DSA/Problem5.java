public class Problem5 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }


     //SOLUTION 2
     public static int maxProfit2(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0; // Not enough prices to make a profit
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            int currentPrice = prices[i];
            int potentialProfit = currentPrice - minPrice;
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }
}




