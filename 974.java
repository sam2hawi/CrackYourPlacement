class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans =0;
        int sum =0;
        Map<Integer, Integer> pre = new HashMap<>();
        pre.put(0,1);
        for(int i =0; i<nums.length;i++){
              sum =(sum+ nums[i])%k;
              if(sum <0)sum +=k;
              ans += pre.getOrDefault(sum,0);
              pre.put(sum,pre.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
