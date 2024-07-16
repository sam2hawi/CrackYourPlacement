class Solution {
    public int maxProfit(int[] prices) {
       int ans =0; int y =0; int x = Integer.MAX_VALUE;
       for(int i =0; i <prices.length; i++){
             if(prices[i]<x)
             x=prices[i];

             y= prices[i]-x;
             if(ans<y)
             ans=y;
       
           }   
           return ans;
            }
}
