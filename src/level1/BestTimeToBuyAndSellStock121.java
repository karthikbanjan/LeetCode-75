package level1;

public class BestTimeToBuyAndSellStock121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int p: prices) {
            if (p < minPrice) {
                minPrice = p;
            } else if (p - minPrice > maxProfit) {
                maxProfit = p - minPrice;
            }
        }

        return maxProfit;
    }

}
