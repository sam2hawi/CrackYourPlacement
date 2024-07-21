class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        int mid = nums[nums.length/2];
        for(int c :nums ){
            count += Math.abs(mid-c);
        }
        return count;
    }
}
