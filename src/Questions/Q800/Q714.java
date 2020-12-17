package Questions.Q800;

public class Q714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if(n < 2) {
            return 0;
        }
//        int buy = -prices[0];
//        int sell = 0;
//        
//        for(int i=0; i<n; i++) {
//            sell = Math.max(sell, prices[i]+buy-fee);
//            buy = Math.max(buy, sell - prices[i]);
//        }
//        
//        return sell;
        
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee); 
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n - 1][0];

    }
}
