 public static int findMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minimum seen so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // update max profit
            }
        }
        return maxProfit;
    }