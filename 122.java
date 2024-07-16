class Solution {
    public int maxProfit(int[] prices) {
        int s= prices[0];
        for(int i =1; i<prices.length;i++){
            if(s<prices[i])
            max+=prices[i]-s;
            s=prices[i];
        }
        return max;
    }
}
